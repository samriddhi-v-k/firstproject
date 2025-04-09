package com.xworkz.fablestreet;

import com.xworkz.fablestreet.constants.Password;
import com.xworkz.fablestreet.dto.FablestrettuserDTO;
import com.xworkz.fablestreet.fablestreetprofile.FabletsreetProfile;

public class FablestreetOfficial {
    public static void main(String[] args) {
        FablestrettuserDTO fablestrettuserDTO = new FablestrettuserDTO();
        fablestrettuserDTO.setName("don");
        fablestrettuserDTO.setDob("14-02-2009");
        fablestrettuserDTO.setEmail("don@gmail.com");
        fablestrettuserDTO.setPassword(Password.fablestreet);
        fablestrettuserDTO.setPassword(Password.fablestreet203);
        fablestrettuserDTO.setConfirmPassword("fablestreet");
        fablestrettuserDTO.setConfirmPassword("fablestreet203");
        FabletsreetProfile fabletsreetProfile = new FabletsreetProfile();
        if(fabletsreetProfile.validation(fablestrettuserDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");

    }

}
