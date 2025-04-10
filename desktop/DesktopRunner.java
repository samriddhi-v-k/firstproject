package com.xworkz.desktop;

import com.xworkz.desktop.hardrive.Hardrive;

public class DesktopRunner {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.ram();
        desktop.storage();

        Hardrive hardrive = new Hardrive();
        hardrive.ram();
        hardrive.storage();
    }
}
