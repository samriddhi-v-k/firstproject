package com.xworkz.zara.zaraprofile;


import com.xworkz.zara.dto.ZaraDTO;

public class ZaraProfile {
    public boolean registration(ZaraDTO zaraDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(zaraDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(ZaraDTO zaraDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(zaraDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(zaraDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(zaraDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(zaraDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(zaraDTO.getName()!=null)
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
