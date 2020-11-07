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
public class Employee extends StaffMember
{
    private String socialSecurityNumber;
    private double payRate;

    @Override
    public double pay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Employee{" + "socialSecurityNumber=" + socialSecurityNumber + ", payRate=" + payRate + '}';
    }
        
}
