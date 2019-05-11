/*package AdressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Hello User, Welcome to your Contact Book! " +
                "To begin, Select an option!");
        ArrayList<Number> contactNumber = new ArrayList<>();
        ArrayList<Address> addresses = new ArrayList<>();
        ArrayList<Occupation> occupations = new ArrayList<>();

        menu(contactNumber, addresses, occupations);
    }

    public static void menu(ArrayList<Number> contactNumber,
                            ArrayList<Address> addresses,
                            ArrayList<Occupation> occupations){

        String choice;
        int userSelect = 1;
        do {
            System.out.println("\n" +
                    "[1] Create a new contact\n" +
                    "[2] Remove Contact\n" +
                    "[3] Print Contacts\n" +
                    "[4] Remove all\n" +
                    "[5] Print Specific Name/Number \n" +
                    "[6] Print Specific Address\n" +
                    "[7] Print Specific Occupation\n" +
                    "[8] Import Contact\n" +
                    "[9] Export Contact");

            choice = input.nextLine();
            if (!(isInteger(choice))){
                System.out.println("Please Enter a Valid Menu Option");
                menu(contactNumber, addresses, occupations);
            } else {
                userSelect = Integer.parseInt(choice);
            }
            switch (userSelect) {
                case 1:
                    //contactBook.createNewContact(contactNumber, addresses, occupations);
                    break;
                case 2:
                    //contactBook.removeContacts(contactNumber);
                    break;
                case 3:
                    contactBook.printAllContacts(contactNumber, addresses, occupations);
                    break;
                case 4:
                    contactBook.removeAllContacts(contactNumber);
                    break;
                case 5:
                    contactBook.printNameAndNumber(contactNumber, addresses, occupations);
                    break;
                case 6:
                    contactBook.printAddress(contactNumber, addresses, occupations);
                    break;
                case 7:
                    contactBook.printOccupation(contactNumber, addresses, occupations);
                    break;
                case 8:
                    //fileFill.fileFill(contactNumber, addresses, occupations);
                    break;
                case 9:
                    //contactBook.exportContacts(contactNumber, addresses, occupations);
                    break;
                default:
                    System.out.println("Please Enter a Valid Menu Option");
                    break;
            }
        } while (userSelect != 0);
        System.out.println("Thank you for using our Software!");
        System.exit(0);
    }

    public static boolean isInteger( String input ) { //Pass in string

        try { //Try to make the input into an integer
            Integer.parseInt( input );
            return true; //Return true if it works
        }
        catch( Exception e ) {
            return false; //If it doesn't work return false
        }
    }
}
*/