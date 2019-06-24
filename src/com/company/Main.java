package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("your name");
        String name = a.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How old are you?");
        int age = a.nextInt();
        System.out.println("How many degrees outside, " + name + "?");
        int c = a.nextInt();
        if ((c > 30 || c < -20) && (age > 45 || age <20)) {
            System.out.println("You can't go outside, " + name);
        }else if ((age < 20) && (c > 0 || c < 28)) {
            System.out.println("You can't go outside, " + name);

        }else if ((age < 45) && (c > -10 || c > 25)) {
            System.out.println("You can't go outside, " + name);
        } else {
            System.out.println(name + " you can go");
        }
    }
}

















