package com.xworkz.aluminium;

import com.xworkz.aluminium.can.Can;

public class AluminiumRunner {
    public static void main(String[] args) {
        Aluminium aluminium = new Aluminium();
        aluminium.conductorOfHeat();
        aluminium.recyclable();
        Can can = new Can();
        can.conductorOfHeat();
        can.recyclable();
    }
}
