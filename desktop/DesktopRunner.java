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

        Desktop desktop1 = new Hardrive();
        Hardrive hardrive1 = (Hardrive) desktop1;
        System.out.println(hardrive1);
    }
}
