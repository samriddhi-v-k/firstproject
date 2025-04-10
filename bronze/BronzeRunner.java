package com.xworkz.bronze;

import com.xworkz.bronze.statue.Statue;

public class BronzeRunner {
    public static void main(String[] args) {
        Bronze bronze = new Bronze();
        bronze.alloy();
        bronze.lowFriction();
        Statue statue = new Statue();
        statue.alloy();
        statue.lowFriction();
    }
}
