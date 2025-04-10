package com.xworkz.wool;

import com.xworkz.wool.sweater.Sweater;

public class WoolRUnner {
    public static void main(String[] args) {
        Wool wool = new Wool();
        wool.breathable();
        wool.naturalFibre();

        Sweater sweater = new Sweater();
        sweater.breathable();
        sweater.naturalFibre();
    }
}
