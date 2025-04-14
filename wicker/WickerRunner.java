package com.xworkz.wicker;

import com.xworkz.wicker.storagebasket.StorageBasket;

public class WickerRunner {
    public static void main(String[] args) {
        Wicker wicker = new Wicker();
        wicker.airy();
        wicker.woovenPattern();
        StorageBasket storageBasket = new StorageBasket();
        storageBasket.airy();
        storageBasket.woovenPattern();
        Wicker wicker1 = new StorageBasket();
        StorageBasket storageBasket1 =(StorageBasket) wicker1;
        System.out.println(storageBasket1);
    }
}
