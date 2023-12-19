
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
public class Car implements ICar {

    String name, producer, year;
    float rootprice;
    int seat;

    public Car() {
    }

    public Car(String name, String producer, String year, int seat, float rootprice) {
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.rootprice = rootprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public float getRootprice() {
        return rootprice;
    }

    public void setRootprice(float rootprice) {
        this.rootprice = rootprice;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập tên");
        name = scan.nextLine();

        System.out.println("Producer: ");
        producer = scan.nextLine();

        System.out.println("Year:");
        year = scan.nextLine();

        try {
            System.out.println("rootPrice: ");
            rootprice = Float.parseFloat(scan.nextLine());
        } catch (NumberFormatException e) {
        }
        
        try {
            System.out.println("seat: ");
            seat = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
        }
    }

    @Override
    public float calculateTax() {
        if (seat <= 7) {
            return rootprice * 0.6f;
        }
        return rootprice * 0.7f;
    }

    @Override
    public void getInfor() {
        System.out.printf(" %s car produced by %s in %s has %d seats with the total price is %f $. Variable includes :name of the car, the name of the manufacturer, year of production, seats and TotalPrice", name, producer, year, seat, calculatePrice());
    }

    @Override
    public float calculatePrice() {
        return rootprice + calculateTax();
    }

}
