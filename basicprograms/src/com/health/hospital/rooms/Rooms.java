package com.health.hospital.rooms;

import com.health.hospital.floor.Floor;

public class Rooms {
   public int roomNumber;
   public String roomType;
   public int noOfPatients;
   public Patient patient[];
   public void getRoomDetails();
    {
        System.out.println("the room number is "+roomNumber);
        System.out.println("the room type is "+roomType);
        System.out.println("the no of patients "+noOfPatients);

    }
    for(Patient ref :patient)
        ref.getPatientDetails();

}
