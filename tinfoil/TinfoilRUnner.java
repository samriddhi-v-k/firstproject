package com.xworkz.tinfoil;

import com.xworkz.tinfoil.wrap.Wrap;

public class TinfoilRUnner {
    public static void main(String[] args) {
        Tinfoil tinfoil = new Tinfoil();
        tinfoil.lightbarrier();
        tinfoil.nonToxic();

        Wrap wrap = new Wrap();
        wrap.lightbarrier();
        wrap.nonToxic();

        Tinfoil tinfoil1 = new Wrap();
        Wrap wrap1 = (Wrap) tinfoil1;
        System.out.println(wrap1);
    }

}
