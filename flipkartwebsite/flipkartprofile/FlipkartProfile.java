package com.xworkz.flipkartwebsite.flipkartprofile;


import com.xworkz.flipkartwebsite.dto.FlipkartDTO;

public class FlipkartProfile {
    public boolean registration(FlipkartDTO flipkartDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(flipkartDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(FlipkartDTO flipkartDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(flipkartDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(flipkartDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(flipkartDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(flipkartDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(flipkartDTO.getName()!=null)
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
