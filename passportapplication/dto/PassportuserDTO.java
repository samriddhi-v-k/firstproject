package com.xworkz.passportapplication.dto;

import com.xworkz.passportapplication.constants.HintAns;
import com.xworkz.passportapplication.constants.HintQuestion;

public class PassportuserDTO {

    private String dob;
    private String email;
    private String password;
    private String confirmPassword;
    private HintQuestion hintQuestion;
    private HintAns hintAns;

    public void setDob(String dob)
    {
        this.dob=dob;
    }
    public String getDob()
    {
        return dob;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {

        return email;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return password;
    }
    public void setConfirmPassword(String confirmPassword)
    {
        this.confirmPassword=confirmPassword;
    }
    public String getConfirmPassword()
    {
        return confirmPassword;
    }
    public void setHintQuestion(HintQuestion hintQuestion)
    {
        this.hintQuestion=hintQuestion;
    }
    public HintQuestion getHintQuestion()
    {
        return hintQuestion;
    }
    public void setHintAns(HintAns hintAns)
    {
        this.hintAns=hintAns;
    }
    public HintAns getHintAns()
    {
        return hintAns;
    }
}
