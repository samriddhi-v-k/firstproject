package com.xworkz.snapdeal.snapdealProfile;


import com.xworkz.snapdeal.dto.SnapdealuserDTO;

public class SnapdealProfile {
    public boolean registration(SnapdealuserDTO snapdealuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(snapdealuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(SnapdealuserDTO snapdealuserDTO)
    {

        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(snapdealuserDTO.getDob()!=null)
        {
            isdobValid=true;
        }
        boolean isemailValid= false;

        if(snapdealuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;

        if(snapdealuserDTO.getPassword()!=null)
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(snapdealuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean isnameValid=false;
        if(snapdealuserDTO.getName()!=null)
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
