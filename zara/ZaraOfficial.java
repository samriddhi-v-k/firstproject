package com.xworkz.zara;

import com.xworkz.zara.constants.Password;
import com.xworkz.zara.dto.ZaraDTO;
import com.xworkz.zara.zaraprofile.ZaraProfile;

public class ZaraOfficial {
    public static void main(String[] args) {
        ZaraDTO zaraDTO = new ZaraDTO();
        zaraDTO.setName("anushka");
        zaraDTO.setEmail("anushka@gmail.com");
        zaraDTO.setDob("16-08-2002");
        zaraDTO.setPassword(Password.zara40off);
        zaraDTO.setPassword(Password.zara80off);
        zaraDTO.setConfirmPassword("zara40off");
        zaraDTO.setConfirmPassword("zara80off");
        ZaraProfile zaraProfile = new ZaraProfile();
        if(zaraProfile.validation(zaraDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
