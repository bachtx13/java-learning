/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        //testFile();
        //Test chuong trinh Nghi file
        //saveFile(); -> LƯU SẴN CÓ
        //saveFile2(); -> nhập vào chuỗi rồiluu
        //readFile();
         readFile2();
        //Viết 1 chương trình Quản lý sinh viên -> lưu thông tin sinh viên vào file
//        saveStudents();
//        saveStudents();
//        readStudent();

    }

    static void readStudent() {
        List<Student> studentList = new ArrayList<>();

        FileReader reader = null;
        BufferedReader bufferedReader = null;  // dùng cái này phải gọi đến thư viên FileReader reader = null;
        // buffered.. HỖ TRỢ ĐỌC THEO DÒNG
        try {
            reader = new FileReader("Students.txt");
            bufferedReader = new BufferedReader(reader);

            String line;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    if (!line.isEmpty()) {// nếu #rỗng mới phân tích chuỗi

                        Student std = new Student();
                        std.parseFileLine(line);

                        studentList.add(std);
                    }

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
        // kthuc ctrinh duyet qua 
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    static void saveStudents() {
        // Viết chương trình nhập thông tin sinh viên 
        List<Student> studentList = new ArrayList<>();
        // Fake data
        studentList.add(new Student("A", "Nam", "Ha Noi", "R001", 20));
        studentList.add(new Student("B", "Nữ", "Ha Noi", "R002", 10));
        studentList.add(new Student("C", "Nam", "Thai Binh", "R003", 12));
        studentList.add(new Student("D", "Nữ", "Ha Noi", "R004", 19));
        studentList.add(new Student("E", "Nam", "HCM", "R005", 22));

        //save file
        //Giải pháp lưu file
        FileOutputStream fos = null;

        try {
            //FileOutputStream là hàm lưu file
            // trong ngoặc là đặt tên cho nó
            //true là nối thêm , false là ghi đè
            fos = new FileOutputStream("Students.txt", false);
            for (Student s1 : studentList) {
                String line = "\n" + s1.getFileLine();
                // save line vô file
                byte[] data = line.getBytes("utf8"); // ép kiểu
                fos.write(data);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally { // finally là nơi giải phóng tài nguyên 
            // dù thành công hay thât bại cx vào finally giải phóng tài nguyên
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    static void readFile2() {
        // dùng đến thằng này thì nó mặc định là đọc utf8 lun 
        FileReader reader = null;
        BufferedReader bufferedReader = null;  // dùng cái này phải gọi đến thư viên FileReader reader = null;
        // buffered.. HỖ TRỢ ĐỌC THEO DÒNG
        try {
            reader = new FileReader("Vidu.txt");
            bufferedReader = new BufferedReader(reader);

            String line;
            try {
                while ((line = bufferedReader.readLine()) != null) {
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

    }

    static void readFile() {
        //B1: dùng bộ thư viện:fileInputStream
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("vidu.txt");
            // đọc file
            // nếu muốn đọc  chuẩn  thì dùng bulder
            StringBuilder builder = new StringBuilder();
            int code;
            while ((code = fis.read()) != -1) { // đọc đến khi hết chuỗi trả về -1 là kết thúc
                builder.appendCodePoint(code);

            }
//            int code = fis.read(); // trả về bảng mã aski
            // và nếu muốn in chuỗi ý ra  thì phải ép kiểu
//            System.out.println((char) code);  
            System.out.println(builder.toString());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    static void saveFile2() {

        // về phần lưu file các bạn dùng thư viện gì
        // thứ 1: dùng fileOutputStream 
        FileOutputStream fos = null;

        /**
         * bài toán khi nhập chuỗi vào bàn phím-> save file -> kết thúc khi ghi
         * chuỗi là Y
         */
        Scanner scan = new Scanner(System.in);

        try {
            //FileOutputStream là hàm lưu file
            // trong ngoặc là đặt tên cho nó
            //true là nối thêm , false là ghi đè
            fos = new FileOutputStream("vidu.txt", true); // LUỒNG ĐỂ ghi file
            String str;
            do {
                System.out.println("chuỗi cần thêm vào File:");
                str = "\n" + scan.nextLine();
                // còn đây là muốn ghi chuõi gì biên nó về dạng byte thôi
                byte[] data = str.getBytes("utf8");
                fos.write(data);
            } while (!str.equalsIgnoreCase("N"));

//            String str = "Sinh viên aptech 123";
            // để lưu chuỗi này vào file
            // Bước 1:  chuyển chuỗi đấy về dạng byte
//            byte[] data = str.getBytes("utf8");// truyền vào utf8 để lưu cả tiếng việt
//            // sau đó truyền data
//            fos.write(data); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally { // finally là nơi giải phóng tài nguyên 
            // dù thành công hay thât bại cx vào finally giải phóng tài nguyên
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    static void saveFile() {
        // về phần lưu file các bạn dùng thư viện gì
        // thứ 1: dùng fileOutputStream 
        FileOutputStream fos = null;

        try {
            //FileOutputStream là hàm lưu file
            // trong ngoặc là đặt tên cho nó
            //true là nối thêm , false là ghi đè
            fos = new FileOutputStream("vidu.txt", true);

            String str = "Sinh viên aptech 123";
            // để lưu chuỗi này vào file
            // Bước 1:  chuyển chuỗi đấy về dạng byte
            byte[] data = str.getBytes("utf8");// truyền vào utf8 để lưu cả tiếng việt
            // sau đó truyền data
            fos.write(data);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally { // finally là nơi giải phóng tài nguyên 
            // dù thành công hay thât bại cx vào finally giải phóng tài nguyên
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    static void testFile() {
        //Test File Class
        File file = new File("Test.txt"); // khai báo đường dẫn tuyệt đối
        //CHÚ Ý KHÔNG NÊN DÙNG ĐƯỜNG DẪN TUYỆT ĐỐI, HAY LỖI , BỞI VÌ H ĐANG SHOW RA NÊN TEST THÔI
        // hàm exists kiểm tra xem file có tồn tại hay không
        if (file.exists()) {
            System.out.println("path: " + file.getAbsolutePath());
        } else {
            System.out.println("File not exists");
            try {
                // nếu mà k có file thì nó sẽ tạo file
                //lần đầu nếu mà chạy nó chưa có file thì nó sẽ báo ra chưa có
                // sau đó run lại lần nữa nó sẽ show ra đường link
                //đòng thời trong thư mục sẽ có file Test
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //List tất cả file và folder của nó
        file = new File("./");
        File[] fileList = file.listFiles();
        int index = 1;
        for (File f : fileList) {
            if (f.isFile()) { // kieemr tra xem trong f la file hay folder
                System.out.println(index + ")" + f.getName());
            } else {
                System.out.println(index + ")" + f.getName() + "-> folder");

            }
            index++; // hieenj thi so 1,2,3
        }
    }

}
