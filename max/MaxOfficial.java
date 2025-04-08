package com.xworkz.max;

import com.xworkz.max.constants.Password;
import com.xworkz.max.dto.MaxDTO;
import com.xworkz.max.maxprofile.Maxprofile;

public class MaxOfficial {
    public static void main(String[] args) {
        MaxDTO maxDTO = new MaxDTO();
        maxDTO.setName("max");
        maxDTO.setEmail("max@gmail.com");
        maxDTO.setDob("16-07-2008");
        maxDTO.setPassword(Password.max10);
        maxDTO.setPassword(Password.max20);
        maxDTO.setConfirmPassword("max10");
        maxDTO.setConfirmPassword("max20");
        Maxprofile maxprofile = new Maxprofile();
        if(maxprofile.validation(maxDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");
    }
}
