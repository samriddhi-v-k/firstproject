package com.xworkz.urbanic;

import com.xworkz.urbanic.constants.Password;
import com.xworkz.urbanic.dto.UrbanicuserDTO;
import com.xworkz.urbanic.urbanicprofile.UrbanicProfile;

public class UrbanicOfficial {
    public static void main(String[] args) {
        UrbanicuserDTO urbanicuserDTO = new UrbanicuserDTO();
        urbanicuserDTO.setName("vikas");
        urbanicuserDTO.setDob("14-02-2005");
        urbanicuserDTO.setEmail("vikas@gmail.com");
        urbanicuserDTO.setPassword("urbanicdiscount");
        urbanicuserDTO.setPassword("urbanicpro");
        urbanicuserDTO.setConfirmPassword("urbanicdiscount");
        urbanicuserDTO.setConfirmPassword("urbanicpro");
        UrbanicProfile urbanicProfile = new UrbanicProfile();
        if(urbanicProfile.validation(urbanicuserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");

    }
}
