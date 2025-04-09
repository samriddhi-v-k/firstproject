package com.xworkz.paytm.paytmprofile;


import com.xworkz.paytm.dto.PaytmuserDto;

public class PaytmProfile {
    public boolean registration(PaytmuserDto paytmuserDto)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(paytmuserDto);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(PaytmuserDto paytmuserDto)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(paytmuserDto.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(paytmuserDto.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(paytmuserDto.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(paytmuserDto.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(paytmuserDto.getName()!=null)
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
