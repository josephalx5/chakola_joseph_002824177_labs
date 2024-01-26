/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author josephchakola
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalSignsList;

    public VitalSignsHistory() {
        vitalSignsList = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalSignsList() {
        return vitalSignsList;
    }

    public void setVitalSignsList(ArrayList<VitalSigns> vitalSignsList) {
        this.vitalSignsList = vitalSignsList;
    }
    public void addNewVital(VitalSigns vs){
        vitalSignsList.add(vs);
    }
    public void removeVital(int position){
        vitalSignsList.remove(position);
    }
    public VitalSigns getSpecificIndex(int position){
        return vitalSignsList.get(position);
    }
    
}
