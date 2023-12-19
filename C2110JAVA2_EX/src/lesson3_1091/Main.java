/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3_1091;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Main {

    static Scanner scan = new Scanner(System.in);
    static List<Book> bookList;

    public static void main(String[] args) {
        bookList = new ArrayList<>();;
        Book book = new Book();
        int choose;

        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    sortByAuthorName();
                    display();
                    break;
                case 4:
                    saveStudents();
                    break;
                case 5:
                    readFileBooks();
                    break;
                case 6:
                    System.out.println("Exit!!!!!!!");
                    break;

            }
        } while (choose != 6);
    }

    static void showMenu() {
        System.out.println("1. Nhập thông tin N quấn sách");
        System.out.println("2. Hiển thị thông tin sách");
        System.out.println("3. Sắp xếp theo tên tác giả");
        System.out.println("4. Lưu thông tin mỗi quyển sách vào file data.txt theo định dạng (ten sách, tác giả, giá bán, ngày xuất bản, nhà xuất bản) mỗi quyển sách trên một dòng");
        System.out.println("5. Đọc dữ liệu từ file data.txt và hiển thị ra màn hình");
        System.out.println("6. Thoát");
        System.out.println("choose: ");
    }

    private static void input() {
        System.out.println("Số quyển sách cần nhập: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Book b = new Book();
            b.input();
            bookList.add(b);
        }
    }

    private static void display() {
        System.out.println("Hien thi thong tin sach la :");
        for (Book book : bookList) {
            book.display();
        }
    }

    private static void sortByAuthorName() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorName().compareToIgnoreCase(o2.getAuthorName());
            }

        });
    }

    static void saveStudents() {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("data.txt", false);
            for (Book s1 : bookList) {
                String line = "\n" + s1.getFileLine();
                try {
                    byte[] data = line.getBytes("utf8");
                    try {
                        fos.write(data);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private static void readFileBooks() {
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader("data.txt");
            bufferedReader = new BufferedReader(reader);
            
            String line;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    if (!line.isEmpty()) {
                        Book b1 = new Book();
                        b1.parseFileLine(line);

                        bookList.add(b1);
                    }
                    System.out.println(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
//        for (Book b2 : bookList) {
//            System.out.println(b2);
//        }

    }
}
