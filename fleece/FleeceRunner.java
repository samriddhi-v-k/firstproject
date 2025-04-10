package com.xworkz.fleece;

import com.xworkz.fleece.blanket.Blanket;

public class FleeceRunner {
    public static void main(String[] args) {
        Fleece fleece = new Fleece();
        fleece.warm();
        fleece.washable();
        Blanket blanket =new Blanket();
        blanket.warm();
        blanket.washable();
    }
}
