/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.BTVN.Bai1;

import Buoi5_Kethua.BTVN.Bai1.GiangVien;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        GiangVien gv = new GiangVien();
        gv.nhap();
        sv.xuat();
        gv.xuat();
        
    }
}
