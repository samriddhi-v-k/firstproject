package com.xworkz.beyoung.beyoungprofle;


import com.xworkz.beyoung.dto.BeyoungDTO;

public class BeyoungProfile {
    public boolean registration(BeyoungDTO beyoungDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(beyoungDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(BeyoungDTO beyoungDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(beyoungDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(beyoungDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(beyoungDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(beyoungDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(beyoungDTO.getName()!=null)
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
