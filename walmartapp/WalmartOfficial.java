package com.xworkz.walmartapp;

import com.xworkz.walmartapp.constants.Password;
import com.xworkz.walmartapp.dto.WalmartDto;
import com.xworkz.walmartapp.walmartprofile.WalmartProfile;

public class WalmartOfficial {
    public static void main(String[] args) {
        WalmartDto walmartDto = new WalmartDto();
        walmartDto.getDob("17-07-2003");
        walmartDto.getName("samriddhi");
        walmartDto.getEmail("samriddhi@gmail.com");
        walmartDto.getPassword(Password.getHellowalmart);
        walmartDto.getPassword(Password.hellowalmart);
        walmartDto.getConfirmPassword("gethellowalmart");
        walmartDto.getConfirmPassword("helowalmart");
        WalmartProfile walmartProfile = new WalmartProfile();
        if(walmartProfile.validation(walmartDto))
        {
            System.out.println("successful");
        }
        else
            System.out.println("unsussful");

    }


}
