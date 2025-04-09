package com.xworkz.walmartapp.walmartprofile;


import com.xworkz.walmartapp.dto.WalmartuserDto;

public class WalmartProfile {
    public boolean registration(WalmartuserDto walmartuserDto)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(walmartuserDto);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(WalmartuserDto walmartuserDto)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(walmartuserDto.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(walmartuserDto.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(walmartuserDto.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(walmartuserDto.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(walmartuserDto.getName()!=null)
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
