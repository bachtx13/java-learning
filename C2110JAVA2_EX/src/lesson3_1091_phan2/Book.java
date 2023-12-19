/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3_1091_phan2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Book implements Serializable
{
     String bookName;
    String authorName, producer;
    int price, produceDate;

    public Book() {
    }

    public Book(String bookName, String authorName, String producer, int price, int produceDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.producer = producer;
        this.price = price;
        this.produceDate = produceDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(int produceDate) {
        this.produceDate = produceDate;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter bookName: ");
        bookName = scan.nextLine();
        
        System.out.println("Enter authorName: ");
        authorName = scan.nextLine();
        
        System.out.println("Enter producer: ");
        producer = scan.nextLine();
        
        System.out.println("Enter price: ");
        price = Utility.scanInt(scan);
        
        System.out.println("Enter produceDate: ");
        produceDate = Utility.scanInt(scan);
    }
    
    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", authorName=" + authorName + ", producer=" + producer + ", price=" + price + ", produceDate=" + produceDate + '}';
    }
    
    public String getFileLine() {
        return  bookName + ", " + authorName + "," + producer + "," + price + "" + produceDate + "\n" ;
    }
     
    public void parseFileLine(String line){
        String[] params = line.split(",");
        bookName = params[0];
        authorName = params[1];
        producer = params[2];
        price =Integer.parseInt(params[3]);
        produceDate =Integer.parseInt(params[4]);
                
    }
}
