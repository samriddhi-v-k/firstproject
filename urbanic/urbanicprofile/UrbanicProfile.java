package com.xworkz.urbanic.urbanicprofile;


import com.xworkz.urbanic.dto.UrbanicDTO;

public class UrbanicProfile {
    public boolean registration(UrbanicDTO urbanicDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(urbanicDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(UrbanicDTO urbanicDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(urbanicDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(urbanicDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(urbanicDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(urbanicDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(urbanicDTO.getName()!=null)
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
