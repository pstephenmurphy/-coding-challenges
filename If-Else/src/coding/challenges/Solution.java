package coding.challenges;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		DateFormat sdf = new SimpleDateFormat("MMddyyyy");
		try {
			String dateStr = month + day + year;
			System.out.println(dateStr);
			
			Date date = sdf.parse(dateStr);
			Calendar myCal = new GregorianCalendar();
			myCal.setTime(date);
			int dayOfWeek = myCal.get(Calendar.DAY_OF_WEEK);
			System.out.println(dayOfWeek);

			switch (dayOfWeek) {
			case Calendar.MONDAY:
				System.out.println("MONDAY");
				break;
			case Calendar.TUESDAY:
				System.out.println("TUESDAY");
				break;
			case Calendar.WEDNESDAY:
				System.out.println("WEDNESDAY");
				break;
			case Calendar.THURSDAY:
				System.out.println("THURSDAY");
				break;
			case Calendar.FRIDAY:
				System.out.println("FRIDAY");
				break;
			case Calendar.SATURDAY:
				System.out.println("SATURDAY");
				break;
			case Calendar.SUNDAY:
				System.out.println("SUNDAY");
				break;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

	}
}
