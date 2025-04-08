package com.xworkz.shopifyapp;

import com.xworkz.shopifyapp.constants.Password;
import com.xworkz.shopifyapp.dto.ShopifyDTO;
import com.xworkz.shopifyapp.shopifyprofile.ShopifyProfile;

public class ShopifyRunner {
    public static void main(String[] args) {
        ShopifyDTO shopifyDTO = new ShopifyDTO();
        shopifyDTO.setDob("17-04-2003");
        shopifyDTO.setEmail("anaya@gmail.com");
        shopifyDTO.setName("anaya pandey");
        shopifyDTO.setPassword(Password.shopify);
        shopifyDTO.setPassword(Password.shpoifyshop);
        shopifyDTO.setConfirmPassword("shopify");
        shopifyDTO.setConfirmPassword("shopifyshop");
        ShopifyProfile shopifyProfile = new ShopifyProfile();
        if(shopifyProfile.validation(shopifyDTO))
        {
            System.out.println("successful");
        }
        else System.out.println("unsuccessful");
    }
}
