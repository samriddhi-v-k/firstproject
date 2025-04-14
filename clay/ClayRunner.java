package com.xworkz.clay;

import com.xworkz.clay.pot.Pot;

public class ClayRunner {
    public static void main(String[] args) {
        Clay clay = new Clay();
        clay.expansive();
        clay.waterRetension();
        Pot pot = new Pot();
        pot.expansive();
        pot.waterRetension();

        Clay clay1 = new Clay();
        Pot pot1 =(Pot) clay1;
        System.out.println(pot1);
    }
}
