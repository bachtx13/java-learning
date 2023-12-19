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
        // khi nhập xong muốn biến thành chuỗi để quản lý 
        //-> quản lý tốt hơn , chứa chuỗi kí tự , thì nên dùng stringbuilder buffer,
        //2 thành này sinh ra để quản lý chuỗi & kí tự ,
        //->sau nó chúng giúp chungsta nối chuỗi lại 
        //builder quản lý k gian tốt , buffer quản lý không gian sẽ bị thừa

        System.out.println("=========Builder==========");
        StringBuilder bulBuilder = new StringBuilder();
        bulBuilder.append("hello");
        bulBuilder.append("word");
        bulBuilder.append('!');

        // lấy kết quả 
        System.out.println(bulBuilder.toString());
        System.out.println("=========Buffer==========");
        StringBuffer buffer = new StringBuffer();
        buffer.append("hello");
        buffer.append("word");
        buffer.append('!');

        // lấy kết quả 
        System.out.println(buffer.toString());

    }
}
