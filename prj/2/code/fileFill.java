package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class fileFill {

    public static void fileFill(String fileName, ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) { String firstName = "";
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
        String email;
        String workAddress;

        String catchLine = "";

        File myFile = new File(fileName);

        try {
            Scanner input = new Scanner(myFile);
            int fileSize = input.nextInt();
            String catchline = input.nextLine();
            int i = 0;
            while (i < fileSize) {

                firstName = input.nextLine();
                System.out.println("FirstName " + firstName);
                lastName = input.nextLine();

                System.out.println("LastName " + lastName);

                number = input.nextLong();
                System.out.println("Number " + number);

                catchLine = input.nextLine();

                phoneListing = new Number(firstName, lastName, number);
                contactNumber.add(phoneListing);


                countryName = input.nextLine();
                System.out.println("Country " + countryName);

                stateName = input.nextLine();
                System.out.println("State " + stateName);

                cityName = input.nextLine();
                System.out.println("City " + cityName);

                streetName = input.nextLine();
                System.out.println("Street " + stateName);

                zipNumber = input.nextInt();
                System.out.println("Zip " + zipNumber);

                houseNumber = input.nextInt();
                System.out.println("House " + houseNumber);

                //catchLine = input.nextLine();


                addressListing = new Address(countryName, stateName, cityName, streetName, zipNumber, houseNumber);
                addresses.add(addressListing);

                catchLine = input.nextLine();
                job = input.nextLine();
                System.out.println("Job " + job);

                email = input.nextLine();
                System.out.println("email " + email);

                workAddress = input.nextLine();
                System.out.println("Work " + workAddress);

                occupationListing = new Occupation(job,email,workAddress);
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

    public static void exportContacts(String exportName, ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations){
        if(contactNumber.size() == 0){
            System.out.println("THERE ARE NO CONTACTS");
        }
        else {
            //String catchLine = input.nextLine();
            int count = 0;
            System.out.println("What would you like to name the file: ");

            PrintWriter writer = null;

            try {
                writer = new PrintWriter(exportName, "UTF-8");
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
            System.out.println("Successfully Exported " + contactNumber.size() +" contacts to " + exportName);
        }
    }
}
