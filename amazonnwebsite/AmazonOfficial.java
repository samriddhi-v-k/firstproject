package com.xworkz.amazonnwebsite;

import com.xworkz.amazonnwebsite.amazon.AmazonProfile;
import com.xworkz.amazonnwebsite.constants.Password;
import com.xworkz.amazonnwebsite.dto.AmazonDTO;

public class AmazonOfficial {
    public static void main(String[] args) {
        AmazonDTO amazonDTO = new AmazonDTO();
        amazonDTO.setDob("17-07-2003");
        amazonDTO.setEmail("sam@gmail.com");
        amazonDTO.setPassword(Password.sam123);
        amazonDTO.setPassword(Password.samriddhivk1707);
        amazonDTO.setConfirmPassword("sam123");
        amazonDTO.setConfirmPassword("samriddhivk1707");
        AmazonProfile amazonProfile = new AmazonProfile();
        if(amazonProfile.validation(amazonDTO))
        {
            System.out.println("user registered");
        }
        else
        {
            System.out.println("not registered");
        }

    }
}
