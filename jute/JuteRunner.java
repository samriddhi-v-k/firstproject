package com.xworkz.jute;

import com.xworkz.jute.coaster.Coaster;

public class JuteRunner {
    public static void main(String[] args) {
        Jute jute = new Jute();
        jute.moistureAbsorbent();
        jute.roughTexture();
        Coaster coaster = new Coaster();
        coaster.moistureAbsorbent();
        coaster.roughTexture();
        Jute jute1 = new Jute();
        Coaster coaster1 = (Coaster) jute1;
        System.out.println(coaster1);
    }
}
