/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCN;

/**
 *
 * @author admin
 */
public class Hinhchunhat implements IHCNInterface{
    double chieuDai, chieuRong;

    @Override
    public double dientichHCN() {
        return chieuDai * chieuRong;
    }

    @Override
    public double getChieuDai() {
        return chieuDai;
    }

    @Override
    public double getChieuRong() {
        return chieuRong;
    }

    @Override
    public void setDaiRong(double cd, double cr) {
        chieuDai = cd;
        chieuRong = cr;
    }

    @Override
    public String toString() {
        return "Hinhchunhat{" + "chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + '}';
    }

    
    
}
