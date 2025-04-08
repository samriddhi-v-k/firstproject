package com.xworkz.ajio.ajioProfile;


import com.xworkz.ajio.dto.AjioDTO;

public class AjioProfile {
    public boolean registration(AjioDTO ajioDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(ajioDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(AjioDTO ajioDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(ajioDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(ajioDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(ajioDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(ajioDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(ajioDTO.getName()!=null)
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
