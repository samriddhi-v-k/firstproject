package com.xworkz.walmartapp;

import com.xworkz.walmartapp.constants.Password;
import com.xworkz.walmartapp.dto.WalmartuserDto;
import com.xworkz.walmartapp.walmartprofile.WalmartProfile;

public class WalmartOfficial {
    public static void main(String[] args) {
        WalmartuserDto walmartuserDto = new WalmartuserDto();
        walmartuserDto.setDob("17-07-2003");
        walmartuserDto.setName("samriddhi");
        walmartuserDto.setEmail("samriddhi@gmail.com");
        walmartuserDto.setPassword("getHellowalmart");
        walmartuserDto.setPassword("hellowalmart");
        walmartuserDto.setConfirmPassword("gethellowalmart");
        walmartuserDto.setConfirmPassword("helowalmart");
        WalmartProfile walmartProfile = new WalmartProfile();
        if(walmartProfile.validation(walmartuserDto))
        {
            System.out.println("successful");
        }
        else
            System.out.println("unsussful");

    }


}
