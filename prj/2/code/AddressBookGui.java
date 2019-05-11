package AddressBook;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
// Import Statements


public class AddressBookGui extends Frame{
    // AddressBookGui Class that inherits from the Frame class

    static ArrayList<Number> contactNumber = new ArrayList<>();
    static ArrayList<Address> addresses = new ArrayList<>();
    static ArrayList<Occupation> occupations = new ArrayList<>();
    // ArrayList of 3 obkects declard
    contactBook contact = new contactBook();
    // Instance of contacBook class
    JMenu menu;
    // Menusdeclared

    AddressBookGui() {
        // Constructor

        JFrame f= new JFrame("Contact Book");
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("Menu");
        // Assigning Titles

        Color backGround = new Color(236, 240, 255);
        // Background

        f.getContentPane().setBackground( backGround );
        // Sets background

        JMenuItem i1 = new JMenuItem(new AbstractAction("Remove All ") {
            @Override
            public void actionPerformed(ActionEvent e) {
                contactBook.removeAllContacts(contactNumber);
            }
            // Remove all button created and linked to the removeAllContacts method in contact book
        });

        JMenuItem i2 = new JMenuItem(new AbstractAction("Print All ") {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < contactNumber.size(); i++) {
                    Number x = contactNumber.get(i);
                    Address f = addresses.get(i);
                    Occupation g = occupations.get(i);
                    System.out.println("-----------------------------");
                    System.out.println("Phone Listing:\n" + x + "\n\nAddress Listing:" + f + "\nOccupation Listing:\n" + g + "\n");
                    System.out.println("-----------------------------");
                }
            }
            // Print all method MEANT FOR TROUBLESHOOTING only. Can only be accessed on top menue
        });

        JMenuItem i3 = new JMenuItem(new AbstractAction("Quit ") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            // Quit button to exit program
        });

        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        menu.addSeparator();
        menu.add(i3);
        mb.add(menu);
        // Adding menu items

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("./photo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        f.add(picLabel);

        // Photo being initialized and attached in Try Catch


        JButton addButton = new JButton( new AbstractAction("Add Contact") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                contact.createNewContact(contactNumber, addresses, occupations);
                // Add contact button that connectx to the createNewContact method in contactbook

            }
        });

        JButton removeContact = new JButton( new AbstractAction("Remove Contact") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                contact.removeContactMenu(contactNumber, addresses, occupations);
                // remove contact button that connectx to the createNewContact method in contactbook

            }
        });

        JButton printSpecificContact = new JButton( new AbstractAction("Print Specific Contact") {
            @Override

            public void actionPerformed( ActionEvent e ) {
                contact.printSpecificContactMenu(contactNumber, addresses, occupations);
                // print contact button that connects to the actionPerformed method in contactbook

            }
        });

        JButton printSpecificName = new JButton( new AbstractAction("Basic Information") {
            @Override

            public void actionPerformed( ActionEvent e ) {
                contact.printSpecificNameMenu(contactNumber, addresses, occupations);
                // print contact number button that connects to the printSpecificNameMenu method in contactbook

            }
        });

        JButton printSpecificAddress = new JButton( new AbstractAction("Address Information") {
            @Override

            public void actionPerformed( ActionEvent e ) {
                contact.printSpecificAddressMenu(contactNumber, addresses, occupations);
                // print contact number button that connects to the printSpecificAddressMenu method in contactbook

            }
        });

        JButton printSpecificOccupation = new JButton( new AbstractAction("Job Information") {
            @Override

            public void actionPerformed( ActionEvent e ) {
                contact.printSpecificOccupationMenu(contactNumber, addresses, occupations);
                // print contact number button that connects to the printSpecificOccupationMenu method in contactbook
            }
        });

        JButton importContacts = new JButton( new AbstractAction("Import Contacts") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                importContacts();
            }
            // Import contacts button calls import Contacts
        });

        JButton exportContacts = new JButton( new AbstractAction("Export Contacts") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                exportContacts();
            }
            // Export Contacts button calls export Contacts
        });


        // Setting bounds for all elements on the main menu

        picLabel.setBounds(100,60,195,130);
        addButton.setBounds(100, 225, 195, 30);
        removeContact.setBounds(100, 275, 195, 30);
        printSpecificContact.setBounds(100,325,195,30);
        printSpecificName.setBounds(100,375,195,30);
        printSpecificAddress.setBounds(100,425,195,30);
        printSpecificOccupation.setBounds(100,475,195,30);
        importContacts.setBounds(100, 525, 195, 30);
        exportContacts.setBounds(100, 575, 195, 30);


        // adding them to the main menu
        f.setJMenuBar(mb);
        f.add(addButton);
        f.add(removeContact);
        f.add(printSpecificAddress);
        f.add(printSpecificName);
        f.add(importContacts);
        f.add(exportContacts);
        f.add(printSpecificContact);
        f.add(printSpecificOccupation);

        // Basic window properties
        f.setSize(400, 700);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
    }


    public void importContacts(){
        // Import Contacts Method
        // Creates input box from the user and then calls fileFill from data provided

        JFrame frame = new JFrame("Import Contacts");
        frame.setBounds(8,150,195,30);

        Color backGround = new Color(230, 250, 255);

        frame.getContentPane().setBackground( backGround );

        JPanel panel = new JPanel();
        JPanel inputpanel = new JPanel();
        JTextField input = new JTextField(20);
        JButton button = new JButton( new AbstractAction("Enter") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                String fileName=input.getText();
                fileFill.fileFill(fileName,contactNumber, addresses, occupations);
                frame.setVisible(false);
            }
        });

        inputpanel.add(input);
        inputpanel.add(button);
        panel.add(inputpanel);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        frame.setResizable(false);

        // Adds elements to frame
    }


    public void exportContacts(){
        // Export Contacts Method
        // Creates input box from the user and then calls exportContacts from data provided

        JFrame frame = new JFrame("Input");
        JPanel panel = new JPanel();

        Color backGround = new Color(230, 250, 255);

        frame.getContentPane().setBackground( backGround );
        JPanel inputpanel = new JPanel();

        JTextField input = new JTextField(20);

        JButton button = new JButton( new AbstractAction("Enter") {
            @Override
            public void actionPerformed( ActionEvent e ) {

                String exportName=input.getText();
                fileFill.exportContacts(exportName,contactNumber, addresses, occupations);
                frame.setVisible(false);
            }
        });

        inputpanel.add(input);
        inputpanel.add(button);
        panel.add(inputpanel);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        frame.setResizable(false);

        // Adds element to frame

    }

    public static void main(String[] args) {
        // Main
        menu();
    }

    public static void menu() {
        // Menu
        // creates a new AddressBookGui
        new AddressBookGui();
    }
}
