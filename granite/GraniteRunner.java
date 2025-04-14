package com.xworkz.granite;

import com.xworkz.granite.sink.Sink;

public class GraniteRunner {
    public static void main(String[] args) {
        Granite granite = new Granite();
        granite.hard();
        granite.patterns();
        Sink sink = new Sink();
        sink.hard();
        sink.patterns();
        Granite granite1 = new Sink();
        Sink sink1 =(Sink)granite1;
        System.out.println(sink1);

    }
}
