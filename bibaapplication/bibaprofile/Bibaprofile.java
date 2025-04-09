package com.xworkz.bibaapplication.bibaprofile;


import com.xworkz.bibaapplication.dto.BibauserDTO;

public class Bibaprofile {
    public boolean registration(BibauserDTO bibauserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(bibauserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(BibauserDTO bibauserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(bibauserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(bibauserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(bibauserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(bibauserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(bibauserDTO.getName()!=null)
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
