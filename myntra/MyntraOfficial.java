package com.xworkz.myntra;

import com.xworkz.myntra.constanats.Password;
import com.xworkz.myntra.dto.MyntraDTO;
import com.xworkz.myntra.myntraprofile.MyntraProfile;

public class MyntraOfficial {
    public static void main(String[] args) {
        MyntraDTO myntraDTO = new MyntraDTO();
        myntraDTO.setDob("10-02-2004");
        myntraDTO.setName("anika");
        myntraDTO.setEmail("anika@gmailcom");
        myntraDTO.setPassword(Password.mymytntra);
        myntraDTO.setPassword(Password.shoppingkurthis);
        myntraDTO.getConfirmPassword("mymyntra");
        myntraDTO.getConfirmPassword("shoppingkurthis");
        MyntraProfile myntraProfile = new MyntraProfile();
        if(myntraProfile.validation(myntraDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
