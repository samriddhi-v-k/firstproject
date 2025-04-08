package com.health.hospital.hospital;

public class Hospital {

    public String hospitalName;
    public String location;
    public String landmark;
    public String hospitalType;
    public Floor floor[];

    public void  getHospitalDetails()
    {
        System.out.println("the hospital name is "+hospitalName);
        System.out.println("the location of hospital is "+location);
        System.out.println("the landmark is given as "+landmark);
        System.out.println("the hospitalType is "+hospitalType);

    }
    for(Floor ref:floor){
        ref.getFloorDetails();
    }

}
