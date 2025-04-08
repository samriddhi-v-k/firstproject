package com.xworkz.beyoung;

import com.xworkz.beyoung.beyoungprofle.BeyoungProfile;
import com.xworkz.beyoung.constants.Password;
import com.xworkz.beyoung.dto.BeyoungDTO;

public class BeyoungOfficial {
    public static void main(String[] args) {
        BeyoungDTO beyoungDTO = new BeyoungDTO();
        beyoungDTO.setName("shruthi");
        beyoungDTO.setEmail("shruthi@gmial.com");
        beyoungDTO.setDob("14-9-2008");
        beyoungDTO.setPassword(Password.beyoungoffers);
        beyoungDTO.setPassword(Password.coupons);
        beyoungDTO.setConfirmPassword("beyoungoffers");
        beyoungDTO.setConfirmPassword("coupons");
        BeyoungProfile beyoungProfile = new BeyoungProfile();
        if(beyoungProfile.validation(beyoungDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
