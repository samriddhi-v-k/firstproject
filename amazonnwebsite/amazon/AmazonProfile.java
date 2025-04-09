package com.xworkz.amazonnwebsite.amazon;

import com.xworkz.amazonnwebsite.dto.AmazonuserDTO;

public class AmazonProfile {
    public boolean registration(AmazonuserDTO amazonDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(amazonDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(AmazonuserDTO amazonDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(amazonDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(amazonDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(amazonDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(amazonDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(amazonDTO.getName()!=null)
        {
            isnameValid=true;
        }
            if(isdobValid==true&&isemailValid==true&&ispasswordValid==true&&isconfirmPasswordValid==true&&isnameValid)
            {
                System.out.println("user sign in successful");
                return isuserValidated;
            }
            else System.out.println("unser sign in unsucessful");
            return isuserValidated;
    }
}
