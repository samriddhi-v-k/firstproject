package com.xworkz.meeshowebsite.meeshoprofile;


import com.xworkz.meeshowebsite.dto.MeeshouserDto;

public class MeeshoProfile {

    public boolean registration(MeeshouserDto meeshouserDto)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(meeshouserDto);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(MeeshouserDto meeshouserDto)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(meeshouserDto.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(meeshouserDto.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(meeshouserDto.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(meeshouserDto.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(meeshouserDto.getName()!=null)
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


