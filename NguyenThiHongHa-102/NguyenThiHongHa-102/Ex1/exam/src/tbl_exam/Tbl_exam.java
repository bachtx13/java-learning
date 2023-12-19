/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbl_exam;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author std
 */
public class Tbl_exam {

    String exam_name, exam_room, exam_date;
    int exam_duration;

    public Tbl_exam() {
    }

    public Tbl_exam(String exam_name, String exam_room, String exam_date,int exam_duration) {
        this.exam_name = exam_name;
        this.exam_room = exam_room;
        this.exam_date = exam_date;
        this.exam_duration = exam_duration;
    }

//    public Tbl_exam(String string, String string0, String string1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    public String getExam_room() {
        return exam_room;
    }

    public void setExam_room(String exam_room) {
        this.exam_room = exam_room;
    }

    public String getExam_date() {
        return exam_date;
    }

    public void setExam_date(String exam_date) {
        this.exam_date = exam_date;
    }

    public int getExam_duration() {
        return exam_duration;
    }

    public void setExam_duration(int exam_duration) {
        this.exam_duration = exam_duration;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter exam_name: ");
        exam_name = scan.nextLine();

        
        System.out.println("Enter exam_room: ");
        exam_room = scan.nextLine();
        
        System.out.println("Enter exam_date (vd: 2002-10-10): ");
        exam_date = scan.nextLine();
        
        System.out.println("Enter exam_duration: ");
        exam_duration =Integer.parseInt(scan.nextLine());
    }

    @Override
    public String toString() {
        return "Exam{" + "exam_name=" + exam_name + ", exam_room=" + exam_room + ", exam_date=" + exam_date + ", exam_duration=" + exam_duration + '}';
    }
    
    
    
}
