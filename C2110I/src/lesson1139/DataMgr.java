/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1139;

import java.util.ArrayList;
import java.util.List;
import static lesson1139.Main.scan;

/**
 * DataMgr -> chỉ cần tạo duy nhất 1 đối tượng(object)-> từ class object dataMgr
 * -> ngta gọi kiểu này là singleton là lớp đtg -> chỉ cần tạo duy nhất 1 đối tượng(object)
 * đối tượng là VD NHƯ Book book = new Book();
 * @author admin
 */
    
// sau đó ngta sửa public thành private
    public class DataMgr {
    // những cái này từ main chuyển sang
//    public static List<Book> bookList;
//    public static List<Author> authorList;
    // khi chuyển sang đây thành dữ liệu thường
    List<Book> bookList;
    List<Author> authorList;
    static DataMgr instance = null;
    
    private DataMgr(){
        // Ý tưởng là ngta sẽ dùng cái  lớp đối tượng để quản lý toàn bộ đầu dữ liệu độc lập
         bookList = new ArrayList<>();
        authorList = new ArrayList<>();
    }
    
    public static DataMgr getInstance(){
        // ở đây nó đang kiểm tra nếu bằng null nó mới khởi tạo 
        // nó chỉ gọi lần đầu thôi
        // sau nó k vào nx 
        if(instance == null ){
            instance = new DataMgr();
        }
        return instance;
    }
    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
    
    public void inputBook() {
        System.out.println("Nhập số sách cần thêm");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.input();

            bookList.add(book);
        }
    }

    public void displayBook() {
        System.out.println("=========Thông tin sách là==============");
        bookList.forEach((book) -> {
            book.display();
        });
    }

    public void inputAuthor() {
        System.out.println("Nhập tác giả cần thêm ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Author author = new Author();
            author.input();
            
            authorList.add(author);
        }
    }

    public void findBookByAuthor() {
        System.out.println("Tìm quấn sách của tác giả    ");
        String nickname = scan.nextLine();
        
        for (Book book : bookList) {
            if(book.getNickname().equalsIgnoreCase(nickname)){
                book.display();
            }
        }
    }
    
    public boolean checkExitAuthor(String nickname){
        if(authorList.isEmpty()) return false;
        for (Author author : authorList) {
            if(author.getNickname().equalsIgnoreCase(nickname)){
                return true; 
                // neeus trung la return true da ton tai
            }
        }
        return false;
        // chuwa ton tai
    }
}
