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
    }
}
