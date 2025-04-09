package com.xworkz.snapdeal;

import com.xworkz.snapdeal.constants.Password;
import com.xworkz.snapdeal.dto.SnapdealuserDTO;
import com.xworkz.snapdeal.snapdealProfile.SnapdealProfile;

public class SnapdealOfficial {
    public static void main(String[] args) {
        SnapdealuserDTO snapdealuserDTO = new SnapdealuserDTO();
        snapdealuserDTO.setDob("14-07-2002");
        snapdealuserDTO.setName("virat");
        snapdealuserDTO.setEmail("virat@gmail.com");
        snapdealuserDTO.setPassword("snapdeal");
        snapdealuserDTO.setPassword("cracksnapdeal");
        snapdealuserDTO.setConfirmPassword("snapdeal");
        snapdealuserDTO.setConfirmPassword("cracksnapdeal");
        SnapdealProfile snapdealProfile = new SnapdealProfile();
        if(snapdealProfile.validation(snapdealuserDTO))
        {
            System.out.println("successful");
        }
        else
            System.out.println("unsucessful");

    }
}
