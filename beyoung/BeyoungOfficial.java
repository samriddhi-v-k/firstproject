package com.xworkz.beyoung;

import com.xworkz.beyoung.beyoungprofle.BeyoungProfile;
import com.xworkz.beyoung.constants.Password;
import com.xworkz.beyoung.dto.BeyounguserDTO;

public class BeyoungOfficial {
    public static void main(String[] args) {
        BeyounguserDTO beyounguserDTO = new BeyounguserDTO();
        beyounguserDTO.setName("shruthi");
        beyounguserDTO.setEmail("shruthi@gmial.com");
        beyounguserDTO.setDob("14-9-2008");
        beyounguserDTO.setPassword(Password.beyoungoffers);
        beyounguserDTO.setPassword(Password.coupons);
        beyounguserDTO.setConfirmPassword("beyoungoffers");
        beyounguserDTO.setConfirmPassword("coupons");
        BeyoungProfile beyoungProfile = new BeyoungProfile();
        if(beyoungProfile.validation(beyounguserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
