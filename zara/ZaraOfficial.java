package com.xworkz.zara;

import com.xworkz.zara.constants.Password;
import com.xworkz.zara.dto.ZarauserDTO;
import com.xworkz.zara.zaraprofile.ZaraProfile;

public class ZaraOfficial {
    public static void main(String[] args) {
        ZarauserDTO zarauserDTO = new ZarauserDTO();
        zarauserDTO.setName("anushka");
        zarauserDTO.setEmail("anushka@gmail.com");
        zarauserDTO.setDob("16-08-2002");
        zarauserDTO.setPassword("zara40off");
        zarauserDTO.setPassword("zara80off");
        zarauserDTO.setConfirmPassword("zara40off");
        zarauserDTO.setConfirmPassword("zara80off");
        ZaraProfile zaraProfile = new ZaraProfile();
        if(zaraProfile.validation(zarauserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
