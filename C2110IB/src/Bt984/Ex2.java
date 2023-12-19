/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt984;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ex2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            try{
                arr[i] = input.nextInt();
                if(arr[i]>=100){
                    throw new Exception();
                }
            }catch( Exception e ){
                System.out.print("Mang vua nhap la: ");
                for(int j=0;j<i;j++){
                    System.out.print(arr[j]+" ");
                }
                break;
            }
        }
    }
}
