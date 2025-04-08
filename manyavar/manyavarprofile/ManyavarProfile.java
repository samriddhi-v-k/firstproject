package com.xworkz.manyavar.manyavarprofile;


import com.xworkz.manyavar.dto.ManyavarDTO;

public class ManyavarProfile {
    public boolean registration(ManyavarDTO manyavarDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(manyavarDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(ManyavarDTO manyavarDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(manyavarDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(manyavarDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(manyavarDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(.getName()!=null)
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
