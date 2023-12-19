/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCN;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HCNTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n hình nhữ nhật: ");
        int n = Integer.parseInt(sc.nextLine());
        
        Hinhchunhat[] hcnList = new Hinhchunhat[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Thong Tin cua HCN thứ: " +(i+1));
            System.out.println("Nhap chieu dai cua HCN: ");
            double cd = Double.parseDouble(sc.nextLine());
            
            System.out.println("Nhap chieu rong cua HCN: ");
            double cr = Double.parseDouble(sc.nextLine());
            
            hcnList[i] = new Hinhchunhat();
            hcnList[i].setDaiRong(cd, cr);
        }
        
        //Câu 2: 
        System.out.println("Thong Tin Hinh Chu Nhật: ");
        for (int i = 0; i < n; i++) {
            System.out.println(hcnList[i]);
        }
        
        // caau 3;
        int  index = 0;
        double MaxDienTich = hcnList[0].dientichHCN();
        for (int i = 0; i < n; i++) {
            double currentDt = hcnList[i].dientichHCN();
            if(currentDt > MaxDienTich) {
                index = i;
                MaxDienTich = currentDt;
            }
        }
        System.out.println("Thong tin dien tich max:");
        System.out.println(hcnList[index]);
    } 
}
