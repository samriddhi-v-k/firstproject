package com.xworkz.snapdeal;

import com.xworkz.snapdeal.constants.Password;
import com.xworkz.snapdeal.dto.SnapdealDTO;
import com.xworkz.snapdeal.snapdealProfile.SnapdealProfile;

public class SnapdealOfficial {
    public static void main(String[] args) {
        SnapdealDTO snapdealDTO = new SnapdealDTO();
        snapdealDTO.getDob("14-07-2002");
        snapdealDTO.getName("virat");
        snapdealDTO.getEmail("virat@gmail.com");
        snapdealDTO.getPassword(Password.snapdeal);
        snapdealDTO.getPassword(Password.cracksnapdeal);
        snapdealDTO.getConfirmPassword("snapdeal");
        snapdealDTO.getConfirmPassword("cracksnapdeal");
        SnapdealProfile snapdealProfile = new SnapdealProfile();
        if(snapdealProfile.validation(snapdealDTO))
        {
            System.out.println("successful");
        }
        else
            System.out.println("unsucessful");

    }
}
