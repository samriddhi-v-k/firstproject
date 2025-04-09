package com.xworkz.etsyapp.etsyprofile;


import com.xworkz.etsyapp.dto.EtsyuserDTO;

public class EtsyProfile {
    public boolean registration(EtsyuserDTO etsyuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(etsyuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(EtsyuserDTO etsyuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(etsyuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(etsyuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(etsyuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(etsyuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(etsyuserDTO.getName()!=null)
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
