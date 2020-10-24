/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8.BTVN.Bai2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author NAM SYSTEM
 */
public class Main {

    public static void main(String[] args) {
        JavaApp app = new JavaApp();
        while (true) {
            System.out.println("1. Nhap n tam giac");
            System.out.println("2. In canh tam giac smax");
            System.out.println("3. Exit");
            System.out.println("Moi ban chon");
            int chon = new Scanner(System.in).nextInt();
            switch(chon)
            {
                case 1:app.nhap();break;
                case 2: app.dientich();break;
                case 3: exit(0);break;
            
            }
                
        }
    }
}
