/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author admin
 */
public class Test03 {
    public static void main(String[] args) {
        int x, y;
        float k;
        String s1 = new String("dasa"); // không nen khai bao
        String s2 = new String("dasa");// không nen khai bao
        String ss ="aaaa"; // khai báo tn quan lý tốt hơn
        
        // xu ly chuỗi lớn hay cộng chuỗi thì dùng 
        StringBuilder builder = new StringBuilder();
        builder.append("ads");
        builder.append("1334");
        builder.append("đâss");
        builder.append("0988");
        
        //in ra dùng tostring
        System.out.println(builder.toString());

        StringBuffer buffer = new StringBuffer();
        buffer.append("ads");
        buffer.append("1334");
        buffer.append("đâss");
        buffer.append("0988");
        
        System.out.println(buffer.toString());
    }
}
