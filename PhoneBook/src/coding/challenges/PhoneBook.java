package coding.challenges;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	private Map<String, Person> phoneBook;

	public PhoneBook() {
		phoneBook = new HashMap<String, Person>();
	}

	public void addEntry(String phoneNumber, Person person) {
		
		phoneBook.put(phoneNumber, person);
	}
	
	public Person findPerson(String phoneNumber) {
		
		return phoneBook.get(phoneNumber);
	}
}
