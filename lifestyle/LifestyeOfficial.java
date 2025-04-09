package com.xworkz.lifestyle;

import com.xworkz.lifestyle.constants.Password;
import com.xworkz.lifestyle.dto.LifestyleuserDTO;
import com.xworkz.lifestyle.lifestyleprofile.LifestyleProfile;

public class LifestyeOfficial {
    public static void main(String[] args) {
        LifestyleuserDTO lifestyleuserDTO = new LifestyleuserDTO();
        lifestyleuserDTO.setName("lifestyle");
        lifestyleuserDTO.setEmail("lifestyle@gmail.com");
        lifestyleuserDTO.setDob("1-02-2004");
        lifestyleuserDTO.setPassword(Password.life);
        lifestyleuserDTO.setPassword(Password.style);
        lifestyleuserDTO.setConfirmPassword("life");
        lifestyleuserDTO.setConfirmPassword("style");
        LifestyleProfile lifestyleProfile = new LifestyleProfile();
        if(lifestyleProfile.validation(lifestyleuserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
