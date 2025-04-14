package com.xworkz.nickel;

import com.xworkz.nickel.engineblade.EngineBlade;

public class NickelRunner {
    public static void main(String[] args) {
        Nickel nickel = new Nickel();
        nickel.magnetic();
        nickel.silveryAppearence();
        EngineBlade engineBlade = new EngineBlade();
        engineBlade.magnetic();
        engineBlade.silveryAppearence();
        Nickel nickel1 = new EngineBlade();
        EngineBlade engineBlade1 = (EngineBlade) nickel1;
        System.out.println(engineBlade1);
    }
}
