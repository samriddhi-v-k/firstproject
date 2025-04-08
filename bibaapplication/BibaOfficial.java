package com.xworkz.bibaapplication;

import com.xworkz.bibaapplication.bibaprofile.Bibaprofile;
import com.xworkz.bibaapplication.constants.Password;
import com.xworkz.bibaapplication.dto.BibaDTO;

public class BibaOfficial {
    public static void main(String[] args) {
        BibaDTO bibaDTO = new BibaDTO();
        bibaDTO.getName("shraddha");
        bibaDTO.getDob("18-02-2008");
        bibaDTO.getEmail("shraddha@gmail.com");
        bibaDTO.getPassword(Password.bibanewcollection);
        bibaDTO.getPassword(Password.bibasummeroffer);
        bibaDTO.getConfirmPassword("bibanewcollection");
        bibaDTO.getConfirmPassword("bibasummeroffer");
        Bibaprofile bibaprofile = new Bibaprofile();
        if(bibaprofile.validation(bibaDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
