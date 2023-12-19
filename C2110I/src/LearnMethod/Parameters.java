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
public class Parameters {

    public static void main(String[] args) {
        int sum = add(200, 1);
        int a= 111;
        System.out.println(sum);
    
     String[] arr = {"Ha", "Trang" , "Nhi" , "Huong"};
     showInFo(arr, a);
     
//        System.out.println("info = " + showInfo);

        addMultil(25, 25f, 65, 65f, 17.12f);
    }

    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void showInFo(String[] str, int number) {
        
    }
    
    public static void addMultil(float...args) {
        float sum = 0;
        for (float arg : args) {
            sum += arg;
        }
        System.out.println("Sum = " + sum);
    }
    
    
}
