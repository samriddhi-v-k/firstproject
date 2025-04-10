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
    }
}
