/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Dahinh.Bai1;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {

   public static void main(String[] args) { 
        QuanLy manage = new QuanLy();
        while(true)
        {
         manage.menu();
         int chon= new Scanner(System.in).nextInt();
         switch(chon)
         {
             case 1: manage.nhap();
             case 2: manage.xuattreem();
             case 3: manage.xuatnguoilon();
             case 4: manage.tongtien();
             case 0: exit(0);
         
         }
        }
           
}
}
