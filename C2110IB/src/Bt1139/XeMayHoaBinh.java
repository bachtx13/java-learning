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
public class XeMayHoaBinh implements IXe{
    int n;
    XeMay[] xemayList;

    public XeMayHoaBinh() {
    }

    public XeMayHoaBinh(int n, XeMay[] xemayList) {
        this.n = n;
        this.xemayList = xemayList;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public XeMay[] getXemayList() {
        return xemayList;
    }

    public void setXemayList(XeMay[] xemayList) {
        this.xemayList = xemayList;
    
    }
    
    
    
    
    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số lượng xe tai hoa binh :");
        n = Integer.parseInt(scan.nextLine());
        
        xemayList = new XeMay[n];
        for (int i = 0; i < n; i++) {
            xemayList[i]= new  XeMay();
            xemayList[i].nhap();
        }
    }

    @Override
    public void hienthi() {
        System.out.println("Hien thi danh sach xe tai Hoa Binh: ");
        for (int i = 0; i < n; i++) {
            xemayList[i].hienthi();
        }
    }
    
}
