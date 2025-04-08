package com.xworkz.nykaa.nykaaprofile;


import com.xworkz.nykaa.dto.NykaaDTO;

public class NykaaProfile {
    public boolean registration(NykaaDTO nykaaDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(nykaaDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(NykaaDTO nykaaDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(nykaaDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(nykaaDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(nykaaDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(nykaaDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(nykaaDTO.getName()!=null)
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
