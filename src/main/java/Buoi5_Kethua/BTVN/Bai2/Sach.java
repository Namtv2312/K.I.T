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
public class Sach extends TaiLieu{
    private int soTrang;
    private int namXuatban;
    private int lanTaiban;
    private String tenTacgia;
             public void nhap()
             {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Nhap thong tin tai lieu: ");
                 super.nhap();
                 System.out.println("Nhap so trang sach: ");
                 soTrang= sc.nextInt();
                 System.out.println("Nhap nam xuat ban: ");
                 namXuatban=sc.nextInt();
                 System.out.println("Nhap so lan tai ban: ");
                 lanTaiban= sc.nextInt();
                 System.out.println("Nhap ten tac gia: ");
                 tenTacgia=sc.nextLine();
                 
             }
             public void xuat()
             {
                 System.out.println(toString());
             }
             @Override
             public String toString()
             {
                 return "Sach{"+super.toString()+""+"//So trang: "+soTrang+"//nam xuat ban: "+namXuatban+"//so lan tai ban: "+lanTaiban+"//tac gia: "+tenTacgia+"}";
             }
              public  Sach()
              {
                  
              }
}
