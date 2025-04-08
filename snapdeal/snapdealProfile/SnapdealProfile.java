package com.xworkz.snapdeal.snapdealProfile;


import com.xworkz.snapdeal.dto.SnapdealDTO;

public class SnapdealProfile {
    public boolean registration(SnapdealDTO snapdealDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(snapdealDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(SnapdealDTO snapdealDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(snapdealDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(snapdealDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(snapdealDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(snapdealDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(snapdealDTO.getName()!=null)
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
