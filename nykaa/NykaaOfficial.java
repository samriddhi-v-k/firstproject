package com.xworkz.nykaa;

import com.xworkz.nykaa.constants.Password;
import com.xworkz.nykaa.dto.NykaaDTO;
import com.xworkz.nykaa.nykaaprofile.NykaaProfile;

public class NykaaOfficial {
    public static void main(String[] args) {
        NykaaDTO nykaaDTO = new NykaaDTO();
        nykaaDTO.setName("niktihta");
        nykaaDTO.setEmail("nikitha@gmail.com");
        nykaaDTO.setDob("20-03-2003");
        nykaaDTO.setPassword(Password.nykaa50);
        nykaaDTO.setPassword(Password.nykaa70);
        nykaaDTO.setConfirmPassword("nykaa50");
        nykaaDTO.setConfirmPassword("nykaa70");
        NykaaProfile nykaaProfile = new NykaaProfile();
        if(nykaaProfile.validation(nykaaDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
