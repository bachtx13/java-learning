/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Datacontrolier<E> {

    //tao generic
    List<E> elementData;

    public Datacontrolier() {
        elementData = new ArrayList<>();

    }

    public void add (E e){
        elementData.add(e);
    }
    
    public void showData(){
        for (E e : elementData) {
            System.out.println(e);
        }
    }
}
