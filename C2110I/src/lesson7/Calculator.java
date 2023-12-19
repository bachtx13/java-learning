/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

/**
 *
 * @author admin
 */
public class Calculator {

    public static float cong(float x, float y) {
        return x + y;
    }

    public static float tru(float x, float y) {
        return x - y;
    }

    public static float nhan(float x, float y) {
        return x * y;
    }

    public static float chia(float x, float y) throws CalculatorException{

        if (y == 0) {
//            System.out.println("Khong dc phep chi cho 0");
//            return 0;
            throw new CalculatorException(x, y, "kHONG DC PHEP CHIA CHO 0");
        }
        return x / y;
    }
}
