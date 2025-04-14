package com.xworkz.cardboard;

import com.xworkz.cardboard.box.Box;

public class CardboardRunner {
    public static void main(String[] args) {
        Cardboard cardboard = new Cardboard();
        cardboard.easyToCut();
        cardboard.printable();
        Box box = new Box();
        box.easyToCut();
        box.printable();

        Cardboard cardboard1 = new Box();
        Box box1 =(Box) cardboard1;
        System.out.println(box1);
    }
}
