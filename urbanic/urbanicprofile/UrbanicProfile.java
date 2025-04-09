package com.xworkz.urbanic.urbanicprofile;


import com.xworkz.urbanic.dto.UrbanicuserDTO;

public class UrbanicProfile {
    public boolean registration(UrbanicuserDTO urbanicuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(urbanicuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(UrbanicuserDTO urbanicuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(urbanicuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(urbanicuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(urbanicuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(urbanicuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(urbanicuserDTO.getName()!=null)
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
