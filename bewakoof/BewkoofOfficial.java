package com.xworkz.bewakoof;

import com.xworkz.bewakoof.bewskoofprofile.BewakoofProfile;
import com.xworkz.bewakoof.constants.Password;
import com.xworkz.bewakoof.dto.BewakoofDTO;

public class BewkoofOfficial {
    public static void main(String[] args) {
        BewakoofDTO bewakoofDTO =new BewakoofDTO();
        bewakoofDTO.setName("edjpk");
        bewakoofDTO.setEmail("eeodij@gmail.com");
        bewakoofDTO.setDob("e482749");
        bewakoofDTO.setPassword(Password.bewakoofcoupons);
        bewakoofDTO.setPassword(Password.bewakoofoffers);
        bewakoofDTO.setConfirmPassword("bewakoofcoupons");
        bewakoofDTO.setConfirmPassword("bewakoofoffers");
        BewakoofProfile bewakoofProfile =new BewakoofProfile();
        if(bewakoofProfile.validation(bewakoofDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }

}
