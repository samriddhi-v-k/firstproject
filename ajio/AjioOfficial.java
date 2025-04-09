package com.xworkz.ajio;

import com.xworkz.ajio.ajioProfile.AjioProfile;
import com.xworkz.ajio.constants.Password;
import com.xworkz.ajio.dto.AjiouserDTO;
import com.xworkz.ajio.dto.AjiouserDTO;

public class AjioOfficial {
    public static void main(String[] args) {
        AjiouserDTO ajioDTO = new AjiouserDTO();
        ajioDTO.setDob("10-02-2002");
        ajioDTO.setName("sachin");
        ajioDTO.setEmail("sachin@gmail.com");
        ajioDTO.setPassword("ajiooffer");
        ajioDTO.setConfirmPassword("ajio500");
        AjioProfile ajioProfile = new AjioProfile();
        if(ajioProfile.validation(ajioDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");
    }
}
