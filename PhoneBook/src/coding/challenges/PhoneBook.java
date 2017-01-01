package coding.challenges;

import java.util.HashMap;
import java.util.Map;

import com.sun.istack.internal.NotNull;

public class PhoneBook {

	private Map<String, Person> phoneBook;

	public PhoneBook() {
		phoneBook = new HashMap<String, Person>();
	}

	public void addEntry(@NotNull String phoneNumber, @NotNull Person person) {
		
		phoneBook.put(phoneNumber, person);
	}
	
	public Person findPerson(@NotNull String phoneNumber) {
		
		return phoneBook.get(phoneNumber);
	}
}
