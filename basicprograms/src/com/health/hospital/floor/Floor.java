package com.health.hospital.floor;
import com.health.hospital.hospital.Hospital;

public class Floor {
    public int maxiumRooms;
    public int floorNumber;
    public Rooms room[];

    public void getFLoorDetails()
    {
        System.out.println("the maximum rooms present in the floor is "+maximumRooms);
        System.out.println("the number of floors present are "+floorNumber);
    }
    for(Rooms ref :room)
    {
        ref.getRoomDetails();

    }


}
