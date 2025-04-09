package com.xworkz.tatacliq.tatacliqprofile;


import com.xworkz.tatacliq.dto.TatacliquserDTO;

public class TatacliqProfile {
    public boolean registration(TatacliquserDTO tatacliquserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(tatacliquserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(TatacliquserDTO tatacliquserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(tatacliquserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(tatacliquserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(tatacliquserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(tatacliquserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(tatacliquserDTO.getName()!=null)
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
