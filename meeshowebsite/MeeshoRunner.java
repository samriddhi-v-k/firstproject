package com.xworkz.meeshowebsite;


import com.xworkz.meeshowebsite.constants.Password;
import com.xworkz.meeshowebsite.dto.MeeshouserDto;
import com.xworkz.meeshowebsite.meeshoprofile.MeeshoProfile;

public class MeeshoRunner {
    public static void main(String[] args) {
        MeeshouserDto meeshouserDto = new MeeshouserDto();
        meeshouserDto.setDob("17-07-2003");
        meeshouserDto.setEmail("sam@gmail.com");
        meeshouserDto.setPassword(Password.meesho);
        meeshouserDto.setPassword(Password.meeshorunner);
        meeshouserDto.setConfirmPassword("meesho");
        meeshouserDto.setConfirmPassword("meeshorunner");
        MeeshoProfile meeshoProfile = new MeeshoProfile();
        if(meeshoProfile.validation(meeshouserDto)){
            System.out.println("successfull");
        }
        else System.out.println("unsucessful");
    }



}
