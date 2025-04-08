package com.health.hospital;
import com.health.hospital.floor.FLoor;
import com.health.hospital.rooms.Rooms;
import com.health.hospital.patient.Patient;
import com.health.hospital.Hospital;

public class HospitalRunner {
    public static void main(String health[]){
        System.out.println("the hospital program started ");
        Hospital hospital = new Hospital();
        hospital.hospitalName ="sanjeevini ";
        hospital.location="bengaluru";

        Floor floors[] = new Floor[2];
        Floor floors1 = new Floor();
        floors1.maxiumRooms=7;
        floors1.floorNumber=2;

        Floor floors2 = new Floor();
        floors2.maximumRooms=4;
        floors
        System.out.println("the hopital program ended ");
    }

}
