
import java.util.ArrayList;
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
public class TestEmployee {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Employee> employeeList= new ArrayList<>();
        System.out.println("Nhập vào số nhân viên: ");
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhân viên thứ : " +(i+1)+ ".");
            Employee epl = new Employee();
            epl.input();
            
            employeeList.add(epl);
        }
        for (Employee employee : employeeList) {
            employee.display();
        }
        
        
        
        
        
    }
    
//    static void inputEmployee(ArrayList<Employee> employeeList ){
//        System.out.println("Nhập vào số nhân viên: ");
//        int n = Integer.parseInt(scan.nextLine());
//        
//        for (int i = 0; i < n; i++) {
//            Employee epl = new Employee();
//            epl.input();
//            
//            employeeList.add(epl);
//        }
//        
//    }
}
