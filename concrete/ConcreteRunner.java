package com.xworkz.concrete;

import com.xworkz.concrete.bench.Bench;

public class ConcreteRunner {
    public static void main(String[] args) {
        Concrete concrete = new Concrete();
        concrete.lowTensileStrength();
        concrete.thermalMass();
        Bench bench =new Bench();
        bench.lowTensileStrength();
        bench.thermalMass();
    }
}
