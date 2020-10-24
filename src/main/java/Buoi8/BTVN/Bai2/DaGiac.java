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
public class DaGiac {
    private  int soCanh;
    private int []a= new int [soCanh];
     void nhap()
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhap so canh cua da giac: ");
         soCanh= sc.nextInt();
         System.out.println("Nhap kich thuoc cac canh cua da giac");
         for(int i=0;i<soCanh;i++)
         {
             System.out.println("a["+i+"]=");
             a[i]=sc.nextInt();
         }
     }
     int chuvi()
     {
        int cv=0;
        for(int i=0;i<soCanh;i++)
        {
            cv+=a[i];
        }
         return cv;
     }
     void xuatPT()
     {
          for(int i=0;i<soCanh;i++)
        {
            System.out.println(a[i]);
        }
     }

    public DaGiac() {
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    
     
}
