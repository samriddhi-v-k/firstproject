package com.xworkz.shoppersstop;

import com.xworkz.shoppersstop.comstants.Password;
import com.xworkz.shoppersstop.dto.ShopperstopuserDTO;
import com.xworkz.shoppersstop.shopperstopprofile.Shoppersstopprofile;

public class ShopperstopOfficial {
    public static void main(String[] args) {
        ShopperstopuserDTO shopperstopuserDTO = new ShopperstopuserDTO();
        shopperstopuserDTO.setName("shopiie");
        shopperstopuserDTO.setEmail("shoppiee@gmai.com");
        shopperstopuserDTO.setDob("-08-02-2003");
        shopperstopuserDTO.setPassword(Password.cart);
        shopperstopuserDTO.setPassword(Password.shooping);
        shopperstopuserDTO.setConfirmPassword("cart");
        shopperstopuserDTO.setConfirmPassword("shooping");
        Shoppersstopprofile shoppersstopprofile = new Shoppersstopprofile();
        if(shoppersstopprofile.validation(shopperstopuserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
