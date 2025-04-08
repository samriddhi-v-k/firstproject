package com.xworkz.tatacliq;

import com.xworkz.tatacliq.constants.Password;
import com.xworkz.tatacliq.dto.TatacliqDTO;
import com.xworkz.tatacliq.tatacliqprofile.TatacliqProfile;

public class TatacliqOfficial {
    public static void main(String[] args) {
        TatacliqDTO tatacliqDTO = new TatacliqDTO();
        tatacliqDTO.setName("ratan");
        tatacliqDTO.setEmail("ratan@gmail.com");
        tatacliqDTO.setDob("08-01-2002");
        tatacliqDTO.setPassword(Password.tatacliq30);
        tatacliqDTO.setPassword(Password.tatacliq45);
        tatacliqDTO.setConfirmPassword("tatacliq30");
        tatacliqDTO.setConfirmPassword("tatacliq45");
        TatacliqProfile tatacliqProfile = new TatacliqProfile();
        if(tatacliqProfile.validation(tatacliqDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");
    }
}
