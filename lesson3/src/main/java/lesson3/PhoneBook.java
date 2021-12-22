package lesson3;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private String lastName;
    private Set<String> phoneNumber = new HashSet<>();

    public PhoneBook(String lastName, String phoneNumber) {
        this.lastName = lastName;
        new HashSet<>();
        this.phoneNumber.add(phoneNumber);
    }

    public void add(String lastName, String phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber.add(phoneNumber);
    }

    public String getLastName() {
        return lastName;
    }

    public Set<String> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
