/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.Trenlop.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Bao {
    protected int ngayPhathanh;
     public void nhap()
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhap ngay phat hanh");
         ngayPhathanh= sc.nextInt();
     }

    @Override
    public String toString() {
        return "Bao{" + "ngayPhathanh=" + ngayPhathanh + '}';
    }
         
}
