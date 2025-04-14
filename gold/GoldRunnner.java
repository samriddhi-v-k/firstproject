package com.xworkz.gold;

import com.xworkz.gold.ring.Ring;

public class GoldRunnner {
    public static void main(String[] args) {
        Gold gold = new Gold();
        gold.goodElectricalConductor();
        gold.tarnishResistant();
        Ring ring = new Ring();
        ring.goodElectricalConductor();
        ring.tarnishResistant();
        Gold gold1 =new Ring();
        Ring ring1 =(Ring) gold1;
        System.out.println(ring1);
    }

}
