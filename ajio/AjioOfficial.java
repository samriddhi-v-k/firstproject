package com.xworkz.ajio;

import com.xworkz.ajio.ajioProfile.AjioProfile;
import com.xworkz.ajio.constants.Password;
import com.xworkz.ajio.dto.AjioDTO;

public class AjioOfficial {
    public static void main(String[] args) {
        AjioDTO ajioDTO = new AjioDTO();
        ajioDTO.getDob("10-02-2002");
        ajioDTO.getName("sachin");
        ajioDTO.getEmail("sachin@gmail.com");
        ajioDTO.getPassword(Password.ajio500);
        ajioDTO.getPassword(Password.ajiooffer);
        ajioDTO.setConfirmPassword("ajio500");
        ajioDTO.setConfirmPassword("ajiooffer");
        AjioProfile ajioProfile = new AjioProfile();
        if(ajioProfile.validation(ajioDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");
    }
}
