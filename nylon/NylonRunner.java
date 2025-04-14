package com.xworkz.nylon;

import com.xworkz.nylon.rope.Rope;

public class NylonRunner {
    public static void main(String[] args) {
        Nylon nylon =new Nylon();
        nylon.quickDrying();
        nylon.waterResistant();
        Rope rope = new Rope();
        rope.quickDrying();
        rope.waterResistant();
        Nylon nylon1 = new Rope();
        Rope rope1 =(Rope) nylon1;
        System.out.println(rope1);

    }
}
