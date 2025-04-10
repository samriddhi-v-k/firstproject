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
    }
}
