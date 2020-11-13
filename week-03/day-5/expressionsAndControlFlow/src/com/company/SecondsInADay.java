package com.company;


public class SecondsInADay {

        public static void main(String[] args) {
            int currentHours = 14;
            int currentMinutes = 34;
            int currentSeconds = 42;
            int seconds = 60;
            int onedDayPerSecond = (int) Math.pow(seconds,2) * 24;
            int elapsedTime = currentHours * (int) Math.pow(seconds, 2) + currentMinutes * seconds + currentSeconds;
            int theRestOfTheDay  = onedDayPerSecond - elapsedTime;
            System.out.println(theRestOfTheDay);




        }
}
