

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
public class ColorManager {
    ArrayList<String> colorList;

    public ColorManager() {
        colorList = new ArrayList<>();
    }
    
    public void nhap(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap ma mau moi: ");
        String color = scan.nextLine();
        
        if(colorList.contains(color)){
            System.out.println("Ma Mau nay da ton tai: " + color);
        }else{
            colorList.add(color);
        }
        
    }
    
    public void hienThi(){
        System.out.println("Danh sach ma mau: ");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println((i+1)+ "." + colorList.get(i));
        }
    }

    public ArrayList<String> getColorList() {
        return colorList;
    }

    public void setColorList(ArrayList<String> colorList) {
        this.colorList = colorList;
    }

    Object getcolorList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
