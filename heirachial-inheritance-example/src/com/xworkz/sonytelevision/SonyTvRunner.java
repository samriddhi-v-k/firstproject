package com.xworkz.sonytelevision;

import com.xworkz.sonytelevision.sonytv.amazonfirestick.AmazonFirestick;
import com.xworkz.sonytelevision.sonytv.tvremote.TvRemote;

public class SonyTvRunner {
    public static void main(String[] args) {
        AmazonFirestick amazonFirestick=new AmazonFirestick();
        amazonFirestick.ott();
        amazonFirestick.processor();
        TvRemote tvRemote=new TvRemote();
        tvRemote.manualChannelControl();
        tvRemote.processor();
    }
}
