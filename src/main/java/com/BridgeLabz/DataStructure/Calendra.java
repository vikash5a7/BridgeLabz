package com.BridgeLabz.DataStructure;

import java.util.*;

import com.bridgeLabz.util.Utility;

import java.text.*;

public class Calendra {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat month = new SimpleDateFormat("M");
		SimpleDateFormat currentYear = new SimpleDateFormat("yyyy");
		String week[] = new String[7];
		week[0] = "SUN";
		week[1] = "MON";
		week[2] = "TUE";
		week[3] = "WED";
		week[4] = "THU";
		week[5] = "FRI";
		week[6] = "SAT";
		int countYear, countDay = 0, mnth = 0;
		try {
			mnth = Integer.parseInt(args[0]);
		} catch (Exception e) {
			mnth = Integer.parseInt(month.format(date));
		}
		int year = 0000, startWeekDay;
		try {
			year = Integer.parseInt(args[1]);
		} catch (Exception e) {
			year = Integer.parseInt(currentYear.format(date));
		}

		System.out.println("\n\n\n\t\t..........calender of " + mnth + ", " + year + " ..........\n\n\n \t\t\t");
		for (int i = 0; i < week.length; i++) {
			System.out.println(week[i] + " \t");
		}
		System.out.println("\n\t");
		int weekNo = 1, monthDay[], countLeapYear = 0;
		monthDay = new int[12];
		monthDay[0] = 31;
		monthDay[1] = 28;
		monthDay[2] = 31;
		monthDay[3] = 30;
		monthDay[4] = 31;
		monthDay[5] = 30;
		monthDay[6] = 31;
		monthDay[7] = 31;
		monthDay[8] = 30;
		monthDay[9] = 31;
		monthDay[10] = 30;
		monthDay[11] = 31;
		if (Utility.leapOrNot(year))
			monthDay[1] = 29;
		else
			monthDay[1] = 28;
		if (year < 2011) {
			countYear = 2011 - year - 1;
			for (int j = 12; j > mnth; j--) {
				countDay = countDay + monthDay[j - 1];
			}
			for (int i = 2010; i > year; i--) {
				if (Utility.leapOrNot(i))
					countLeapYear++;
			}
			countDay += (countYear * 365) + countLeapYear;
			startWeekDay = 7 - (countDay % 7);

		}

	}
}