package com.xworkz.max;

import com.xworkz.max.constants.Password;
import com.xworkz.max.dto.MaxuserDTO;
import com.xworkz.max.maxprofile.Maxprofile;

public class MaxOfficial {
    public static void main(String[] args) {
        MaxuserDTO maxuserDTO = new MaxuserDTO();
        maxuserDTO.setName("max");
        maxuserDTO.setEmail("max@gmail.com");
        maxuserDTO.setDob("16-07-2008");
        maxuserDTO.setPassword(Password.max10);
        maxuserDTO.setPassword(Password.max20);
        maxuserDTO.setConfirmPassword("max10");
        maxuserDTO.setConfirmPassword("max20");
        Maxprofile maxprofile = new Maxprofile();
        if(maxprofile.validation(maxuserDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");
    }
}
