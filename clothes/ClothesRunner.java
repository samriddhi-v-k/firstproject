package com.xworkz.clothes;

import com.xworkz.clothes.tshirt.Tshirt;

public class ClothesRunner {
    public static void main(String[] args) {
        Clothes clothes = new Clothes();
        clothes.material();
        clothes.ecofriendly();
        Tshirt tshirt = new Tshirt();
        tshirt.ecofriendly();
        tshirt.material();

        Clothes clothes1 = new Tshirt();
        Tshirt tshirt1 = (Tshirt) clothes1;
        System.out.println(tshirt1);

    }
}
