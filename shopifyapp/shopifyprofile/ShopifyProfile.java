package com.xworkz.shopifyapp.shopifyprofile;


import com.xworkz.shopifyapp.dto.ShopifyDTO;

public class ShopifyProfile {
    public boolean registration(ShopifyDTO shopifyDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(shopifyDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(ShopifyDTO shopifyDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(shopifyDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(shopifyDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(shopifyDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(shopifyDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(shopifyDTO.getName()!=null)
        {
            isnameValid=true;
        }
        if(isdobValid==true&&isemailValid==true&&ispasswordValid==true&&isconfirmPasswordValid==true&&isnameValid)
        {
            System.out.println("user sign in successful");
        }
        else System.out.println("unser sign in unsucessful");
        return isuserValidated;
    }
}
