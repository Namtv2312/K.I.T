/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.BTVN.Bai1;

import Buoi5_Kethua.BTVN.Bai1.Con_Nguoi;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class SinhVien extends Con_Nguoi{
    private String maLop;
    private String nganhHoc;
    private String khoa;

    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien: ");
        super.nhap();
        System.out.println("Nhap maLop: ");
        maLop = scanner.nextLine();
        System.out.println("Nhap nganhHoc: ");
        nganhHoc = scanner.nextLine();
        System.out.println("Nhap khoa: ");
        khoa = scanner.nextLine();
    }
    public void xuat()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "SinhVien{\n" +
                super.toString()+
                ",\n maLop='" + maLop + '\'' +
                ",\n nganhHoc='" + nganhHoc + '\'' +
                ",\n khoa='" + khoa + '\'' +
                '}';
    }
    public SinhVien() {
    }
}
