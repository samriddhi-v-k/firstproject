package com.xworkz.urbanic;

import com.xworkz.urbanic.constants.Password;
import com.xworkz.urbanic.dto.UrbanicDTO;
import com.xworkz.urbanic.urbanicprofile.UrbanicProfile;

public class UrbanicOfficial {
    public static void main(String[] args) {
        UrbanicDTO urbanicDTO = new UrbanicDTO();
        urbanicDTO.setName("vikas");
        urbanicDTO.setDob("14-02-2005");
        urbanicDTO.setEmail("vikas@gmail.com");
        urbanicDTO.setPassword(Password.urbanicdiscount);
        urbanicDTO.setPassword(Password.urbanicpro);
        urbanicDTO.setConfirmPassword("urbanicdiscount");
        urbanicDTO.setConfirmPassword("urbanicpro");
        UrbanicProfile urbanicProfile = new UrbanicProfile();
        if(urbanicProfile.validation(urbanicDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");

    }
}
