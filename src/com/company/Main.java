package com.company;

public class Main {

    public static void main(String[] args) {
        int hour = 17;
        int minute = 44;
        String day = ("Friday");
        int date = 3;
        String month = ("September");
        int year = 2021;

        System.out.println(" \"Hello\" again, motherducker! ");

        System.out.println("\n");

        System.out.print("The current time is ");

        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

        System.out.println("Today is");

        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(year);

        System.out.println("\n");

        System.out.println("You're welcome...");
    }
}
