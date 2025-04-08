package com.xworkz.meeshowebsite;


import com.xworkz.meeshowebsite.constants.Password;
import com.xworkz.meeshowebsite.dto.MeeshoDto;
import com.xworkz.meeshowebsite.meeshoprofile.MeeshoProfile;

public class MeeshoRunner {
    public static void main(String[] args) {
        MeeshoDto meeshoDto = new MeeshoDto();
        meeshoDto.setDob("17-07-2003");
        meeshoDto.setEmail("sam@gmail.com");
        meeshoDto.setPassword(Password.meesho);
        meeshoDto.setPassword(Password.meeshorunner);
        meeshoDto.setConfirmPassword("meesho");
        meeshoDto.setConfirmPassword("meeshorunner");
        MeeshoProfile meeshoProfile = new MeeshoProfile();
        if(meeshoProfile.validation(meeshoDto)){
            System.out.println("successfull");
        }
        else System.out.println("unsucessful");
    }



}
