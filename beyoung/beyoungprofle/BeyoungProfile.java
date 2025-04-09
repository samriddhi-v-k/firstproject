package com.xworkz.beyoung.beyoungprofle;


import com.xworkz.beyoung.dto.BeyounguserDTO;

public class BeyoungProfile {
    public boolean registration(BeyounguserDTO beyounguserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(beyounguserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(BeyounguserDTO beyounguserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(beyounguserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(beyounguserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(beyounguserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(beyounguserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(beyounguserDTO.getName()!=null)
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
