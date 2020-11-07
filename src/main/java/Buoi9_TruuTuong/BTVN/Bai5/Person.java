/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai5;

/**
 *
 * @author NAM SYSTEM
 */
public class Person {
    private String name;
    private String address;
    private String department;
    
    public void print()
    {
        System.out.println(toString());
        
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Persom{" + "name=" + name + ", address=" + address + ", department=" + department + '}';
    }   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}

