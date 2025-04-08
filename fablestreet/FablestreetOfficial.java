package com.xworkz.fablestreet;

import com.xworkz.fablestreet.constants.Password;
import com.xworkz.fablestreet.dto.FablestrettDTO;
import com.xworkz.fablestreet.fablestreetprofile.FabletsreetProfile;

public class FablestreetOfficial {
    public static void main(String[] args) {
        FablestrettDTO fablestrettDTO = new FablestrettDTO();
        fablestrettDTO.setName("don");
        fablestrettDTO.setDob("14-02-2009");
        fablestrettDTO.setEmail("don@gmail.com");
        fablestrettDTO.setPassword(Password.fablestreet);
        fablestrettDTO.setPassword(Password.fablestreet203);
        fablestrettDTO.setConfirmPassword("fablestreet");
        fablestrettDTO.setConfirmPassword("fablestreet203");
        FabletsreetProfile fabletsreetProfile = new FabletsreetProfile();
        if(fabletsreetProfile.validation(fablestrettDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");

    }

}
