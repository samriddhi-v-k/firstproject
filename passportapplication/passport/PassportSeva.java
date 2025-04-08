package com.xworkz.passportapplication.passport;


import com.xworkz.passportapplication.constants.HintAns;
import com.xworkz.passportapplication.constants.HintQuestion;
import com.xworkz.passportapplication.dto.PassportDTO;

public class PassportSeva {
    public boolean registration(PassportDTO passportDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(passportDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(PassportDTO passportDTO)
    {
        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(passportDTO.getDob()!=null)
        {
           isdobValid=true;
        }
        boolean isemailValid= false;

        if(passportDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;
        String password = passportDTO.getPassword();
        if(password!=null && !password.isEmpty())
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(passportDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean ishintQuestion=false;
        HintQuestion hintQuestion = passportDTO.getHintQuestion();
        if(passportDTO.getHintQuestion()!=null )
        {
            ishintQuestion=true;
        }
        boolean ishintAns = false;
        HintAns hintAns = passportDTO.getHintAns();
        if(passportDTO.getHintAns()!=null)
        {
            ishintAns= true; 
        }
            if(isdobValid==true&& isemailValid==true && ispasswordValid == true && isconfirmPasswordValid ==true && ishintQuestion ==true && ishintAns==true)
            {
                isuserValidated=true;
            }
            else System.out.println("please try again");
            return  isuserValidated;


    }
}
