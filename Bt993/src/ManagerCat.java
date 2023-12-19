/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ManagerCat {
    ArrayList<CatDetail> catList;

    public ManagerCat() {
        catList = new ArrayList<>();
    }

    public ArrayList<CatDetail> getCatList() {
        return catList;
    }

    public void setCatList(ArrayList<CatDetail> catList) {
        this.catList = catList;
    }
    
    public void nhap(ColorManager colorManager){
        if(colorManager.getColorList().isEmpty()){
            System.out.println("Khong the nhap Mèo khi bảng màu rỗng!!!!");
            return;
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số mèo cần thêm:");
        
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            CatDetail catDetail= new CatDetail();
            catDetail.nhap(colorManager);
            catList.add(catDetail);
        }
    }
    
    public void hienthi() {
        for (CatDetail catDetail : catList) {
             catDetail.hienthi();
        }
    }
    
    public void sortByColor(){
        Collections.sort(catList, new Comparator<CatDetail>(){
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return o1.getMau().compareToIgnoreCase(o2.getMau());
            }
            
        });
    }
    
    public void searchingByLoai(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập loài cần tìm :");
        String loai = scan.nextLine();
        for (CatDetail catDetail : catList) {
            if(catDetail.getLoai().equalsIgnoreCase(loai)){
                catDetail.hienthi();
            }
        }
    }
}
