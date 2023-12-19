
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class LuxuryCar extends Car{
     float specialRate;

    public LuxuryCar() {
    }

    public LuxuryCar(float specialRate, String name, String producer, String year, int seat, float rootprice) {
        super(name, producer, year, seat, rootprice);
        this.specialRate = specialRate;
    }

    @Override
    public float calculatePrice() {
        return  getRootprice() + calculateTax() + getRootprice() * specialRate;
    }
    
    public  float calculatePrice(float transportCost){
        return calculatePrice() +transportCost; //Chi phí chuyển giao 
    }

    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        
        
        try {
            System.out.println("specialRate: ");
            specialRate = Float.parseFloat(scan.nextLine());
        } catch (NumberFormatException e) {
        }
    }
    
    
    
     
    
    
}
