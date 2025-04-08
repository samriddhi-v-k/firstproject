package com.xworkz.lifestyle.lifestyleprofile;


import com.xworkz.lifestyle.dto.LifestyleDTO;

public class LifestyleProfile {
    public boolean registration(LifestyleDTO lifestyleDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(lifestyleDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(LifestyleDTO lifestyleDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(lifestyleDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(lifestyleDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(lifestyleDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(lifestyleDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(lifestyleDTO.getName()!=null)
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
