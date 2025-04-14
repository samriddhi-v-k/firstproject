package com.xworkz.iron;

import com.xworkz.iron.gate.Gate;

public class IronRunner {
    public static void main(String[] args) {
        Iron iron = new Iron();
        iron.corrosionProne();
        iron.magnetic();
        Gate gate= new Gate();
        gate.corrosionProne();
        gate.magnetic();

        Iron iron1 = new Gate();
        Gate gate1 = (Gate) iron1;
        System.out.println(gate1);
    }
}
