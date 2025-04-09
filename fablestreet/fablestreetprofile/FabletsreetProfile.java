package com.xworkz.fablestreet.fablestreetprofile;


import com.xworkz.fablestreet.dto.FablestrettuserDTO;

public class FabletsreetProfile {
    public boolean registration(FablestrettuserDTO fablestrettuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(fablestrettuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(FablestrettuserDTO fablestrettuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(fablestrettuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(fablestrettuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(fablestrettuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(fablestrettuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(fablestrettuserDTO.getName()!=null)
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
