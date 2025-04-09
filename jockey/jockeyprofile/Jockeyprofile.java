package com.xworkz.jockey.jockeyprofile;


import com.xworkz.jockey.dto.JockeyuserDTO;

public class Jockeyprofile {
    public boolean registration(JockeyuserDTO jockeyuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(jockeyuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(JockeyuserDTO jockeyuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(jockeyuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(jockeyuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(jockeyuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(jockeyuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(jockeyuserDTO.getName()!=null)
        {
            isnameValid=true;
        }
        if(isdobValid==true&&isemailValid==true&&ispasswordValid==true&&isconfirmPasswordValid==true&&isnameValid)
        {
            System.out.println("user sign in successful");
            return isuserValidated;
        }
        else System.out.println("unser sign in unsucessful");
        return isuserValidated;
    }
}
