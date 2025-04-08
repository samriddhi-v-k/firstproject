package com.xworkz.bibaapplication.bibaprofile;


import com.xworkz.bibaapplication.dto.BibaDTO;

public class Bibaprofile {
    public boolean registration(BibaDTO bibaDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(bibaDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(BibaDTO bibaDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(bibaDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(bibaDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(bibaDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(bibaDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(bibaDTO.getName()!=null)
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
