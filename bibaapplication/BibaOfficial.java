package com.xworkz.bibaapplication;

import com.xworkz.bibaapplication.bibaprofile.Bibaprofile;
import com.xworkz.bibaapplication.constants.Password;
import com.xworkz.bibaapplication.dto.BibauserDTO;

public class BibaOfficial {
    public static void main(String[] args) {
        BibauserDTO bibauserDTO = new BibauserDTO();
        bibauserDTO.setName("shraddha");
        bibauserDTO.setDob("18-02-2008");
        bibauserDTO.setEmail("shraddha@gmail.com");
        bibauserDTO.setPassword(Password.bibanewcollection);
        bibauserDTO.setPassword(Password.bibasummeroffer);
        bibauserDTO.setConfirmPassword("bibanewcollection");
        bibauserDTO.setConfirmPassword("bibasummeroffer");
        Bibaprofile bibaprofile = new Bibaprofile();
        if(bibaprofile.validation(bibauserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
