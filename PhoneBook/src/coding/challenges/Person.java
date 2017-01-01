package coding.challenges;

import com.sun.istack.internal.NotNull;

public class Person {
    private String firstName, lastName;
    public Person(@NotNull String first, @NotNull String last) {
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
