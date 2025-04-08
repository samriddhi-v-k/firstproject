package com.xworkz.shoppersstop.shopperstopprofile;


import com.xworkz.shoppersstop.dto.ShopperstopDTO;

public class Shoppersstopprofile {
    public boolean registration(ShopperstopDTO shopperstopDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(shopperstopDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(ShopperstopDTO shopperstopDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(shopperstopDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(shopperstopDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(shopperstopDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(shopperstopDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(shopperstopDTO.getName()!=null)
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
