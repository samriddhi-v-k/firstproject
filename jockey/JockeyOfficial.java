package com.xworkz.jockey;

import com.xworkz.jockey.dto.JockeyuserDTO;
import com.xworkz.jockey.jockeyprofile.Jockeyprofile;

public class JockeyOfficial {
    public static void main(String[] args) {
        JockeyuserDTO jockeyuserDTO = new JockeyuserDTO();
        jockeyuserDTO.setName("anil");
        jockeyuserDTO.setDob("03-02-2005");
        jockeyuserDTO.setEmail("anil@gmail.com");
        jockeyuserDTO.setPassword("asddsfjfj");
        jockeyuserDTO.setConfirmPassword("asddsfjfj");
        Jockeyprofile jockeyprofile = new Jockeyprofile();
        if(jockeyprofile.validation(jockeyuserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");

    }
}
