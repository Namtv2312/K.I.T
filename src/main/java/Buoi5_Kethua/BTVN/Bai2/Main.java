/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.BTVN.Bai2;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {
    public static void main(String[] args) {
        Sach s=new Sach();
        s.nhap();
        Tapchi tc=new Tapchi();
        tc.nhap();
        s.xuat();
        tc.xuat();
    }
}
