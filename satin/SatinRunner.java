package com.xworkz.satin;

import com.xworkz.gold.ring.Ring;
import com.xworkz.satin.ribbon.Ribbon;

public class SatinRunner {
    public static void main(String[] args) {
        Satin satin = new Satin();
        satin.easyilyFoldable();
        satin.smoothMaterial();
        Ribbon ribbon = new Ribbon();
        ribbon.easyilyFoldable();
        ribbon.smoothMaterial();
        Satin satin1 = new Ribbon();
        Ribbon ribbon1 =(Ribbon) satin1;
        System.out.println(ribbon1);
        
    }
}
