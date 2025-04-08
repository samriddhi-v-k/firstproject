package com.xworkz.tatacliq.tatacliqprofile;


import com.xworkz.tatacliq.dto.TatacliqDTO;

public class TatacliqProfile {
    public boolean registration(TatacliqDTO tatacliqDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(tatacliqDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(TatacliqDTO tatacliqDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(tatacliqDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(tatacliqDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(tatacliqDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(tatacliqDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(tatacliqDTO.getName()!=null)
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
