package com.xworkz.nykaa;

import com.xworkz.nykaa.constants.Password;
import com.xworkz.nykaa.dto.NykaauserDTO;
import com.xworkz.nykaa.nykaaprofile.NykaaProfile;

public class NykaaOfficial {
    public static void main(String[] args) {
        NykaauserDTO nykaauserDTO = new NykaauserDTO();
        nykaauserDTO.setName("niktihta");
        nykaauserDTO.setEmail("nikitha@gmail.com");
        nykaauserDTO.setDob("20-03-2003");
        nykaauserDTO.setPassword(Password.nykaa50);
        nykaauserDTO.setPassword(Password.nykaa70);
        nykaauserDTO.setConfirmPassword("nykaa50");
        nykaauserDTO.setConfirmPassword("nykaa70");
        NykaaProfile nykaaProfile = new NykaaProfile();
        if(nykaaProfile.validation(nykaauserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
