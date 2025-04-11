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
    }
}
