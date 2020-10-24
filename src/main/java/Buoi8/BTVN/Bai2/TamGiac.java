/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.BTVN.Bai2;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class TamGiac extends  DaGiac{

    @Override
    void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int chuvi() {
        return super.chuvi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setA(int[] a) {
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] getA() {
        return super.getA(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSoCanh(int soCanh) {
        super.setSoCanh(soCanh); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSoCanh() {
        return super.getSoCanh(); //To change body of generated methods, choose Tools | Templates.
    }
    
      
    double dienTich()
    {
        double p= chuvi()/2;
        return Math.sqrt(p*(p-a[1])*(p-a[2])*(p-a[3]));
    }

    @Override
    void xuatPT() {
        System.out.println("cac canh tam giac co dien tich lon nhat la: ");
        for(int i=0;i<3;i++)
        {
            System.out.println(a[i]);
        }
//To change body of generated methods, choose Tools | Templates.
    }
    
        
}
