package com.xworkz.passportapplication;

import com.xworkz.passportapplication.constants.HintAns;
import com.xworkz.passportapplication.constants.HintQuestion;
import com.xworkz.passportapplication.dto.PassportuserDTO;
import com.xworkz.passportapplication.passport.PassportSeva;

public class PassportRunner {

   public static void main(String[] args) {
      PassportuserDTO passportuserDTO = new PassportuserDTO();
      passportuserDTO.setConfirmPassword("sam@123");
      passportuserDTO.setDob("17-07-2003");
      passportuserDTO.setEmail("samriddhi@1234.com");
      passportuserDTO.setPassword("sam@123");
      passportuserDTO.setHintQuestion(HintQuestion.houseName);
      passportuserDTO.setHintQuestion(HintQuestion.hostelName);
      passportuserDTO.setHintAns(HintAns.boarding);
      passportuserDTO.setHintAns(HintAns.laksmi);
      PassportSeva validate= new PassportSeva();
      if(validate.validation(passportuserDTO))
      {
         System.out.println("successful");
      }
      else System.out.println("unsuccessful");


   }




}
