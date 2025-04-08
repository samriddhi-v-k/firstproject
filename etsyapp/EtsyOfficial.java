package com.xworkz.etsyapp;

import com.xworkz.etsyapp.constants.Password;
import com.xworkz.etsyapp.dto.EtsyDTO;
import com.xworkz.etsyapp.etsyprofile.EtsyProfile;


public class EtsyOfficial {

    public static void main(String[] args) {
        EtsyDTO etsyDTO = new EtsyDTO();

        etsyDTO.setDob("17-07-2003");
        etsyDTO.setEmail("sam@gmail.com");
        etsyDTO.setPassword(Password.hello);
        etsyDTO.setPassword(Password.hello123);
        etsyDTO.setConfirmPassword("meesho");
        etsyDTO.setConfirmPassword("meeshorunner");
        EtsyProfile etsyProfile = new EtsyProfile();
        if(etsyProfile.validation(etsyDTO)){
            System.out.println("successfull");
        }
        else System.out.println("unsucessful");
    }
}
