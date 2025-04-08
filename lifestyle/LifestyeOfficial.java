package com.xworkz.lifestyle;

import com.xworkz.lifestyle.constants.Password;
import com.xworkz.lifestyle.dto.LifestyleDTO;
import com.xworkz.lifestyle.lifestyleprofile.LifestyleProfile;

import javax.jnlp.ClipboardService;

public class LifestyeOfficial {
    public static void main(String[] args) {
        LifestyleDTO lifestyleDTO = new LifestyleDTO();
        lifestyleDTO.setName("lifestyle");
        lifestyleDTO.setEmail("lifestyle@gmail.com");
        lifestyleDTO.setDob("1-02-2004");
        lifestyleDTO.setPassword(Password.life);
        lifestyleDTO.setPassword(Password.style);
        lifestyleDTO.setConfirmPassword("life");
        lifestyleDTO.setConfirmPassword("style");
        LifestyleProfile lifestyleProfile = new LifestyleProfile();
        if(lifestyleProfile.validation(lifestyleDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
