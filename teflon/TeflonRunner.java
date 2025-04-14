package com.xworkz.teflon;

import com.xworkz.teflon.bakigSHeet.BakingSheet;

public class TeflonRunner {
    public static void main(String[] args) {
        Teflon teflon = new Teflon();
        teflon.easyCLeaning();
        teflon.electricalInsulator();

        BakingSheet bakingSheet = new BakingSheet();
        bakingSheet.easyCLeaning();
        bakingSheet.electricalInsulator();

        Teflon teflon1 = new BakingSheet();
        BakingSheet bakingSheet1 = (BakingSheet) teflon1;
        System.out.println(bakingSheet1);

    }
}
