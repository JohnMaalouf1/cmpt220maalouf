package AddressBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.ArrayList;
public class contactBook extends Frame {

    public void createNewContact(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) {
        JFrame f2= new JFrame("Add Contact");
        Color backGround = new Color(236, 240, 255);

        f2.getContentPane().setBackground( backGround );
        JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12;
        JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;

        l1=new JLabel("First Name");
        l1.setBounds(50,50, 100,20);

        l2=new JLabel("Last Name");
        l2.setBounds(50,75, 100,20);

        l3=new JLabel("Phone Number");
        l3.setBounds(50,100, 100,20);

        l4=new JLabel("Country");
        l4.setBounds(50,125, 100,20);

        l5=new JLabel("State");
        l5.setBounds(50,150, 100,20);

        l6=new JLabel("City");
        l6.setBounds(50,175, 100,20);

        l7=new JLabel("Road");
        l7.setBounds(50,200, 100,20);

        l8=new JLabel("Zip Code");
        l8.setBounds(50,225, 100,20);

        l9=new JLabel("House Number");
        l9.setBounds(50,250, 100,20);

        l10=new JLabel("Job Name");
        l10.setBounds(50,275, 100,20);

        l11=new JLabel("Job Email");
        l11.setBounds(50,300, 100,20);

        l12=new JLabel("Job Location");
        l12.setBounds(50,325, 100,20);


        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf10 = new JTextField();
        tf11 = new JTextField();
        tf12 = new JTextField();


        tf1.setBounds(175, 50, 150, 20);
        tf2.setBounds(175, 75, 150, 20);
        tf3.setBounds(175, 100, 150, 20);
        tf4.setBounds(175, 125, 150, 20);
        tf5.setBounds(175, 150, 150, 20);
        tf6.setBounds(175, 175, 150, 20);
        tf7.setBounds(175, 200, 150, 20);
        tf8.setBounds(175, 225, 150, 20);
        tf9.setBounds(175, 250, 150, 20);
        tf10.setBounds(175, 275, 150, 20);
        tf11.setBounds(175, 300, 150, 20);
        tf12.setBounds(175, 325, 150, 20);


        JButton addButton = new JButton( new AbstractAction("Add Contact") {
            @Override
            public void actionPerformed( ActionEvent e ) {

                Number phoneListing = new Number(tf1.getText(), tf2.getText(), Long.parseLong(tf3.getText()));
                contactNumber.add(phoneListing);

                Address addressListing = new Address(tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), Integer.parseInt(tf8.getText()), Integer.parseInt(tf9.getText()));
                addresses.add(addressListing);

                Occupation occupation = new Occupation(tf10.getText(), (tf11.getText()), (tf12.getText()));
                occupations.add(occupation);

            }
        });


