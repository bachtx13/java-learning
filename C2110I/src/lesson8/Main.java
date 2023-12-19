/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class Main {
    @FunctionalInterface // thông báo cho ngta biết mình đang dùng cú pháp labda
     // tạo interface // trong interface k theer tao doi tg truc tiep trong do
    interface IMessage {
        void onMessage();
    }
    
    interface  IMessage3{
        void onMessage3(String s1, String s2);
    }
    interface IMessage2 {
        void onMessage();
        void onMessage2();
    }

    // cái này tái sử dụng đc
    static class OMessage implements IMessage {

        @Override
        public void onMessage() {
            System.out.println(" Hello Word!!!!");
        }
     //================================================//
    }

    public static void main(String[] args) {
        //Item 1: -For
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // đây là cú pháp labda=> giúp chương trình run nhanh hơn
        list.forEach((v) -> {
            System.out.println(v);
        });

        // item 2: - Tìm hiểu hàm tạo trong labda
        //Khởi tạo đối tượng từ interface-> IMessage
        // lop nay k tái sử dụng đc nên chỉ sử dụng được 1 lần 
        IMessage m = new IMessage() {
            @Override
            public void onMessage() {
                System.out.println("Hello word!!!!!");
            }
        };
        m.onMessage();
        
        // cái này tái sử dụng đc 
        // KHỞI TẠO từ 1 class object
        OMessage o = new OMessage();
        o.onMessage();
        
        
        //Khởi tạo đối tượng từ interface-> IMessage
        // lop nay k tái sử dụng đc nên chỉ sử dụng được 1 lần 
        IMessage m2 = () -> {
            System.out.println("Hello2  word2!!!!!");
        };
        m2.onMessage();
        
        // cách ngắn gọn hơn
        IMessage m3 = () ->System.out.println("Hello3  word3!!!!!");
        m3.onMessage();
        
        
        IMessage2 M11 = new IMessage2() {
            @Override
            public void onMessage() {
                System.out.println("--M1---");
            }

            @Override
            public void onMessage2() {
                System.out.println("--M2---");
            }
        };
        M11.onMessage();
        M11.onMessage2();
        
        IMessage3 m33 = (String s1, String s2) -> {
            System.out.println("s1 ="+ s1+",s2 =" + s2);
        };
        m33.onMessage3("123", "dsda");
        
         m33 = ( s1,  s2) -> {
            System.out.println("s1 ="+ s1+",s2 =" + s2);
        };
        m33.onMessage3("123", "dsda");
        
        System.out.println("==========================Tream--===============");   
        //TREAM
        // hiển thị dữ liệu theo kiểu tream
        System.out.println("=======T1====");
        //DÙNG 1 LUỒNG
        Stream st1 =list.stream();
        st1.forEach(System.out::println);
        
        System.out.println("=======T2====");
        // ĐA lUÔNG
        // dùng paralle.. khi k quan trọng hiển thị thứ tự đầu ra 
        Stream st2 =list.parallelStream();
        st2.forEach(System.out::println);
        
        
        //Tìm hiểu về pattern express
        //Ví dụ : chuỗi s->dữ liệu đầu vào . kiểm tra xem s có chứa 1 chuỗi
        //p (sinh đc theo quy luật sau: aabac, trong đó a là các kí tự chạy a-> z gồm1->4 ký tự , b: 0->9 gôm 2-> 5 ký tự)
         String s ="xin chào abc15kk adsda ôewud ádoasd";
         Pattern pattern = Pattern.compile("[a-z]{1,4}[a-z]{1,4}[0,9]{2,5}[a-z]{1,4}", Pattern.CASE_INSENSITIVE);
         Matcher matcher = pattern.matcher(s);
         boolean matchFound = matcher.find();
         if(matchFound){
             System.out.println("Tim thay");
         }else{
             System.out.println("Khong tim thay");
         }
    
    }
}
