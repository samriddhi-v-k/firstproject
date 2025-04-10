package com.xworkz.silk;

import com.xworkz.silk.scarf.Scarf;

public class SilkRunner {
    public static void main(String[] args) {
        Silk silk = new Silk();
        silk.thermoRegualting();
        silk.smoothTexture();

        Scarf scarf = new Scarf();
        scarf.smoothTexture();
        scarf.thermoRegualting();
    }
}
