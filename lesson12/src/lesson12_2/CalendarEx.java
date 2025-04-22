package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.*; // .*

import java.text.SimpleDateFormat;

import static java.lang.System.in;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal1 = getInstance();
		Calendar cal2 = new GregorianCalendar();
//		System.out.println(cal1);
		Scanner scanner = new Scanner(in);

		cal1.set(YEAR, 0);
		cal1.set(ERA, 0);
		
		
		System.out.println(cal1.get(ERA));
		System.out.println(cal1.get(YEAR));
		System.out.println(cal1.get(MONTH));
		System.out.println(cal1.get(DATE));
		System.out.println(cal1.get(HOUR));
		System.out.println(cal1.get(MINUTE));
		System.out.println(cal1.get(SECOND));
		System.out.println(cal1.get(DAY_OF_WEEK));
		System.out.println(cal1.getActualMaximum(DATE));
//		cal.set(0,0);
		
		cal1.roll(MONTH, -10); // add > roll 변경 시 월만 돌아감
		printCal(cal1);
	
	}
	
	static void printCal(Calendar cal) {
		System.out.println(new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(cal.getTime()));
		
	}
}








