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

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.add(phoneNumber);
    }

    @Override
    public String toString() {
        return "Справочник - {" +
                "Фамилия: '" + lastName + '\'' +
                ", номер телефона: " + phoneNumber +
                '}';
    }
}
