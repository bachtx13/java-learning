/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> listEmplyee = new ArrayList<>();

        Employee emp = new Employee(1, 2000, "A", "Ha Noi", "2000");
        listEmplyee.add(emp);
        Employee emp1 = new Employee(2, 3000, "B", "Da Nang", "1998");
        listEmplyee.add(emp1);
        Employee emp2 = new Employee(3, 2003, "C", "Long An ", "2001");
        listEmplyee.add(emp2);
        Employee emp3 = new Employee(4, 500, "D", "Ha Noi", "2009");
        listEmplyee.add(emp3);

        for (Employee employee : listEmplyee) {
            System.out.println(employee);
        }

        int count = 0;
        for (int i = 0; i < listEmplyee.size(); i++) {
            if (listEmplyee.get(i).getSalary() >= 1000) {
                count += 1;
            }
        }
        System.out.println("so nhan vien co luong tren 1000");
        System.out.println(count);

        Collections.sort(listEmplyee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() > o2.getSalary()) {
                    return 1;
                }
                return -1;
            }

        });

        System.out.println("Thong tin luong  cao nhất: ");
        listEmplyee.get(listEmplyee.size() - 1).display();

//        Collections.sort(listEmplyee, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) 
//                if (o1.getSalary() > o2.getSalary()) {
//                    return 1;
//                }
//                return -1;
//            }
//        });
        System.out.println("Danh sách luong từ thấp đến cao là ");
        for (Employee employee : listEmplyee) {
            employee.display();
        }
        
        
        for (Employee employee : listEmplyee) {
            int exp = 2022 - (Integer.parseInt(employee.getDob()) + 18);
            int tmp = employee.getSalary();
            if (exp >= 1 && exp < 3) {
                employee.setSalary(tmp + 100);
            } else if (exp >= 3 && exp < 5) {
                employee.setSalary(tmp + 500);
            } else if (exp >= 5) {
                employee.setSalary(tmp + 1000);
            }
        }
        System.out.println("Luong theo kinh nghiem: ");
        for (Employee employee : listEmplyee) {
            employee.display();
        }
    }

}
