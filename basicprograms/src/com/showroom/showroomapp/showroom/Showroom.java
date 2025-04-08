package com.showroom.showroomapp.showroom;
import com.showroom.showroomapp.staff.Staff;
import com.showroom.showroomapp.manager.Manager;

public class Showroom {
    public int showroomId;
    public String showroomLocation;
    public Manager manager;
    public Staff[] staff;

    public void display() {
        System.out.println("vv............vv");
        System.out.println("Showroom ID: " + showroomId);
        System.out.println("Showroom Location: " + showroomLocation);

        System.out.println("Manager Details:");
        manager.managerDisplay();

        System.out.println("Staff Details:");
        for (Staff s : staff) {
            s.staffDisplay();
        }
    }
}
