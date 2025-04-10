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
    }
}
