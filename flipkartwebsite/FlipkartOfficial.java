package com.xworkz.flipkartwebsite;

import com.xworkz.flipkartwebsite.constants.Password;
import com.xworkz.flipkartwebsite.dto.FlipkartDTO;
import com.xworkz.flipkartwebsite.flipkartprofile.FlipkartProfile;

public class FlipkartOfficial {
    public static void main(String[] args) {
        FlipkartDTO flipkartDTO = new FlipkartDTO();
        flipkartDTO.getDob("13-09-2005");
        flipkartDTO.getName("soumya");
        flipkartDTO.getEmail("soumya@gmail.com");
        flipkartDTO.getPassword(Password.flipkart);
        flipkartDTO.getPassword(Password.samflipkart);
        flipkartDTO.getConfirmPassword("flipkart");
        flipkartDTO.getConfirmPassword("samflipkart");
        FlipkartProfile flipkartProfile = new FlipkartProfile();
        if(flipkartProfile.validation(flipkartDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
