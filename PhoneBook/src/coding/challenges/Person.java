package coding.challenges;

public class Person {
    private String firstName, lastName;
    public Person(String first, String last) {
        if (first == null || last == null) {
            throw new NullPointerException();
        }
        firstName = first;
        lastName = last;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String toString() {
    	return String.format("%s %s", firstName, lastName);
    }
}
