import exception.NameValidation;
import exception.SurnameException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        String name, surname, phoneNumber;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Name: ");
        name = sc.nextLine(); // ""
        if (name == "") {
            throw new NameValidation("Name cannot be null");
        }
        person.setName(name);

        System.out.println("Enter Surname: ");
        surname = sc.nextLine();
        if (surname.length() == 1) {
            throw new SurnameException("Surname cannot consist one character");
        }
        person.setSurname(surname);

        System.out.println("Enter Phone Number: ");
        phoneNumber = sc.nextLine();
        if (phoneNumber == "") {
            throw new NameValidation("Number cannot be null");
        }
        person.setPhoneNum(phoneNumber);

    }
}