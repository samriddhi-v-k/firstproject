package com.xworkz.flipkartwebsite;

import com.xworkz.flipkartwebsite.constants.Password;
import com.xworkz.flipkartwebsite.dto.FlipkartuserDTO;
import com.xworkz.flipkartwebsite.flipkartprofile.FlipkartProfile;

public class FlipkartOfficial {
    public static void main(String[] args) {
        FlipkartuserDTO flipkartuserDTO = new FlipkartuserDTO();
        flipkartuserDTO.setDob("13-09-2005");
        flipkartuserDTO.setName("soumya");
        flipkartuserDTO.setEmail("soumya@gmail.com");
        flipkartuserDTO.setPassword(Password.flipkart);
        flipkartuserDTO.setPassword(Password.samflipkart);
        flipkartuserDTO.setConfirmPassword("flipkart");
        flipkartuserDTO.setConfirmPassword("samflipkart");
        FlipkartProfile flipkartProfile = new FlipkartProfile();
        if(flipkartProfile.validation(flipkartuserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
