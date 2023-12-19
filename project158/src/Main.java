
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("C121", "Tran Van A", 31, 8.2);
        Student s2 = new Student("C111", "Tran Van B", 20, 7.2);
        Student s3 = new Student("C110", "Tran Van c", 29, 9.0);
        Student s4 = new Student("C990", "Tran Van D", 21, 2.3);

//         System.out.println("name: " + s1.toString());
//         System.out.println("name: " + s2.toString());
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, (Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        });

        System.out.println("After");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, (Student o1, Student o2) -> {
            if (o1.getMark() - o2.getMark() > 0) {
                return 1;
            } else if (o1.getMark() - o2.getMark() < 0) {
                return -1;
            } else {
                return 0;
            }
        });

        System.out.println("After"); 
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
