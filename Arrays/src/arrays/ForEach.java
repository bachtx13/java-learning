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
public class ForEach {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] friend = {"Ha", "Tho", "Trung", "Nhi"};
        float[] marks = {6.5f, 7.5f, 9.2f, 10.5f};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("friend [" + i + "] =" + friend[i]);
        }
        System.out.println("================================");
        for (float mark : marks) {
            mark = 2 * mark;
            System.out.println(mark);
//            if(mark == 9.2f){
//                break;
//            }
        }
        System.out.println("==========");      
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("====================");
        for (String friends : friend) {
            System.out.println(friends);
        }
        
        int sum=0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
        
        //Lap tren mang 2 chieu
        System.out.println("Lap tren mang 2 chieu");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int[] m : matrix) {
            for (int i : m) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        
    }
}
