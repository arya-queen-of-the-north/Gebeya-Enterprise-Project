package com.gebeya.Excercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ExcerciseMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String secretPassword = "alcoholic_rabbit";




        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your age:");
        age = sc.nextInt();

        System.out.println(name);
        System.out.println(age);

        System.out.println("Enter Password:");
        String userInput = sc.nextLine();
        if(userInput.contains(secretPassword)){
            System.out.println("Password accepted.Welcome!");


        }else{
            System.out.println("Who are you intruder!");
        }


        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Goat");
        animals.add("Pigeon");
        animals.add("Mouse");
        animals.remove(1);

        for (String animal:animals){
            System.out.println(animals.get(2));
        }

    }
}
