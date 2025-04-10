package com.xworkz.plastic;

import com.xworkz.plastic.bottle.Bottle;

public class PlasticRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        plastic.recyle();
        plastic.lightweight();
        Bottle bottle = new Bottle();
        bottle.recyle();
        bottle.lightweight();
    }
}
