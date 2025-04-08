package com.xworkz.firstcry.firstcryprofile;


import com.xworkz.firstcry.dto.FirstcryDTO;

public class FirstcryProfile {
    public boolean registration(FirstcryDTO firstcryDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(firstcryDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(FirstcryDTO firstcryDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(firstcryDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(firstcryDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(firstcryDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(firstcryDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(firstcryDTO.getName()!=null)
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