        JButton back = new JButton( new AbstractAction("Go Back") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //AddressBookGui.menu();
                f2.setVisible(false);
                //dispose();

            }
        });

        addButton.setBounds(100, 400, 195, 30);
        back.setBounds(100, 450, 195, 30);

        f2.add(tf1);
        f2.add(tf2);
        f2.add(tf3);
        f2.add(tf4);
        f2.add(tf5);
        f2.add(tf6);
        f2.add(tf7);
        f2.add(tf8);
        f2.add(tf9);
        f2.add(tf10);
        f2.add(tf11);
        f2.add(tf12);

        f2.add(l1);
        f2.add(l2);
        f2.add(l3);
        f2.add(l4);
        f2.add(l5);
        f2.add(l6);
        f2.add(l7);
        f2.add(l8);
        f2.add(l9);
        f2.add(l10);
        f2.add(l11);
        f2.add(l12);

        f2.add(addButton);
        f2.add(back);
        f2.setSize(400, 700);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(false);
    }



    public void removeContactMenu(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations){

        JFrame f2 = new JFrame("Remove Contact");
        String [] arrayString = new String[contactNumber.size()];
        for (int i = 0; i < contactNumber.size(); i++) {
            String itemName = contactNumber.get(i).getFirstName();
            arrayString[i] = itemName;
        }

        Color backGround = new Color(236, 240, 255);

        f2.getContentPane().setBackground( backGround );

        JComboBox cb=new JComboBox(arrayString);
        cb.setBounds(100, 50, 195, 20);
        f2.add(cb);
        f2.setLayout(null);
        f2.setSize(400,500);
        f2.setVisible(true);

        JButton button = new JButton( new AbstractAction("Remove Contact") {
            @Override
            public void actionPerformed( ActionEvent e ) {

                String contactName = (String) cb.getItemAt(cb.getSelectedIndex());
                removeContacts(contactName, contactNumber, addresses, occupations);
                f2.dispose();
            }
        });

        JButton back = new JButton( new AbstractAction("Go Back") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //AddressBookGui.menu();
                f2.setVisible(false);
                //dispose();

            }
        });

        f2.setSize(400, 700);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(false);
        f2.add(button);
        f2.add(back);
        button.setBounds(100,100,195,30);
        back.setBounds(100,150,195,30);
    }


    public static void printSpecificContactMenu(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) {

        JFrame f2 = new JFrame("Print Contact");
        JTextField tf1;
        JLabel l1, l2, l3;

        Color backGround = new Color(236, 240, 255);

        f2.getContentPane().setBackground( backGround );

        tf1 = new JTextField();
        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();

        l1.setBounds(110,50, 195,200);
        l2.setBounds(110,150, 195,200);
        l3.setBounds(110,250, 195,200);

        String [] arrayString = new String[contactNumber.size()];

        for (int i = 0; i < contactNumber.size(); i++) {
            String itemName = contactNumber.get(i).getFirstName();
            arrayString[i] = itemName;

        }

        JComboBox cb=new JComboBox(arrayString);
        cb.setBounds(100, 50, 195, 20);
        f2.add(cb);
        f2.setLayout(null);
        f2.setSize(400,500);
        f2.setVisible(true);


        JButton button = new JButton( new AbstractAction("Enter") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                String response = (String) cb.getItemAt(cb.getSelectedIndex());
                //printContacts(response, contactNumber, addresses, occupations);
                //contactBook.printSpecificContact(contactName, contactNumber, addresses, occupations);

                String itemName;
                for (int i = 0; i < contactNumber.size(); i++) {
                    itemName = contactNumber.get(i).getFirstName();
                    if (itemName.equals(response)) {

                        Number x = contactNumber.get(i);
                        Address f = addresses.get(i);
                        Occupation g = occupations.get(i);

                        System.out.println(x);
                        System.out.println(f);
                        System.out.println(g);

                        l1.setText(x.toString());
                        l2.setText(f.toString());
                        l3.setText(g.toString());


                    }

                }
            }

        });

        JButton back = new JButton( new AbstractAction("Go Back") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //AddressBookGui.menu();
                //f2.setVisible(false);
                f2.dispose();

            }
        });

        f2.setSize(400, 700);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(false);
        f2.add(button);
        f2.add(back);
        f2.add(tf1);
        f2.add(l1);
        f2.add(l2);
        f2.add(l3);
        button.setBounds(100,400,195,30);
        back.setBounds(100, 450, 195, 30);


    }

    public static void removeContacts(String contactName, ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) {

        for(Number e: contactNumber)
            System.out.print(e.getFirstName()+ '|');

            String itemName;
            for (int i = 0; i < contactNumber.size(); i++) {
                itemName = contactNumber.get(i).getFirstName();
                if (itemName.equals(contactName)) {
                    contactNumber.remove(i);
                    addresses.remove(i);
                    occupations.remove(i);

                    System.out.println("The Contact has been removed");
                }
            }
    }



    public static void removeAllContacts(ArrayList<Number> contactNumber){
        for(int i = contactNumber.size()-1; i>-1;i--){
                contactNumber.remove(i);
        }
    }


    public static void printSpecificNameMenu(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) {

        JFrame f2 = new JFrame("Print Contact");
        JTextField tf1;
        JLabel l1, l2, l3;

        tf1 = new JTextField();
        //tf1.setBounds(100, 50, 195, 20);

        Color backGround = new Color(236, 240, 255);

        f2.getContentPane().setBackground( backGround );

        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();

        l1.setBounds(110,50, 195,200);
        l2.setBounds(110,150, 195,200);
        l3.setBounds(110,250, 195,200);


        String [] arrayString = new String[contactNumber.size()];

        for (int i = 0; i < contactNumber.size(); i++) {
            String itemName = contactNumber.get(i).getFirstName();
            arrayString[i] = itemName;

        }

        JComboBox cb=new JComboBox(arrayString);
        cb.setBounds(100, 50, 195, 20);
        f2.add(cb);
        f2.setLayout(null);
        f2.setSize(400,500);
        f2.setVisible(true);


        JButton button = new JButton( new AbstractAction("Enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String response = (String) cb.getItemAt(cb.getSelectedIndex());

                String itemName;
                for (int i = 0; i < contactNumber.size(); i++) {
                    itemName = contactNumber.get(i).getFirstName();
                    if (itemName.equals(response)) {
                        Number g = contactNumber.get(i);
                        System.out.println("Name and Number:\n" + g + "\n");
                        l1.setText(g.toString());

                    }
                }
            }

        });


        JButton back = new JButton( new AbstractAction("Go Back") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //AddressBookGui.menu();
                f2.setVisible(false);
                //dispose();

            }
        });


        f2.setSize(400, 700);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(false);
        f2.add(button);
        f2.add(back);
        f2.add(tf1);
        f2.add(l1);
        f2.add(l2);
        f2.add(l3);
        button.setBounds(100,400,195,30);
        back.setBounds(100, 450, 195, 30);


    }



    public static void printSpecificAddressMenu(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) {

        JFrame f2 = new JFrame("Print Address");
        JTextField tf1;
        JLabel l1, l2, l3;
        Color backGround = new Color(236, 240, 255);

        f2.getContentPane().setBackground( backGround );
        tf1 = new JTextField();
        //tf1.setBounds(100, 50, 195, 20);

        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();

        l1.setBounds(110,50, 195,200);
        l2.setBounds(110,150, 195,200);
        l3.setBounds(110,250, 195,200);

        String [] arrayString = new String[contactNumber.size()];

        for (int i = 0; i < contactNumber.size(); i++) {
            String itemName = contactNumber.get(i).getFirstName();
            arrayString[i] = itemName;

        }

        JComboBox cb=new JComboBox(arrayString);
        cb.setBounds(100, 50, 195, 20);
        f2.add(cb);
        f2.setLayout(null);
        f2.setSize(400,500);
        f2.setVisible(true);


        JButton button = new JButton( new AbstractAction("Enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String response = (String) cb.getItemAt(cb.getSelectedIndex());

                String itemName;
                for (int i = 0; i < contactNumber.size(); i++) {
                    itemName = contactNumber.get(i).getFirstName();
                    if (itemName.equals(response)) {
                        Address g = addresses.get(i);
                        System.out.println("Name and Number:\n" + g + "\n");
                        l1.setText(g.toString());

                    }
                }
            }

        });


        JButton back = new JButton( new AbstractAction("Go Back") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //AddressBookGui.menu();
                f2.setVisible(false);
                //dispose();

            }
        });


        f2.setSize(400, 700);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(false);
        f2.add(button);
        f2.add(back);
        f2.add(tf1);
        f2.add(l1);
        f2.add(l2);
        f2.add(l3);
        button.setBounds(100,400,195,30);
        back.setBounds(100, 450, 195, 30);


    }

    public static void printSpecificOccupationMenu(ArrayList<Number> contactNumber, ArrayList<Address> addresses, ArrayList<Occupation> occupations) {

        JFrame f2 = new JFrame("Print Address");
        JTextField tf1;
        JLabel l1, l2, l3;
        Color backGround = new Color(236, 240, 255);

        f2.getContentPane().setBackground( backGround );

        tf1 = new JTextField();
        //tf1.setBounds(100, 50, 195, 20);

        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();

        l1.setBounds(110,50, 195,200);
        l2.setBounds(110,150, 195,200);
        l3.setBounds(110,250, 195,200);


        String [] arrayString = new String[contactNumber.size()];

        for (int i = 0; i < contactNumber.size(); i++) {
            String itemName = contactNumber.get(i).getFirstName();
            arrayString[i] = itemName;

        }

        JComboBox cb=new JComboBox(arrayString);
        cb.setBounds(100, 50, 195, 20);
        f2.add(cb);
        f2.setLayout(null);
        f2.setSize(400,500);
        f2.setVisible(true);


        JButton button = new JButton( new AbstractAction("Enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String response = (String) cb.getItemAt(cb.getSelectedIndex());

                String itemName;
                for (int i = 0; i < contactNumber.size(); i++) {
                    itemName = contactNumber.get(i).getFirstName();
                    if (itemName.equals(response)) {
                        Occupation g = occupations.get(i);
                        System.out.println("Name and Number:\n" + g + "\n");
                        l1.setText(g.toString());

                    }
                }
            }

        });


        JButton back = new JButton( new AbstractAction("Go Back") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //AddressBookGui.menu();
                f2.setVisible(false);
                //dispose();

            }
        });


        f2.setSize(400, 700);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(false);
        f2.add(button);
        f2.add(back);
        f2.add(tf1);
        f2.add(l1);
        f2.add(l2);
        f2.add(l3);
        button.setBounds(100,400,195,30);
        back.setBounds(100, 450, 195, 30);
    }
}
