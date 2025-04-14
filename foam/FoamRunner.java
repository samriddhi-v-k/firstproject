package com.xworkz.foam;

import com.xworkz.foam.pillow.Pillow;

public class FoamRunner {
    public static void main(String[] args) {
        Foam foam = new Foam();
        foam.shockAbsorbent();
        foam.soft();
        Pillow pillow = new Pillow();
        pillow.shockAbsorbent();
        pillow.soft();

        Foam foam1 = new Pillow();
        Pillow pillow1 = (Pillow) foam1;
        System.out.println(pillow1);
    }
}
