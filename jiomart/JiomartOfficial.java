package com.xworkz.jiomart;

import com.xworkz.jiomart.constants.Password;
import com.xworkz.jiomart.dto.JomartDTO;
import com.xworkz.jiomart.jioprofile.Jioprofile;

public class JiomartOfficial {
    public static void main(String[] args) {
        JomartDTO jomartDTO = new JomartDTO();
        jomartDTO.setName("jio");
        jomartDTO.setEmail("jio@gmail.com");
        jomartDTO.setDob("01-01-2001");
        jomartDTO.setPassword(Password.jiodhandhan);
        jomartDTO.setPassword(Password.jiojio);
        jomartDTO.setConfirmPassword("jiodhandhan");
        jomartDTO.setConfirmPassword("jiojio");
        Jioprofile jioprofile =new Jioprofile();
        if(jioprofile.validation(jomartDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
