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
public class TaiLieu {
    private String maTailieu;
    private String tenTailieu;
    private String tenNXB;

    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma tai lieu: ");
        maTailieu= sc.nextLine();
        System.out.println("Nhap ten tai lieu: ");
        tenTailieu= sc.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        tenNXB=sc.nextLine();
    }
    @Override
    public String toString()
    {
        return ""+
                "Ma tai lieu: "+ maTailieu +"//Ten tai lieu: "+tenTailieu+"//ten nha xuat ban: "+tenNXB;
    }
}
