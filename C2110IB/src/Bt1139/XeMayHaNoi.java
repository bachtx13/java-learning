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
public class XeMayHaNoi implements IXe{
    int n;
    XeMay [] xemayList;

    public XeMayHaNoi() {
    }

    public XeMayHaNoi(int n, XeMay[] xemayList) {
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
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhập số lượng xe máy quản lý tại Hà Nôi: ");
        n = Integer.parseInt(scan.nextLine());
        
        xemayList= new XeMay[n];
        for (int i = 0; i < n; i++) {
            xemayList[i]= new  XeMay();
            xemayList[i].nhap();
        }
        
        
    }

    @Override
    public void hienthi() {
        System.out.println("Hien thi danh sach xe tai Ha Noi: ");
        for (int i = 0; i < n; i++) {
            xemayList[i].hienthi();
        }
    }
    
}
