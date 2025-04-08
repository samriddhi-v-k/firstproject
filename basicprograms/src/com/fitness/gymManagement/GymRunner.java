package com.fitness.gymManagement;
import com.fitness.gymManagement.gym.Gym;
import com.fitness.gymManagement.member.Member;

public class GymRunner
{
    public static void main(String[] args) {
        System.out.println("Main started");


        Member member1 = new Member();
        member1.memberId = 1;
        member1.name = "Ishan Kishan";
        member1.age = 25;
        member1.workoutType = "Weight Training";

        Member member2 = new Member();
        member2.memberId = 2;
        member2.name = "Shikar dhavan";
        member2.age = 27;
        member2.workoutType = "Dead Lifting";

        Member members[] = new Member[2];
        members[0] = member1;
        members[1] = member2;

        //  Member members[] = {member1,member1};


        Gym gym = new Gym();
        gym.gymId =101;
        gym.gymName = "Fitness Hub";
        gym.location = "Yelahanka";
        gym.members = members;


        gym.display();


        System.out.println("Main ended");
    }

}
