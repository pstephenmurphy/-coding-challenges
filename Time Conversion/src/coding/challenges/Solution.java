package coding.challenges;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        DateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        DateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");

        Date date = parseFormat.parse(time);
        
        System.out.println(displayFormat.format(date));

        in.close();
	}

}
