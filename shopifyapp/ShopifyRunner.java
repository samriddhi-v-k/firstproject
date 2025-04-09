package com.xworkz.shopifyapp;

import com.xworkz.shopifyapp.constants.Password;
import com.xworkz.shopifyapp.dto.ShopifyuserDTO;
import com.xworkz.shopifyapp.shopifyprofile.ShopifyProfile;

public class ShopifyRunner {
    public static void main(String[] args) {
        ShopifyuserDTO shopifyuserDTO = new ShopifyuserDTO();
        shopifyuserDTO.setDob("17-04-2003");
        shopifyuserDTO.setEmail("anaya@gmail.com");
        shopifyuserDTO.setName("anaya pandey");
        shopifyuserDTO.setPassword(Password.shopify);
        shopifyuserDTO.setPassword(Password.shpoifyshop);
        shopifyuserDTO.setConfirmPassword("shopify");
        shopifyuserDTO.setConfirmPassword("shopifyshop");
        ShopifyProfile shopifyProfile = new ShopifyProfile();
        if(shopifyProfile.validation(shopifyuserDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsuccessful");
    }
}
