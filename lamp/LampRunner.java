package com.xworkz.lamp;

import com.xworkz.lamp.bulb.Bulb;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.color();
        lamp.size();

        Bulb bulb = new Bulb();
        bulb.color();
        bulb.size();
    }
}
