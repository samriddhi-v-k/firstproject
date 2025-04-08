package com.xworkz.passportapplication;

import com.xworkz.passportapplication.constants.HintAns;
import com.xworkz.passportapplication.constants.HintQuestion;
import com.xworkz.passportapplication.dto.PassportDTO;
import com.xworkz.passportapplication.passport.PassportSeva;

public class PassportRunner {

   public static void main(String[] args) {
      PassportDTO passportDTO = new PassportDTO();
      passportDTO.setConfirmPassword("sam@123");
      passportDTO.setDob("17-07-2003");
      passportDTO.setEmail("samriddhi@1234.com");
      passportDTO.setPassword("sam@123");
      passportDTO.setHintQuestion(HintQuestion.houseName);
      passportDTO.setHintQuestion(HintQuestion.hostelName);
      passportDTO.setHintAns(HintAns.boarding);
      passportDTO.setHintAns(HintAns.laksmi);
      PassportSeva validate= new PassportSeva();
      if(validate.validation(passportDTO))
      {
         System.out.println("successful");
      }
      else System.out.println("unsuccessful");


   }




}
