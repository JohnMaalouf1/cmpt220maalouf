package AdressBook;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.ArrayList;
public class contactBook {

    static Scanner input = new Scanner (System.in);

    public static void createNewContact(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) {
        String firstName;
        String lastName = "";
        long number;
        Number phoneListing;
        Address addressListing;
        Occupation occupationListing;
        String countryName;
        String stateName;
        String cityName;
        String streetName;
        int zipNumber;
        int houseNumber;
        String job;
        int salary;
        int hoursPerWeek;


        String catchLine = "";
        System.out.println("Enter First Name: ");
        firstName= input.next();
        for (int i = 0; i < contactNumber.size(); i++) {
            String itemName = contactNumber.get(i).getFirstName();
            if (itemName.equals(firstName)) {
                System.out.println("You cannot have two contacts with the same first name, terminating request");
                Interface.menu(contactNumber, addresses, occupations);
            }
        }

            catchLine = input.nextLine();

            System.out.println("Enter Last Name");
            lastName = input.nextLine();
            System.out.println("Enter a Phone Number");
            number = input.nextLong();
            catchLine = input.nextLine();

            phoneListing = new Number(firstName, lastName, number);
            contactNumber.add(phoneListing);

            System.out.println("You will now enter the Location Fields\n");
            System.out.println("Enter a Country");
            countryName = input.nextLine();
            System.out.println("Enter a State");
            stateName = input.nextLine();
            System.out.println("Enter a City");
            cityName = input.nextLine();
            System.out.println("Enter a Street");
            streetName = input.nextLine();
            System.out.println("Enter a Zip-Code");
            zipNumber = input.nextInt();
            System.out.println("Enter a House Number");
            houseNumber = input.nextInt();
            addressListing = new Address(countryName, stateName, cityName, streetName, zipNumber, houseNumber);
            addresses.add(addressListing);

            System.out.println("You will now enter the Occupation Fields\n");
            catchLine = input.nextLine();
            System.out.println("Enter their Job");
            job = input.nextLine();
            System.out.println("Enter a Yearly Salary (Thousands)");
            salary = input.nextInt();
            System.out.println("Enter Hours per Week");
            hoursPerWeek = input.nextInt();
            occupationListing = new Occupation(job,salary,hoursPerWeek);
            occupations.add(occupationListing);
            catchLine = input.nextLine();

    }

    public static void removeContacts(ArrayList<Number> contactNumber) {

        for(Number e: contactNumber)
            System.out.print(e.getFirstName()+ '|');
        System.out.println("\nEnter the contact of the person you would like to remove");
        System.out.println("Enter 0 to quit");

        String response = "";
        while (!response.equals("0")) {
            response = input.nextLine();
            String itemName;
            for (int i = 0; i < contactNumber.size(); i++) {
                itemName = contactNumber.get(i).getFirstName();
                if (itemName.equals(response)) {
                    contactNumber.remove(i);
                    System.out.println("The Contact has been removed");
                    response = "0";
                }
            }
        }
    }

    public static void printAllContacts(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations){
        if(contactNumber.size() == 0){
            System.out.println("THERE ARE NO CONTACTS");
        }
        else {
            for (int i = 0; i < contactNumber.size(); i++) {
                Number e = contactNumber.get(i);
                Address f = addresses.get(i);
                Occupation g = occupations.get(i);
                System.out.println("-----------------------------");
                System.out.println("Phone Listing:\n" + e + "\n\nAddress Listing:" + f + "\nOccupation Listing:\n" + g + "\n");
                System.out.println("-----------------------------");
            }
        }
    }

    public static void exportContacts(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations){
        if(contactNumber.size() == 0){
            System.out.println("THERE ARE NO CONTACTS");
        }
        else {
            //String catchLine = input.nextLine();
            int count = 0;
            System.out.println("What would you like to name the file: ");
            String fileName = input.nextLine();

            PrintWriter writer = null;

            try {
                writer = new PrintWriter(fileName, "UTF-8");
            } catch (FileNotFoundException | UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            for(Number e: contactNumber)
                count++;

            writer.println(count);
            for (int i = 0; i < contactNumber.size(); i++) {
                Number e = contactNumber.get(i);
                writer.println(e.export());
                Address f = addresses.get(i);
                writer.println(f.export());
                Occupation g = occupations.get(i);
                writer.println(g.export());

            }
            writer.close();
            System.out.println("Successfully Exported " + contactNumber.size() +" contacts to " + fileName);
        }
    }

    public static void removeAllContacts(ArrayList<Number> contactNumber){
        for(int i = contactNumber.size()-1; i>-1;i--){
                contactNumber.remove(i);
        }
    }

    public static void printNameAndNumber(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations){
        for(Number e: contactNumber)
            System.out.print(e.getFirstName()+ '|');
        System.out.println("\nEnter the contact of the person you would like to print the Name and Number of: ");
        System.out.println("Enter 0 to quit");

        String response = "";
        while (!response.equals("0")) {
            response = input.nextLine();
            String itemName;
            for (int i = 0; i < contactNumber.size(); i++) {
                itemName = contactNumber.get(i).getFirstName();
                if (itemName.equals(response)) {
                    Number g = contactNumber.get(i);
                    System.out.println("Name and Number:\n" + g +"\n");
                    response = "0";
                }
            }
        }
    }


    public static void printAddress(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations){
        for(Number e: contactNumber)
            System.out.print(e.getFirstName()+ '|');
        System.out.println("\nEnter the First name of the contact you would like to print the address of: ");
        System.out.println("Enter 0 to quit");

        String response = "";
        while (!response.equals("0")) {
            response = input.nextLine();
            String itemName;
            for (int i = 0; i < contactNumber.size(); i++) {
                itemName = contactNumber.get(i).getFirstName();
                if (itemName.equals(response)) {
                    Address g = addresses.get(i);
                    System.out.println("Address:\n" + g +"\n");
                    response = "0";
                }
            }
        }
    }


    public static void printOccupation(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations){
        for(Number e: contactNumber)
            System.out.print(e.getFirstName()+ '|');
        System.out.println("\nEnter the First name of the contact you would like to print the Job of");
        System.out.println("Enter 0 to quit");

        String response = "";
        while (!response.equals("0")) {
            response = input.nextLine();
            String itemName;
            for (int i = 0; i < contactNumber.size(); i++) {
                itemName = contactNumber.get(i).getFirstName();
                if (itemName.equals(response)) {
                    Occupation g = occupations.get(i);
                    System.out.println("Occupation:\n" + g +"\n");
                    response = "0";
                }
            }
        }
    }
}


