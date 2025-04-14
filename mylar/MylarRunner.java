package com.xworkz.mylar;

import com.xworkz.mylar.emergencyblanket.EmergencyBlanket;

public class MylarRunner {
    public static void main(String[] args) {
        Mylar mylar = new Mylar();
        mylar.durable();
        mylar.reflective();
        EmergencyBlanket emergencyBlanket =new EmergencyBlanket();
        emergencyBlanket.durable();
        emergencyBlanket.reflective();
        Mylar mylar1 = new EmergencyBlanket();
        EmergencyBlanket emergencyBlanket1 = (EmergencyBlanket) mylar1;
        System.out.println(emergencyBlanket1);
    }
}
