package com.xworkz.passportapplication.passport;


import com.xworkz.passportapplication.constants.HintAns;
import com.xworkz.passportapplication.constants.HintQuestion;
import com.xworkz.passportapplication.dto.PassportuserDTO;

public class PassportSeva {
    public boolean registration(PassportuserDTO passportuserDTO)
    {
        boolean isUserRegistered=false;
        boolean isuserValidated = validation(passportuserDTO);
        if(isuserValidated==true)
        {
            isUserRegistered=true;
            System.out.println("registered");
        }
        else
            System.out.println("not registered");
        return isUserRegistered;
    }
    public boolean validation(PassportuserDTO passportuserDTO)
    {
        boolean isuserValidated = false;
        boolean isdobValid =false;

        if(passportuserDTO.getDob()!=null)
        {
           isdobValid=true;
        }
        boolean isemailValid= false;

        if(passportuserDTO.getEmail()!=null)
        {
            isemailValid= true;
        }
        boolean ispasswordValid = false;
        String password = passportuserDTO.getPassword();
        if(password!=null && !password.isEmpty())
        {
            ispasswordValid=true;
        }
        boolean isconfirmPasswordValid= false;
        if(passportuserDTO.getConfirmPassword()!=null)
        {
            isconfirmPasswordValid=true;
        }
        boolean ishintQuestion=false;
        HintQuestion hintQuestion = passportuserDTO.getHintQuestion();
        if(passportuserDTO.getHintQuestion()!=null )
        {
            ishintQuestion=true;
        }
        boolean ishintAns = false;
        HintAns hintAns = passportuserDTO.getHintAns();
        if(passportuserDTO.getHintAns()!=null)
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
