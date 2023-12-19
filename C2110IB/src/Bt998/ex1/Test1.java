/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt998.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Test1 {
    public static void main(String[] args) {
        Computer com = new Computer();
        List<Computer> computerList = new ArrayList<>();
        
        
        Computer c = new Computer();
        c.input();
        c.display();
        
        Computer c1 = new Computer("112",false,"no rat dep");
        Computer c2 = new Computer("113",false,"no rat dep");

        
        c1.display();
        c2.display();
    }
}
