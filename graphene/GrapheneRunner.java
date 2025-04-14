package com.xworkz.graphene;

import com.xworkz.graphene.screen.Screen;

public class GrapheneRunner {
    public static void main(String[] args) {
        Graphene graphene =new Graphene();
        graphene.highSurfaceArea();
        graphene.ultralight();
        Screen screen = new Screen();
        screen.highSurfaceArea();
        screen.ultralight();
        Graphene graphene1 = new Screen();
        Screen screen1 = (Screen) graphene1;
        System.out.println(screen1);
    }
}
