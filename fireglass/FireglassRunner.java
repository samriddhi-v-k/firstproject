package com.xworkz.fireglass;

import com.xworkz.fireglass.helmet.Helmet;

public class FireglassRunner {
    public static void main(String[] args) {
        Fireglass fireglass = new Fireglass();
        fireglass.multiFunctional();
        fireglass.safety();
        Helmet helmet = new Helmet();
        helmet.multiFunctional();
        helmet.safety();

        Fireglass fireglass1 = new Helmet();
        Helmet helmet1 = (Helmet) fireglass1;
        System.out.println(helmet1);
    }
}
