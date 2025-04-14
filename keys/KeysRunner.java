package com.xworkz.keys;

import com.xworkz.keys.officekeys.OfficeKeys;

public class KeysRunner {
    public static void main(String[] args) {
        Keys keys = new Keys();
        keys.color();
        keys.openLocks();

        OfficeKeys officeKeys = new OfficeKeys();
        officeKeys.color();
        officeKeys.openLocks();

        Keys keys1 = new OfficeKeys();
        OfficeKeys officeKeys1 =(OfficeKeys) keys1;
        System.out.println(officeKeys1);
    }
}
