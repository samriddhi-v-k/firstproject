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
        Straw straw1 = new Hat();
        Hat hat1 =(Hat) straw1;
        System.out.println(hat1);
    }
}
