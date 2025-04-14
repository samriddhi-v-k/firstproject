package com.xworkz.chrome;

import com.xworkz.chrome.faucet.Faucet;

public class ChromeRunner {
    public static void main(String[] args) {
        Chrome chrome =new Chrome();
        chrome.brightFinish();
        chrome.chemicalResistant();
        Faucet faucet = new Faucet();
        faucet.brightFinish();
        faucet.chemicalResistant();

        Chrome chrome1 = new Faucet();
        Faucet faucet1 = (Faucet) chrome1;
        System.out.println(faucet1);
    }
}
