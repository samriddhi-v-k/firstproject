package com.xworkz.shoppersstop.dto;


import com.xworkz.shoppersstop.comstants.Password;

public class ShopperstopDTO {
    private String dob;
    private String email;
    private Password password;
    private String confirmPassword;
    private String name;
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
    public void setPassword(Password password)
    {
        this.password=password;
    }
    public Password getPassword()
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
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
