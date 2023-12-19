/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson0;

/**
 *
 * @author admin
 */
public abstract class Animal implements IRunning{
    String name, foodType;

    public Animal() {
    }

    public Animal(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    
    public abstract void showSound();
    
    @Override
    public void onRunning() {
        System.out.println("Animal Irunning");
    }
    
    
}
