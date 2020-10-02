/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Kethua.BTVN.Bai1;

import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Con_Nguoi {
    private String hoTen;
    private int namSinh;
    private String queQuan;
    private String gioiTinh;
    
        public void nhap()
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("\"Nhap ho ten: ");
            hoTen= sc.nextLine();
            System.out.println("Nhap nam sinh: ");
            namSinh= sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap que quan: ");
            queQuan= sc.nextLine();
            System.out.println("Nhap gioi tinh: ");
            gioiTinh=sc.nextLine();
        }
        @Override
        public String toString()
        {
          return ""+
                  "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", queQuan='" + queQuan + '\'' +
                ", gioiTinh='" + gioiTinh + '\''
                ;
        }
}
            
            
        
           
            
          
    
    
    

