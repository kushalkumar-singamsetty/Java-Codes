package com.leetcode;

import java.util.Scanner;

public class ChatgptAlaram {

    public static void main(String[] args) {
    	System.out.println(interviewTime("1700",5,100));
    }

    private static String interviewTime(String timeSetAt, int secondsGainedEveryFiveMinutes, int minutesEarly) {
        try {
            int hoursSetAt = Integer.parseInt(timeSetAt.substring(0, 2));
            int minutesSetAt = Integer.parseInt(timeSetAt.substring(2));

            int totalMinutesGained = (minutesEarly * 60) / (secondsGainedEveryFiveMinutes / 5);
            int totalMinutes = (hoursSetAt * 60) + minutesSetAt + totalMinutesGained;

            int hoursInterviewTime = totalMinutes / 60;
            int minutesInterviewTime = totalMinutes % 60;

            return String.format("%02d%02d", hoursInterviewTime, minutesInterviewTime);
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return "Invalid input";
        }
    }
}