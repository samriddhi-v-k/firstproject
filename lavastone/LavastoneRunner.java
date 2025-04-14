package com.xworkz.lavastone;

import com.xworkz.lavastone.massagestone.MassageStone;

public class LavastoneRunner {
    public static void main(String[] args) {
        LavaStone lavastone = new LavaStone();
        lavastone.longlasting();
        lavastone.radiatesHeat();
        MassageStone massageStone = new MassageStone();
        massageStone.longlasting();
        massageStone.radiatesHeat();

        LavaStone lavaStone1 = new MassageStone();
        MassageStone massageStone1 = (MassageStone) lavaStone1;
        System.out.println(massageStone1);
    }
}
