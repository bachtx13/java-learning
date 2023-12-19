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
public class MultiDimensionArray {

    public static void main(String[] args) {
        //khai bao
        boolean[][] bools;
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        //cach 2: 5 la so hang, 9 la so cot trong 1 hang
        bools = new boolean[5][9];
        bools[0][0] =true;
        bools[2][8] = false;
        
        
        matrix[0][2]=-666;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
