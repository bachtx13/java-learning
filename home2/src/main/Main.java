/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.println("Enter number: ");
            number = scan.nextInt();
        } while (number < 0);

        while (number != 0) {
            int digit = number % 10;
            if (new Main().isPrime(digit)) {
                sum += digit;
            }

            number = number / 10;
        }
        System.out.println("rs =" + sum);
    }
}
