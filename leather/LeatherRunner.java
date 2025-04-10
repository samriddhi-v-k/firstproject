package com.xworkz.leather;

import com.xworkz.leather.shoes.Shoes;

public class LeatherRunner {
    public static void main(String[] args) {
        Leather leather = new Leather();
        leather.durability();
        leather.shine();
        leather.original();

        Shoes shoes = new Shoes();
        shoes.durability();
        shoes.shine();
        shoes.original();
    }
}
