package com.xworkz.utensil;

import com.xworkz.utensil.spoon.Spoon;

public class UtensilRunner {
    public static void main(String[] args) {
        Utensil utensil = new Utensil();
        utensil.foodGrade();
        utensil.nonReactiveSurface();

        Spoon spoon = new Spoon();
        spoon.foodGrade();
        spoon.nonReactiveSurface();

        Utensil utensil1 = new Spoon();
        Spoon spoon1 = (Spoon) utensil1;
        System.out.println(spoon1);
    }
}
