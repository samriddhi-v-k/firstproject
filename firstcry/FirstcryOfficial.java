package com.xworkz.firstcry;

import com.xworkz.firstcry.constants.Password;
import com.xworkz.firstcry.dto.FirstcryDTO;
import com.xworkz.firstcry.firstcryprofile.FirstcryProfile;

public class FirstcryOfficial {
    public static void main(String[] args) {
        FirstcryDTO firstcryDTO = new FirstcryDTO();
        firstcryDTO.setName("first user");
        firstcryDTO.setEmail("firstuser@gmail.com");
        firstcryDTO.setDob("09-08-2003");
        firstcryDTO.setPassword(Password.firstcry100);
        firstcryDTO.setPassword(Password.firstcry200);
        firstcryDTO.setConfirmPassword("firstcry100");
        firstcryDTO.setConfirmPassword("firstcry200");
        FirstcryProfile firstcryProfile = new FirstcryProfile();
        if(firstcryProfile.validation(firstcryDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }

}
