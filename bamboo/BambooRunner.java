package com.xworkz.bamboo;

import com.xworkz.bamboo.toothbrush.Toothbrush;

public class BambooRunner {
    public static void main(String[] args) {
        Bamboo bamboo = new Bamboo();
        bamboo.appearence();
        bamboo.fastGrowing();
        Toothbrush toothbrush = new Toothbrush();
        toothbrush.appearence();
        toothbrush.fastGrowing();

        Bamboo bamboo1 = new Toothbrush();
        Toothbrush toothbrush1 =(Toothbrush) bamboo1;
        System.out.println(toothbrush1);
    }
}
