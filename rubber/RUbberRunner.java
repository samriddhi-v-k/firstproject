package com.xworkz.rubber;

import com.xworkz.rubber.eraser.Eraser;

public class RUbberRunner {
    public static void main(String[] args) {
        Eraser eraser = new Eraser();
        eraser.resistant();
        eraser.waterProof();
        Rubber rubber = new Rubber();
        rubber.resistant();
        rubber.waterProof();
    }
}
