/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3_1091_phan2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class DataController {

    // datacontroller  là bộ điều khiển dữ liệu 
    // cả cái dự ái có 1 đối tượng datacontroller thôi nên biến nó thành 1 sinmenthn
    // List<Book> bookList = new ArrayList<>();
    List<Book> bookList;

    // b3 tạo biến sau đó b4 đổi public thành private
    private static DataController instance = null;

    // b2: tạo ra hàm tạo của Datacontroller sau ĐÓ tách booklist vô hàm tạo
    private DataController() {
        bookList = new ArrayList<>();
    }

    //b4
    public static DataController getinstance() {
        if (instance == null) { // neeus instance = null moi khoi tao gthieu
            instance = new DataController();
        }
        return instance;
    }

    // hàm nhập
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số sách cần thêm: ");
        int n = Utility.scanInt(scan);
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.input();

            // SAU KHI nhập xong add phần tử vô mảng
            bookList.add(book);
        }
    }

    public void display() {
        System.out.println("Thong tin sach: ");
        bookList.forEach((book) -> { // cu phap namda
            book.display();
        });
    }

    public void sortByAuthorName() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorName().compareToIgnoreCase(o2.getAuthorName());
            }

        });
    }

    public void saveBinaryFile() {
        //1.Thiết lap trang thai luu file
        Scanner scan = new Scanner(System.in);
        System.out.println("Lựa chọn cách ghi: ");
        System.out.println("1. Lưu mới");
        System.out.println("2.Lưu bổ sung");
        System.out.println("Chọn: ");
        int choose = Utility.scanInt(scan);

        boolean status = true;// lưu mới
        if (choose == 1) {
            status = false;
        }

        //Thực hiện lưu file
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("data.obj", status);
            oos = new ObjectOutputStream(fos);

//            oos.writeObject(bookList); // lưu theo list(mảng)
            for (Book book : bookList) {// lưu theo kiểu object
                oos.writeObject(book);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void saveTextFile() {
        //1.Thiết lap trang thai luu file
        Scanner scan = new Scanner(System.in);
        System.out.println("Lựa chọn cách ghi: ");
        System.out.println("1. Lưu mới");
        System.out.println("2.Lưu bổ sung");
        System.out.println("Chọn: ");
        int choose = Utility.scanInt(scan);

        boolean status = true;// lưu mới
        if (choose == 1) {
            status = false;
        }

        //Thực hiện lưu file
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("data.txt", status);
            for (Book book : bookList) {
                String line = book.getFileLine();

                byte[] data = line.getBytes("utf8");

                fos.write(data);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void zipFile() {

    }

    public void readBinaryFile() { // ddocj file nhi phan
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("data.obj");
            ois = new ObjectInputStream(fis);
            
            while (true) {   
                 Book book = null;
                try {
                     book = (Book) ois.readObject();
                } catch (Exception e) {
                    break;
                }
               
                // 1 khi ddax ddoc thanh cong thi add vio
                bookList.add(book);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
