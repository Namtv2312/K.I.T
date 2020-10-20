/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class QuanLiNhanVien {
    Scanner sc= new Scanner(System.in);
  ArrayList<NhanVien> nhanVienlst=  new ArrayList<>();
    
    public void Menu(){
        System.out.println("\t \t \t Quản lý hệ thống ");
        System.out.println("1.Nhập thợ sửa ống nước");
        System.out.println("2.Xuất thowr sửa ống nước");
        System.out.println("3.nhập shipper");
        System.out.println("4.Xuất shipper");
        System.out.println("5.nhập NVXeOm");
        System.out.println("6.Xuất NVXeOm");
        System.out.println("7.tính tiền ");
        System.out.println("8.Xuat toan bo nhan vien");
        System.out.println("9.Thống kê lương giảm dần`");
        System.out.println("0.exit");
        System.out.println("Mời bạn chọn ");
    }
     public void nhapSuaongnuoc()
     {
         System.out.println("Nhap so tho :");
         int s= sc.nextInt();
         for(int i=0;i<s;i++){
             System.out.println("Nhap tho sua so"+i+1);
             SuaOngNuoc tmp = new SuaOngNuoc();
             tmp.nhap();
             nhanVienlst.add(tmp);
         }
         }
      public void nhapShiper()
         {
             System.out.println("Nhap so shiper :");
         int s= sc.nextInt();
         for(int i=0;i<s;i++){
             System.out.println("Nhap shiper so"+i+1);
             Shiper tmp= new Shiper();
             tmp.nhap();
             nhanVienlst.add(tmp);
         }
         }
        public void xeOm()
         {
             System.out.println("Nhap so xe om :");
         int s= sc.nextInt();
         for(int i=0;i<s;i++){
             System.out.println("Nhap xe om so"+i+1);
             XeOm tmp= new XeOm();
             tmp.nhap();
             nhanVienlst.add(tmp);
         }
         }
     public void xuatOngnuoc()
     {
         for(int i=0;i<nhanVienlst.size();i++ )
         {
             if(nhanVienlst.get(i) instanceof SuaOngNuoc)
                 nhanVienlst.get(i).xuat();
         }
     }
     public void xuatxeom()
     {
         for(int i=0;i<nhanVienlst.size();i++ )
         {
             if(nhanVienlst.get(i) instanceof XeOm)
                 nhanVienlst.get(i).xuat();
         }
     }
     public void shiper()
     {
         for(int i=0;i<nhanVienlst.size();i++ )
         {
             if(nhanVienlst.get(i) instanceof Shiper)
                 nhanVienlst.get(i).xuat();
         }
     }

    public QuanLiNhanVien() {
    }
     
    public void tongtien()
    {
        int tongTien=0;
        for(NhanVien tmp : nhanVienlst)
        {
            if(tmp instanceof SuaOngNuoc)
                tongTien+= ((SuaOngNuoc) tmp).tienLuong();
            else if(tmp instanceof  XeOm)
                tongTien+= ((XeOm) tmp).tinhtien();
            else if(tmp instanceof Shiper)
                tongTien+= ((Shiper) tmp).tinhtien();
        }
        System.out.println("Tong tien"+tongTien);
            
    }
    public void Sapxep()
    {
        for(int i=0;i<nhanVienlst.size();i++)
        {
            for(int j=i+1;j<nhanVienlst.size();j++)
            {
                if
            }
        
        }
    }
         
}
