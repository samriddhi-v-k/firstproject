package com.xworkz.brush;

import com.xworkz.brush.paintbrush.Paintbrush;

public class BrushRunner {
    public static void main(String[] args) {
        Paintbrush paintbrush = new Paintbrush();
        paintbrush.bristles();
        paintbrush.handle();
        paintbrush.shape();

        Brush brush = new Brush();
        brush.bristles();
        brush.handle();
        brush.shape();
    }
}
