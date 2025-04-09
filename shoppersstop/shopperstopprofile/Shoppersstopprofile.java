package com.xworkz.shoppersstop.shopperstopprofile;


import com.xworkz.shoppersstop.dto.ShopperstopuserDTO;

public class Shoppersstopprofile {
    public boolean registration(ShopperstopuserDTO shopperstopuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(shopperstopuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(ShopperstopuserDTO shopperstopuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(shopperstopuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(shopperstopuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(shopperstopuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(shopperstopuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(shopperstopuserDTO.getName()!=null)
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
