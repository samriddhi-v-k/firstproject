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

        Silk silk1 = new Scarf();
        Scarf scarf1 = (Scarf) silk1;
        System.out.println(scarf1);
    }

}
