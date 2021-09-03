package com.company;

public class Main {

    public static void main(String[] args) {
        int hour = 17;
        int minutes = 44;
        int seconds = 30;
        String day = ("Friday");
        String date = ("3'rd");
        String month = ("September");
        int year = 2021;

        int hour_since = 18;
        int minutes_since = 33;
        int seconds_since = 30;
        int seconds_in_a_day = 86400;

        double seconds_since_midnight = (hour*3600.0)+(minutes*60.0)+seconds;
        double percentage_of_the_day_passed = ((seconds_since_midnight/seconds_in_a_day));
        double seconds_since_exercise_start = ((hour_since*3600.0)+minutes_since*60.0)+seconds_since;
        double time_difference = (seconds_since_exercise_start-seconds_since_midnight);

        System.out.println("\"Hello\" again, motherduckers!");
        System.out.print("The time when starting the exercise was");
        System.out.print(":");
        System.out.print(" ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minutes);
        System.out.println(".");
        System.out.print("Number of minutes since midnight");
        System.out.print(":");
        System.out.print(" ");
        System.out.println(hour * 60 + minutes);
        System.out.println("Today it is:");
        System.out.print(day);
        System.out.print(" ");
        System.out.print("the");
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print("of");
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(year);
        System.out.println("\n");
        System.out.println("Seconds passed from midnight: "+seconds_since_midnight);
        System.out.println("Seconds left of my day: "+(seconds_in_a_day-seconds_since_midnight));
        System.out.println("Percentage of today that has passed: "+percentage_of_the_day_passed*100.0+"%");
        System.out.print("Time since starting the exercise: "+time_difference);
        System.out.print(" seconds");
        System.out.println("\n");
        System.out.println("You're welcome...");
    }
}
