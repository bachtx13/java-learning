/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1139;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Book {
    String bookName, nickname;
    Date publishDate ;
    

    public Book() {
    }

    public Book(String bookName, String nickname, Date publishDate) {
        this.bookName = bookName;
        this.nickname = nickname;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhập tên sách: ");
        bookName = scan.nextLine();
        
        System.out.println("Nhập nickname");
        nickname = scan.nextLine();
        if(!DataMgr.getInstance().checkExitAuthor(nickname)){
            //nhap thong tin mới cho tác giả
            Author author = new Author(nickname);
            author.inputWithoutNickname();
            
            DataMgr.getInstance().authorList.add(author);
        
        }
        
        System.out.println("Nhap ngay xuat bản dd/mm/yyyy: ");
        publishDate = Utinity.convertStringToDate(scan.nextLine());
    }
    
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", nickname=" + nickname + ", publishDate=" + Utinity.convertDateToString(publishDate) + '}';
    }
    
}
    