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
    }
}
