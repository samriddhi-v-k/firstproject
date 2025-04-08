package com.xworkz.walmartapp.walmartprofile;


import com.xworkz.walmartapp.dto.WalmartDto;

public class WalmartProfile {
    public boolean registration(WalmartDto walmartDto)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(walmartDto);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(WalmartDto walmartDto)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(walmartDto.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(walmartDto.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(walmartDto.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(walmartDto.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(walmartDto.getName()!=null)
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
