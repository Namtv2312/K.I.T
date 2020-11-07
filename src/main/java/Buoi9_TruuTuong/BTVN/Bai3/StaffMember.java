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
public abstract class StaffMember {
    private String name;
    private String address;
    private String phone;
    
    public abstract double pay();

    @Override
    public String toString() {
        return "StaffMember{" + "name=" + name + ", address=" + address + ", phone=" + phone + '}';
    }
    
}
