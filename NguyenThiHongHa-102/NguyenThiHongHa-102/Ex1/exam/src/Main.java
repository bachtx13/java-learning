
import JDBC.JDBCConnect;
import Utility.Utility;
import java.util.List;
import java.util.Scanner;
import tbl_exam.Tbl_exam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author std
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Tbl_exam tbl_exams = new Tbl_exam();
        Scanner scan = new Scanner(System.in);
        int choose;
        
        do {     
            showMenu();
            choose = Utility.scanInt(scan);
            
            switch(choose){
                case 1: 
                    List<Tbl_exam> examList = JDBCConnect.getExamList();
                    for(Tbl_exam e :examList ) {
                        System.out.println(e);
                    }
                    break;
                case 2: 
                    System.out.println("Nhap so luong bai kiem tra muon them:");
                    int n = Utility.scanInt(scan);
                    Tbl_exam tbl_exam = new Tbl_exam();
                    for (int i = 0; i < n; i++) {
                        tbl_exams.input();
                    }

                   JDBCConnect.insert(tbl_exams); // luu thong tin vao bang
                    break;
                case 3: 
                    
                    break;
                case 4: 
                    
                    break;
                default:
                    System.out.println("Nhập sai!! -> Nhập lại ");
                    break;
            }
        } while (choose != 4);
        
    }
    public static void showMenu(){
        System.out.println("1. View all exams");
        System.out.println("2. Add new exams");
        System.out.println("3. Remove exams");
        System.out.println("4. Exit");
        System.out.println("choose:");
    }
}
