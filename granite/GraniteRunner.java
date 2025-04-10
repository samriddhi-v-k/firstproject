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
    }
}
