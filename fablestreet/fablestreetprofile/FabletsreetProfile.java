package com.xworkz.fablestreet.fablestreetprofile;


import com.xworkz.fablestreet.dto.FablestrettDTO;

public class FabletsreetProfile {
    public boolean registration(FablestrettDTO fablestrettDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation( fablestrettDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(FablestrettDTO fablestrettDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(fablestrettDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(fablestrettDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(fablestrettDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(fablestrettDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(fablestrettDTO.getName()!=null)
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
