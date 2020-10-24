/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class JavaApp {
    ArrayList<TamGiac> tamgiaclst=  new ArrayList<>();
   
        public void nhap()
        {
            System.out.println("Nhap so tam giac: ");
          int so   = new Scanner(System.in).nextInt();
          
            for(int i=0;i<so;i++)
            {TamGiac tmp =new TamGiac();
                tmp.nhap();
                tamgiaclst.add(tmp);
            }
        }
        public void dientich()
        {double max=tamgiaclst.get(0).dienTich() ;
            for(int i=0;i<tamgiaclst.size();i++)
            {
                
                if(tamgiaclst.get(i).dienTich()>max)
                    max= tamgiaclst.get(i).dienTich();
            }
            for(int i=0;i<tamgiaclst.size();i++)
            {
                
                   if( tamgiaclst.get(i).dienTich()==max) tamgiaclst.get(i).xuatPT();
                    
            }
            
        }
}
