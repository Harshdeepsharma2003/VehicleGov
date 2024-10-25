/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.dto;


/**
 *
 * @author HP
 */
public class Vehicle {
    
    private String vNo;
    private String state;
    private String ownerName;
    private String fuelCategory;
     private Govt govt;// Injection through constructor
    
    
    @Override
    public String toString(){
    
    return vNo+" "+state+" "+ownerName+" "+fuelCategory+" "+govt;
    
    
    }

    public Vehicle() {
    }
    

    public Vehicle(String vNo, String state, String ownerName, String fuelCategory) {
        this.vNo = vNo;
        this.state = state;
        this.ownerName = ownerName;
        this.fuelCategory = fuelCategory;
    }

    /**
     * @return the vNo
     */
    public String getvNo() {
        return vNo;
    }

    /**
     * @param vNo the vNo to set
     */
    public void setvNo(String vNo) {
        this.vNo = vNo;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * @return the fuelCategory
     */
    public String getFuelCategory() {
        return fuelCategory;
    }

    /**
     * @param fuelCategory the fuelCategory to set
     */
    public void setFuelCategory(String fuelCategory) {
        this.fuelCategory = fuelCategory;
    }

    /**
     * @return the govt
     */
    public Govt getGovt() {
        return govt;
    }

    /**
     * @param govt the govt to set
     */
    public void setGovt(Govt govt) {
        this.govt = govt;
    }
    
}
