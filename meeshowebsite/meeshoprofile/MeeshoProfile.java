package com.xworkz.meeshowebsite.meeshoprofile;


import com.xworkz.meeshowebsite.dto.MeeshoDto;

public class MeeshoProfile {

    public boolean registration(MeeshoDto meeshoDto)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(meeshoDto);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(MeeshoDto meeshoDto)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(meeshoDto.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(meeshoDto.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(meeshoDto.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(meeshoDto.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(meeshoDto.getName()!=null)
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


