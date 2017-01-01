package coding.challenges;

import java.io.IOException;
import java.util.Scanner;

import com.sun.istack.internal.NotNull;

public class Solution {

	public static void main(String[] args) throws IOException {

		PhoneBook phoneBook = new PhoneBook();

		Scanner in1 = new Scanner(System.in);

		while (in1.hasNext()) {
			int action = in1.nextInt();

			if (action == 1) {
				String phoneNumber = in1.next();
				String firstName = in1.next();
				String lastName = in1.next();

				@SuppressWarnings("null")
				Person person = new Person(firstName, lastName);

				try {
					phoneBook.addEntry(phoneNumber, person);
					
				} catch (Exception e) {
					System.out.println("unable to add Person matching " + phoneNumber);
				}

			} else if (action == 2) {
				String phoneNumber = in1.next();
						
				try {
					Person person = phoneBook.findPerson(phoneNumber);
					System.out.println("Found: " + (person != null ? true : false));
				} catch (Exception e) {
					System.out.println("unable to find Person matching " + phoneNumber);
				}
			}

		}

		in1.close();

	}

}
