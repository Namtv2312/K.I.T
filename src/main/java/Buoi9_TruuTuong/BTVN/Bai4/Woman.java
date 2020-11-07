/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_TruuTuong.BTVN.Bai4;

import java.awt.font.NumericShaper;

/**
 *
 * @author NAM SYSTEM
 */
public class Woman extends Person{
    private boolean wearingMakeup;
    public void outMakeupOn(){
        
    }

    public boolean isWearingMakeup() {
        return wearingMakeup;
    }
    

    @Override
    public void setDateOfBirth(double date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NumericShaper getAgeAsDays() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
