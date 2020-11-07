/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai3;

/**
 *
 * @author NAM SYSTEM
 */
public class Hourly extends Employee
{
    private int hourseWorked;
    
    public void addHourses(int moreHourse){
        
    }

    @Override
    public String toString() {
        return "Hourly{" + "hourseWorked=" + hourseWorked + '}';
    }

    @Override
    public double pay() {
        return super.pay(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
