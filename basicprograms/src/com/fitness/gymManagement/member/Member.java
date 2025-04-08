package com.fitness.gymManagement.member;


public class Member {
    public int memberId;
    public String name;
    public int age;
    public String workoutType;


    public void displayMember()
    {
        System.out.println("-----------------*----");
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Workout Type: " + workoutType);
        System.out.println("---------------------");
    }
}
