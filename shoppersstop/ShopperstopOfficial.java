package com.xworkz.shoppersstop;

import com.xworkz.shopifyapp.shopifyprofile.ShopifyProfile;
import com.xworkz.shoppersstop.comstants.Password;
import com.xworkz.shoppersstop.dto.ShopperstopDTO;
import com.xworkz.shoppersstop.shopperstopprofile.Shoppersstopprofile;

public class ShopperstopOfficial {
    public static void main(String[] args) {
        ShopperstopDTO shopperstopDTO = new ShopperstopDTO();
        shopperstopDTO.setName("shopiie");
        shopperstopDTO.setEmail("shoppiee@gmai.com");
        shopperstopDTO.setDob("-08-02-2003");
        shopperstopDTO.setPassword(Password.cart);
        shopperstopDTO.setPassword(Password.shooping);
        shopperstopDTO.setConfirmPassword("cart");
        shopperstopDTO.setConfirmPassword("shooping");
        Shoppersstopprofile shoppersstopprofile = new Shoppersstopprofile();
        if(shoppersstopprofile.validation(shopperstopDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsucessful");
    }
}
