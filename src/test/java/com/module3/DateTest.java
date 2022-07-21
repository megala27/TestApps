package com.module3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		DateTest obj = new DateTest();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		// System.out.println(formatter);
		Date date = new Date();
		String currentdate = formatter.format(date);
		System.out.println(currentdate);
		Date currentdateGet = new SimpleDateFormat("dd/mm/yyyy").parse(currentdate);
		System.out.println(obj.getPreviousWorkingDay(currentdateGet));
		String currentdateprint = formatter.format(obj.getPreviousWorkingDay(currentdateGet));
		System.out.println(currentdateprint);

	}

	public Date getPreviousWorkingDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		int dayOfWeek;
		do {
			cal.add(Calendar.DAY_OF_MONTH, -1);
			dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		} while (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);

		return cal.getTime();
	}
}
