package com.xworkz.fleece;

import com.xworkz.fleece.blanket.Blanket;

import java.awt.datatransfer.FlavorListener;

public class FleeceRunner {
    public static void main(String[] args) {
        Fleece fleece = new Fleece();
        fleece.warm();
        fleece.washable();
        Blanket blanket =new Blanket();
        blanket.warm();
        blanket.washable();
        Fleece fleece1 = new Blanket();
        Blanket blanket1 = (Blanket) fleece1;
        System.out.println(blanket1);
    }

}
