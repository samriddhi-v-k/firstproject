package com.supermarket.marketmanagement.supermarket;
import com.supermarket.marketmgmt.section.Section;
public class Supermarket {
    public  int marketId;
    public String name;
    public String location;
    public Section[] sections;



    public void display() {
        System.out.println("-----------.....+++.....-----------");
        System.out.println("Supermarket ID: " + marketId);
        System.out.println("Supermarket Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Available Sections:");
        for (Section section : sections) {
            section.displaySection();
        }
    }

}
