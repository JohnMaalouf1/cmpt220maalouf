package AdressBook;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class fileFill {
    static Scanner keyboard = new Scanner(System.in);

    public static void fileFill(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) { String firstName = "";
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
        System.out.print("Please enter the name of the file: ");

        File myFile = new File(keyboard.next());
        try {
            Scanner input = new Scanner(myFile);
            int fileSize = input.nextInt();
            String catchline = input.nextLine();
            int i = 0;
            while (i < fileSize) {

                firstName = input.nextLine();
                lastName = input.nextLine();
                number = input.nextLong();
                catchLine = input.nextLine();

                phoneListing = new Number(firstName, lastName, number);
                contactNumber.add(phoneListing);


                countryName = input.nextLine();
                stateName = input.nextLine();
                cityName = input.nextLine();
                streetName = input.nextLine();
                zipNumber = input.nextInt();
                houseNumber = input.nextInt();

                addressListing = new Address(countryName, stateName, cityName, streetName, zipNumber, houseNumber);
                addresses.add(addressListing);

                catchLine = input.nextLine();
                job = input.nextLine();
                salary = input.nextInt();
                hoursPerWeek = input.nextInt();
                catchLine = input.nextLine();


                occupationListing = new Occupation(job,salary,hoursPerWeek);
                occupations.add(occupationListing);

                i++;
            }
            System.out.println("Successfully Imported " + fileSize + " Contact[s] from " + myFile);
        }//try
        catch (Exception ex) {
            System.out.println("Failed to import contact");
            ex.printStackTrace();
        }//catch
    }

}
