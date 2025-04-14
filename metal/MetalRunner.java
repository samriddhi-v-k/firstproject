package com.xworkz.metal;

import com.xworkz.metal.belt.Belt;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal =new Metal();
        metal.design();
        metal.durable();
        Belt belt = new Belt();
        belt.design();
        belt.durable();
        Metal metal1 = new Belt();
        Belt belt1 = (Belt) metal1;
        System.out.println(belt1);
    }
}
