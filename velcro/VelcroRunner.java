package com.xworkz.velcro;

import com.xworkz.velcro.shoefastner.ShoeFastner;

public class VelcroRunner {
    public static void main(String[] args) {
        Velcro velcro = new Velcro();
        velcro.reusable();
        velcro.versatile();
        ShoeFastner shoeFastner = new ShoeFastner();
        shoeFastner.reusable();
        shoeFastner.versatile();
        Velcro velcro1 = new ShoeFastner();
        ShoeFastner shoeFastner1 =(ShoeFastner) velcro1;
        System.out.println(shoeFastner1);
    }
}
