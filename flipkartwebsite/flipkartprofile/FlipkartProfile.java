package com.xworkz.flipkartwebsite.flipkartprofile;


import com.xworkz.flipkartwebsite.dto.FlipkartuserDTO;

public class FlipkartProfile {
    public boolean registration(FlipkartuserDTO flipkartuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(flipkartuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(FlipkartuserDTO flipkartuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(flipkartuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(flipkartuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(flipkartuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(flipkartuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(flipkartuserDTO.getName()!=null)
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
