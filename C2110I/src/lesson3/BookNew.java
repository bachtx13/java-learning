/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author admin
 */
public class BookNew {

    String name;
    String authorName;
    float price;
    String nxb;
    String yearPublish;

    public BookNew() {
    }

    public BookNew(String name, String authorName, float price, String nxb, String yearPublish) {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
        this.nxb = nxb;
        this.yearPublish = yearPublish;
    }
    
    public void input(){
        System.out.println("Nhap dữ liệu cho thuộc tính : ");
    }
    
    public void display(){
        System.out.println("Hiển thị thông tin danh sách :");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price < 0){
            System.err.println("Nhap gia sai-> yêu câu price >0");
        }else{
            this.price = price;
        }
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(String yearPublish) {
        this.yearPublish = yearPublish;
    }
    
    
}
