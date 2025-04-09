package com.xworkz.shopifyapp.shopifyprofile;


import com.xworkz.shopifyapp.dto.ShopifyuserDTO;

public class ShopifyProfile {
    public boolean registration(ShopifyuserDTO shopifyuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(shopifyuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(ShopifyuserDTO shopifyuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(shopifyuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(shopifyuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(shopifyuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(shopifyuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(shopifyuserDTO.getName()!=null)
        {
            isnameValid=true;
        }
        if(isdobValid==true&&isemailValid==true&&ispasswordValid==true&&isconfirmPasswordValid==true&&isnameValid)
        {
            System.out.println("user sign in successful");
            return  isuserValidated;
        }
        else System.out.println("unser sign in unsucessful");
        return isuserValidated;
    }
}
