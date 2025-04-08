package com.xworkz.etsyapp.etsyprofile;


import com.xworkz.etsyapp.dto.EtsyDTO;

public class EtsyProfile {
    public boolean registration(EtsyDTO etsyDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(etsyDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(EtsyDTO etsyDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(etsyDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(etsyDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(etsyDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(etsyDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(etsyDTO.getName()!=null)
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
