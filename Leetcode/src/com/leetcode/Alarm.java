package com.leetcode;

public class Alarm {

	public static void main(String[] args) {
		System.out.println(interviewTime("1700",5,100));
	}
	public static String interviewTime(String timeSetAt,int secondsGainedEveryFiveMinutes,int MinutesEarly)
	{
		String res="";
		if(!(checkString(timeSetAt, secondsGainedEveryFiveMinutes, MinutesEarly))) return "Invalid input";
		else
		{
			int g = 12*secondsGainedEveryFiveMinutes;
			int t = (g*MinutesEarly)/60;
	        int hours = Integer.parseInt(timeSetAt.substring(0, 2));
	        int minutes = Integer.parseInt(timeSetAt.substring(2));
	        hours = (hours + t) % 24;
	       return String.format("%02d%02d", hours, minutes);
		}
	}
	public static boolean checkString(String timeSetAt,int secondsGainedEveryFiveMinutes,int MinutesEarly)
	{
		if(secondsGainedEveryFiveMinutes<0 || MinutesEarly<0) return false;
		if(timeSetAt.length()>4 || timeSetAt.length()<4) return false;
		for(int i=0;i<timeSetAt.length();i++)
		{
			if(!(timeSetAt.charAt(i)>=48 && timeSetAt.charAt(i)<=57)) return false;
		}
		return true;
	}

}
