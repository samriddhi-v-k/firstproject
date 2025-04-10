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
    }
}
