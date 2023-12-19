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
public class Author {

    String fullname, nickname, address;
    Date birthday;

    public Author() {
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }

    public Author(String fullname, String nickname, String address, Date birthday) {
        this.fullname = fullname;
        this.nickname = nickname;
        this.address = address;
        this.birthday = birthday;
    }

    public String getFullname() {
        return fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void inputWithoutNickname() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        fullname = scan.nextLine();

        System.out.println("Nhap  địa chỉ: ");
        address = scan.nextLine();

        // mỗi tác giả chỉ có bút danh duy nhất, không được trùng 
        System.out.println("Nhập nickname: ");
        //author list la danh sach tgia da tontai

        System.out.println("Nhập date (dd/mm/YYYY): ");
        birthday = Utinity.convertStringToDate(scan.nextLine());
    }

    public void input() {
        inputWithoutNickname();
        Scanner scan = new Scanner(System.in);

        // mỗi tác giả chỉ có bút danh duy nhất, không được trùng 
        System.out.println("Nhập nickname: ");
        //author list la danh sach tgia da tontai
        while (true) {
            nickname = scan.nextLine();
            boolean exist = DataMgr.getInstance().checkExitAuthor(nickname);
            // exist :tồn tại 
            if (exist) {
                // neeu exist ton tai thi nhap lai
                System.out.println("Nickname đã tồn tại -> nhập lại ");
            } else {
                break;
            }
        }
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Author{" + "fullname=" + fullname + ", nickname=" + nickname + ", address=" + address + ", birthday=" + Utinity.convertDateToString(birthday) + '}';
    }

}
