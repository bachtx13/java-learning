/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnMethod;

/**
 *
 * @author admin
 */
public class LearnMethod {

    public static void main(String[] args) {
        int a = 66, b = 22;

        int tong = add(a, b);
        System.out.println("tổng = " + tong);

        int numbers[] = {1, 3, 5, 2, 4};
        float avg = average(numbers);
        System.out.println("Trung binh cong: " + avg);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float average(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (float) sum / arr.length;
    }
}
