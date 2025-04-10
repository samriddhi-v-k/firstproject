package com.xworkz.steel;

import com.xworkz.steel.bridge.Bridge;

public class SteelRunner {
    public static void main(String[] args) {
        Steel steel = new Steel();
        steel.ductile();
        steel.highMeltingPoint();
        Bridge bridge = new Bridge();
        bridge.ductile();
        bridge.highMeltingPoint();
    }
}
