package com.xworkz.suede;

import com.xworkz.suede.Boots.Boots;

public class SuedeRunner {
    public static void main(String[] args) {
        Suede suede = new Suede();
        suede.stylish();
        suede.velvet();
        Boots boots = new Boots();
        boots.stylish();
        boots.velvet();
        Suede suede1 = new Boots();
        Boots boots1 = (Boots) suede1;
        System.out.println(boots1);
    }
}
