package com.xworkz.glass;

import com.xworkz.glass.window.Window;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass =new Glass();
        glass.shniySurface();
        glass.transparent();
        Window window = new Window();
        window.shniySurface();
        window.transparent();
    }
}
