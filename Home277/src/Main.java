/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        String str = "Minh la Ha Day ";

        //Method length () trả về độ dài của chuỗi
        int length = str.length();
        System.out.println(length);

        //Method charAt() Trả về kí tự tại vị trí chỉ định
        System.out.println(str.charAt(2));

        //Method concat("") : Nối 1 chuỗi vào cuối 1 chuỗi khác
        System.out.println(str.concat("lalala"));

        //Method compareTo Phương thức compareTo() so sánh các chuỗi cho trước 
        //với chuỗi hiện tại theo thứ tự từ điển. Nó trả về số dương, số âm hoặc 0.
        System.out.println(str.compareTo("lalala"));

        //  Method indexOf: Trả về vị trí xuất hiện đầu tiên của chuỗi được chỉ định trong một chuỗi
        System.out.println(str.indexOf("i"));

        // Trả về vị trí xuất hiện cuối cùng được tìm thấy của chuỗi được chỉ định trong một chuỗi
        System.out.println(str.lastIndexOf("H"));

        //Trả về một chuỗi mới trong đó các giá trị được chỉ định đã đã được thay thế	
        System.out.println(str.replace('y', 'i'));

        //Trả về một chuỗi mới được cắt ra từ chuỗi đã cho	
        System.out.println(str.substring(2, 8));

        //Phương thức toString() trả về chuỗi đại diện của đối tượng.
        Integer lengths = 5;
        System.out.println(lengths.toString());
        
        //Loại bỏ khoảng trắng từ cả hai đầu của một chuỗi	
        String str1 = "Hello";
        System.out.println(str1.trim());
        
        //Biến chuỗi thành in thường 
        String word1 = "Hellaaaa";
        String word3 = word1.toLowerCase();
        System.out.println("word3 = " + word3 );
        
        String word4 = "Haha";
        String word5 = word1.toUpperCase();
        System.out.println("word5 = " + word5 );
        
        

    }
}
