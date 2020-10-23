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
  private  ArrayList<NhanVien> nhanVienlst=  new ArrayList<>();
 
    
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
    public void xuatALL()
     {
         for(NhanVien tmp : nhanVienlst)
         {
             tmp.xuat();
         }
     } 
        public QuanLiNhanVien() {
    }
     public void nhapSuaongnuoc()
     {
         System.out.println("Nhap so tho :");
         int s= sc.nextInt();
         for(int i=0;i<s;i++){
             System.out.println("Nhap tho sua so"+i+1);    
             SuaOngNuoc tmp= new SuaOngNuoc();
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
   
    
   public void tongtien()
   {

       
   }
  public void thongKeLuongGiamDan() {
        System.out.println("\t\tNhanVienOngNUOc");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongNVOngNuocGiamDan();
        for(SuaOngNuoc tmp : nhanVienlst)
        {
            tmp.xuat();
        }
        System.out.println("\t\tNhanVienXeOm");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongNVXeOmGiamDan();
        for(XeOm tmp : nhanVienlst) // xuat danh sach nv ong nuoc
        {
            tmp.xuat();
        }
        System.out.println("\t\tNhanVienShipper");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongShipperGiamDan();
        for(Shiper tmp : nhanVienlst) // xuat danh sach nv ong nuoc
        {
            tmp.xuat();
        }
    }
    private void SapXepLuongNVOngNuocGiamDan() {
        for (int i = 0; i < nhanVienlst.size()-1; i++) {
            for (int j=i+1; j<nhanVienlst.size(); j++)
            {
                if(nhanVienlst.get(i).tinhTien()<nhanVienlst.get(j).tinhTien())
                {
                   SuaOngNuoc tmp;
                    tmp = nhanVienlst.get(i);//tmp = a;
                    nhanVienlst.set(i,nhanVienlst.get(j)); //a=b;
                    nhanVienlst.set(j,tmp); //b=tmp;
                }
            }
        }
    }
    private void SapXepLuongNVXeOmGiamDan() {
        for (int i = 0; i < nhanVienlst.size()-1; i++) {
            for (int j=i+1; j<nhanVienlst.size(); j++)
            {
                if(nhanVienlst.get(i).tinhTien()<nhanVienlst.get(j).tinhTien())
                {
                    NVXeOm tmp;
                    tmp = nhanVienlst.get(i);//tmp = a;
                    nhanVienlst.set(i,nhanVienlst.get(j)); //a=b;
                    nhanVienlst.set(j,tmp); //b=tmp;
                }
            }
        }
    }
    private void SapXepLuongShipperGiamDan() {
        for (int i = 0; i < nhanVienlst.size()-1; i++) {
            for (int j=i+1; j<nhanVienlst.size(); j++)
            {
                if(nhanVienlst.get(i).tinhtienLuong()<nhanVienlst.get(j).tinhTien())
                {
                    Shiper tmp;
                    tmp = nhanVienlst.get(i);//tmp = a;
                    nhanVienlst.set(i,nhanVienlst.get(j)); //a=b;
                    nhanVienlst.set(j,tmp); //b=tmp;
                }
            }
        }
    }
         
}
