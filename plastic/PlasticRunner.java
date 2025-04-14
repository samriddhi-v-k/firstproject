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
        Plastic plastic1 =new Bottle();
        Bottle bottle1 =(Bottle) plastic1;
        System.out.println(bottle1);
    }
}
