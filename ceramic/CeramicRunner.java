package com.xworkz.ceramic;

import com.xworkz.ceramic.Mug.Mug;

public class CeramicRunner {
    public static void main(String[] args) {
        Ceramic ceramic = new Ceramic();
        ceramic.heatResistant();
        ceramic.nonPorous();
        Mug mug = new Mug();
        mug.heatResistant();
        mug.nonPorous();

        Ceramic ceramic1 = new Mug();
        Mug mug1 =(Mug) ceramic1;
        System.out.println(mug1);
    }
}
