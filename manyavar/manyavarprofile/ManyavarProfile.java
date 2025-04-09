package com.xworkz.manyavar.manyavarprofile;


import com.xworkz.manyavar.dto.ManyavaruserDTO;

public class ManyavarProfile {
    public boolean registration(ManyavaruserDTO manyavaruserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(manyavaruserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(ManyavaruserDTO manyavaruserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(manyavaruserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(manyavaruserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(manyavaruserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(manyavaruserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(manyavaruserDTO.getName()!=null)
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
