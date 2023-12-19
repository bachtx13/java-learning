/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author admin
 */
public class OneDiMensionArray {

    public static void main(String[] args) {
//        Tao bien mang kieu int luu tru gia tri so, ten la number
        int[] numbers = {1, 2, 3, 4, 5};
        String[] friend = {"Ha", "Tho", "Trung", "Nhi"};
        float[] marks = {6.5f, 7.5f, 9.2f, 10.5f};

//        System.out.println("Do dai mang numbers: " + numbers.length);
//        System.out.println("Do dai mang numbers: " + friend.length);
//        System.out.println("Do dai mang numbers: " + marks.length);
//        
//        //Laays gtri phan tu dau tien
//        System.out.println(friend[2]);
        
        for (int i = 0; i < friend.length; i++) {
            System.out.println("friend [" + i +"] =" + friend[i]);
        }
//        CẤP PHÁT MẢNG
//        int[] array = new int[100];
//        System.out.println(array[0]);
//        System.out.println(array[10]);
//        
//        boolean[] bools = new boolean[200];

    }
}
