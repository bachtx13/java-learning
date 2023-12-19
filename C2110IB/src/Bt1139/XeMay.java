/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt1139;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class XeMay implements IXe {

    String bienso;
    String loaixe;
    String mauxe;
    float giatien;

    public XeMay() {
    }

    public XeMay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }


    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhập biển số: ");
        bienso = scan.nextLine();
        
        System.out.println("Nhập loại xe: ");
        loaixe = scan.nextLine();
        
        System.out.println("Nhập màu xe: ");
        mauxe = scan.nextLine();
        
        System.out.println("Nhập giá tiền: ");
        giatien = scan.nextFloat();
    }

    @Override
    public void hienthi() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "XeMay{" + "bienso=" + bienso + ", loaixe=" + loaixe + ", mauxe=" + mauxe + ", giatien=" + giatien + '}';
    }
    

}
