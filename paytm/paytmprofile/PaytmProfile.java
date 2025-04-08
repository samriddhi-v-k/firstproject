package com.xworkz.paytm.paytmprofile;


import com.xworkz.paytm.dto.PaytmDto;

public class PaytmProfile {
    public boolean registration(PaytmDto paytmDto)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(paytmDto);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(PaytmDto paytmDto)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(paytmDto.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(paytmDto.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(paytmDto.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(paytmDto.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(paytmDto.getName()!=null)
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
