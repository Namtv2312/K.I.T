/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.BTVN.Bai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Tapchi extends TaiLieu{
    private int ngayXuatban;
    private int soTrang;
    private String danhMucXb;
    
    public void nhap()
    {
        System.out.println("Nhap thong tin tap chi:");
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ngay xuat ban: ");
        ngayXuatban=sc.nextInt();
        System.out.println("Nhap so trang: ");
        soTrang= sc.nextInt();
        System.out.println("Nhap danh muc xuat ban: ");
        danhMucXb= sc.nextLine();
    }
    public void xuat()
    {
        System.out.println(toString());
    }
     @Override 
     public String toString()
       {
           return "Tap chi:{"+super.toString()+"Ngay xuat ban: "+ngayXuatban+"//So trang: "+soTrang+"//Danh muc xuat ban: "+danhMucXb+"}";
       }
       public Tapchi()
       {
           
       }
           
}
