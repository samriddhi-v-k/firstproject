package com.xworkz.etsyapp;

import com.xworkz.etsyapp.constants.Password;
import com.xworkz.etsyapp.dto.EtsyuserDTO;
import com.xworkz.etsyapp.etsyprofile.EtsyProfile;


public class EtsyOfficial {

    public static void main(String[] args) {
        EtsyuserDTO etsyuserDTO = new EtsyuserDTO();

        etsyuserDTO.setDob("17-07-2003");
        etsyuserDTO.setEmail("sam@gmail.com");
        etsyuserDTO.setPassword(Password.hello);
        etsyuserDTO.setPassword(Password.hello123);
        etsyuserDTO.setConfirmPassword("meesho");
        etsyuserDTO.setConfirmPassword("meeshorunner");
        EtsyProfile etsyProfile = new EtsyProfile();
        if(etsyProfile.validation(etsyuserDTO)){
            System.out.println("successfull");
        }
        else System.out.println("unsucessful");
    }
}
