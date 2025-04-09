package com.xworkz.nykaa.nykaaprofile;


import com.xworkz.nykaa.dto.NykaauserDTO;

public class NykaaProfile {
    public boolean registration(NykaauserDTO nykaauserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(nykaauserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(NykaauserDTO nykaauserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(nykaauserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(nykaauserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(nykaauserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(nykaauserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(nykaauserDTO.getName()!=null)
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
