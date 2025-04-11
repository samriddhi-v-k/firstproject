package com.xworkz.straw;

import com.xworkz.straw.hat.Hat;

public class StrawRunner {
    public static void main(String[] args) {
        Straw straw = new Straw();
        straw.biodegradable();
        straw.cheap();
        Hat hat = new Hat();
        hat.biodegradable();
        hat.cheap();
    }
}
