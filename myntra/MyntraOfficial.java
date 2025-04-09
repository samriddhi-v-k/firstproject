package com.xworkz.myntra;

import com.xworkz.myntra.constanats.Password;
import com.xworkz.myntra.dto.MyntrauserDTO;
import com.xworkz.myntra.myntraprofile.MyntraProfile;

public class MyntraOfficial {
    public static void main(String[] args) {
        MyntrauserDTO myntrauserDTO = new MyntrauserDTO();
        myntrauserDTO.setDob("10-02-2004");
        myntrauserDTO.setName("anika");
        myntrauserDTO.setEmail("anika@gmailcom");
        myntrauserDTO.setPassword(Password.mymytntra);
        myntrauserDTO.setPassword(Password.shoppingkurthis);
        myntrauserDTO.getConfirmPassword("mymyntra");
        myntrauserDTO.getConfirmPassword("shoppingkurthis");
        MyntraProfile myntraProfile = new MyntraProfile();
        if(myntraProfile.validation(myntrauserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
