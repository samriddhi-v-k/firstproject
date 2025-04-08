package com.xworkz.paytm;

import com.xworkz.paytm.constants.Password;
import com.xworkz.paytm.dto.PaytmDto;
import com.xworkz.paytm.paytmprofile.PaytmProfile;

public class PaytmOfficial {
    public static void main(String[] args) {
        PaytmDto paytmDto = new PaytmDto();
        paytmDto.getDob("14-05-2007");
        paytmDto.getName("rachin");
        paytmDto.getEmail("rachin123@gmial.com");
        paytmDto.getPassword(Password.paytmcoupn);
        paytmDto.getPassword(Password.paytmoffers);
        paytmDto.getConfirmPassword("paytmcoupn");
        paytmDto.getConfirmPassword("paytmoffers");
        PaytmProfile paytmProfile = new PaytmProfile();
        if(paytmProfile.validation(paytmDto))
        {
            System.out.println("successful");
        }
        else System.out.println("unsuccessful");
    }
}
