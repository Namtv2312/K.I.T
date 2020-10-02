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
public class GiangVien extends Con_Nguoi{
    private String khoa;
    private String monDay;
    private int namKinhNghiem;
    public void nhap()
    {
        System.out.println("Nhap thong tin giang vien: ");
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap monDay: ");
        monDay = scanner.nextLine();
        System.out.println("Nhap namKinhNghiem: ");
        namKinhNghiem = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap khoa: ");
        khoa = scanner.nextLine();

    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                super.toString()+
                ", khoa='" + khoa + '\'' +
                ", monDay='" + monDay + '\'' +
                ", namKinhNghiem=" + namKinhNghiem +
                '}';
    }

    public GiangVien() {
    }
}
