package com.xworkz.basalt;

import com.xworkz.basalt.mortar.Mortar;

public class BasaltRUnner {
    public static void main(String[] args) {
        Basalt basalt =new Basalt();
        basalt.darkAppearnece();
        basalt.igneous();
        Mortar mortar = new Mortar();
        mortar.darkAppearnece();
        mortar.igneous();

        Basalt basalt1 = new Mortar();
        Mortar mortar1 =(Mortar) basalt1;
        System.out.println(mortar1);
    }
}
