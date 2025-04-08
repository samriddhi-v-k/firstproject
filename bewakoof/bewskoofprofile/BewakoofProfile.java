package com.xworkz.bewakoof.bewskoofprofile;


import com.xworkz.bewakoof.dto.BewakoofDTO;

public class BewakoofProfile {
    public boolean registration(BewakoofDTO bewakoofDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(bewakoofDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(BewakoofDTO bewakoofDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(bewakoofDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(bewakoofDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(bewakoofDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(bewakoofDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(bewakoofDTO.getName()!=null)
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
