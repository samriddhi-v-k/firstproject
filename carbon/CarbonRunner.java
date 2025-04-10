package com.xworkz.carbon;

import com.xworkz.carbon.charcoalmask.CharcoalMask;

public class CarbonRunner {
    public static void main(String[] args) {
        Carbon carbon =new Carbon();
        carbon.alltropes();
        carbon.covalentBonds();
        CharcoalMask charcoalMask = new CharcoalMask();
        charcoalMask.alltropes();
        charcoalMask.covalentBonds();
    }
}
