package com.xworkz.paytm;

import com.xworkz.paytm.constants.Password;
import com.xworkz.paytm.dto.PaytmuserDto;
import com.xworkz.paytm.paytmprofile.PaytmProfile;

public class PaytmOfficial {
    public static void main(String[] args) {
        PaytmuserDto paytmuserDto = new PaytmuserDto();
        paytmuserDto.getDob("14-05-2007");
        paytmuserDto.getName("rachin");
        paytmuserDto.getEmail("rachin123@gmial.com");
        paytmuserDto.getPassword(Password.paytmcoupn);
        paytmuserDto.getPassword(Password.paytmoffers);
        paytmuserDto.getConfirmPassword("paytmcoupn");
        paytmuserDto.getConfirmPassword("paytmoffers");
        PaytmProfile paytmProfile = new PaytmProfile();
        if(paytmProfile.validation(paytmuserDto))
        {
            System.out.println("successful");
        }
        else System.out.println("unsuccessful");
    }
}
