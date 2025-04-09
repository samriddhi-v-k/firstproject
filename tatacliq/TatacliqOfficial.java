package com.xworkz.tatacliq;

import com.xworkz.tatacliq.constants.Password;
import com.xworkz.tatacliq.dto.TatacliquserDTO;
import com.xworkz.tatacliq.tatacliqprofile.TatacliqProfile;

public class TatacliqOfficial {
    public static void main(String[] args) {
        TatacliquserDTO tatacliquserDTO = new TatacliquserDTO();
        tatacliquserDTO.setName("ratan");
        tatacliquserDTO.setEmail("ratan@gmail.com");
        tatacliquserDTO.setDob("08-01-2002");
        tatacliquserDTO.setPassword("tatacliq30");
        tatacliquserDTO.setPassword("tatacliq45");
        tatacliquserDTO.setConfirmPassword("tatacliq30");
        tatacliquserDTO.setConfirmPassword("tatacliq45");
        TatacliqProfile tatacliqProfile = new TatacliqProfile();
        if(tatacliqProfile.validation(tatacliquserDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");
    }
}
