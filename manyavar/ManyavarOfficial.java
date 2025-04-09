package com.xworkz.manyavar;

import com.xworkz.manyavar.constants.Password;
import com.xworkz.manyavar.dto.ManyavaruserDTO;
import com.xworkz.manyavar.manyavarprofile.ManyavarProfile;

public class ManyavarOfficial {
    public static void main(String[] args) {
        ManyavaruserDTO manyavaruserDTO = new ManyavaruserDTO();
        manyavaruserDTO.setName("dhoni");
        manyavaruserDTO.setDob("15-05-2005");
        manyavaruserDTO.setEmail("dhoni@gmail.com");
        manyavaruserDTO.setPassword(Password.kidscollection);
        manyavaruserDTO.setPassword(Password.manyavarwomencollection);
        manyavaruserDTO.setConfirmPassword("kidscollection");
        manyavaruserDTO.setConfirmPassword("manyavarwomencollection");
        ManyavarProfile manyavarProfile = new ManyavarProfile();
        if(manyavarProfile.validation(manyavaruserDTO))
        {
            System.out.println("sucessful");
        }
        else System.out.println("unsucessful");
    }
}
