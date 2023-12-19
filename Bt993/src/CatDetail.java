
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
public class CatDetail implements ICat{
    String loai;
    String mau;
    String noisong;

    public CatDetail() {
    }

    public CatDetail(String loai, String mau, String noisong) {
        this.loai = loai;
        this.mau = mau;
        this.noisong = noisong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }
    
    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Nhap Loai :");
        loai = scan.nextLine();
        
        
        
        System.out.println("Nhap noi song: ");
        noisong = scan.nextLine();
    }
    
    public void nhap(ColorManager colorManager){
        Scanner scan = new Scanner(System.in);
        nhap();
        
        System.out.println("Nhap ma mau: ");
        while(true){
            colorManager.hienThi();
            mau = scan.nextLine();
            if(colorManager.getColorList().contains(mau)){
                break;
            }else{
                System.out.println("Yeu cau nhap lai ma mau: ");
            }
        }
    }
    @Override
    public void hienthi() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CatDetail{" + "loai=" + loai + ", mau=" + mau + ", noisong=" + noisong + '}';
    }
    
    
}
