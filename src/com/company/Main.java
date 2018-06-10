package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // write your code here

        Scanner sc = new Scanner(System.in);

        String firstName;
        int age;
        double height, gpa;


        System.out.print("What is your first name? ");
        firstName = sc.next();

        System.out.print("How old are you? ");
        age = sc.nextInt();

        System.out.print("How tall are you? ");
        height = sc.nextDouble();

        System.out.print("What is your GPA? ");
        gpa = sc.nextDouble();

        System.out.println("Name : " + firstName);
        System.out.println("Age : " + age);
        System.out.println("High : " + height);
        System.out.println("GPA : " + gpa);

    }
}


