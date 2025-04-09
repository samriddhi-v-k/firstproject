package com.xworkz.myntra.myntraprofile;


import com.xworkz.myntra.dto.MyntrauserDTO;

public class MyntraProfile {
    public boolean registration(MyntrauserDTO myntrauserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(myntrauserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(MyntrauserDTO myntrauserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(myntrauserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(myntrauserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(myntrauserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(myntrauserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(myntrauserDTO.getName()!=null)
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
