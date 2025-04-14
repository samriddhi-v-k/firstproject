package com.xworkz.wood;

import com.xworkz.wood.chair.Chair;

public class WoodRUnner {
    public static void main(String[] args) {
        Wood wood = new Wood();
        wood.strength();
        wood.texture();

        Chair chair = new Chair();
        chair.strength();
        chair.texture();

        Wood wood1 = new Chair();
        Chair chair1 = (Chair) wood1;
        System.out.println(chair1);
    }
}
