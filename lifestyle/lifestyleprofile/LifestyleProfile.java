package com.xworkz.lifestyle.lifestyleprofile;


import com.xworkz.lifestyle.dto.LifestyleuserDTO;

public class LifestyleProfile {
    public boolean registration(LifestyleuserDTO lifestyleuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(lifestyleuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(LifestyleuserDTO lifestyleuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(lifestyleuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(lifestyleuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(lifestyleuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(lifestyleuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(lifestyleuserDTO.getName()!=null)
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
