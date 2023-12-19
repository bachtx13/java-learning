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
public class CalculatorException extends Exception {

    float x, y;

    public CalculatorException(float x, float y) {
        this.x = x;
        this.y = y;
    }

    CalculatorException(float x, float y, String khong_dc_phep_chia_cho_0) {

    }

    public void showMsg() {
        System.out.println("x = " + x + ", y = " + y + "," + getMessage());
    }

}
