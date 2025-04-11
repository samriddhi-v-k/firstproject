package com.xworkz.marble;

import com.xworkz.marble.countertop.CounterTop;

public class MarbleRunner {
    public static void main(String[] args) {
        Marble marble = new Marble();
        marble.aesthetic();
        marble.carve();
        CounterTop counterTop = new CounterTop();
        counterTop.aesthetic();
        counterTop.carve();
    }
}
