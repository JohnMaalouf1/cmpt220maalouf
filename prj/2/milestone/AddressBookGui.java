package AdressBook;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class AddressBookGui extends Frame{

    static ArrayList<Number> contactNumber = new ArrayList<>();
    static ArrayList<Address> addresses = new ArrayList<>();
    static ArrayList<Occupation> occupations = new ArrayList<>();

    static JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12;
    JLabel l;


    AddressBookGui() {


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


        l = new JLabel();

        tf1.setBounds(125, 50, 150, 20);
        tf2.setBounds(125, 75, 150, 20);
        tf3.setBounds(125, 100, 150, 20);
        tf4.setBounds(125, 125, 150, 20);
        tf5.setBounds(125, 150, 150, 20);
        tf6.setBounds(125, 175, 150, 20);
        tf7.setBounds(125, 200, 150, 20);
        tf8.setBounds(125, 225, 150, 20);
        tf9.setBounds(125, 250, 150, 20);
        tf10.setBounds(125, 275, 150, 20);
        tf11.setBounds(125, 300, 150, 20);
        tf12.setBounds(125, 325, 150, 20);


        l.setBounds(50, 100, 550, 20);

        addButton.setBounds(150, 450, 95, 30);
        substractButton.setBounds(150, 550, 95, 30);
        importContacts.setBounds(150, 650, 95, 30);



        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        add(tf7);
        add(tf8);
        add(tf9);
        add(tf10);
        add(tf11);
        add(tf12);

        add(l);
        add(addButton);
        add(substractButton);
        add(importContacts);

        setSize(400, 900);
        setLayout(null);
        setVisible(true);



    }





    JButton addButton = new JButton( new AbstractAction("Add Contact") {
        @Override
        public void actionPerformed( ActionEvent e ) {

            Number phoneListing = new Number(tf1.getText(), tf2.getText(), Long.parseLong(tf3.getText()));
            contactNumber.add(phoneListing);

            Address addressListing = new Address(tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), Integer.parseInt(tf8.getText()), Integer.parseInt(tf9.getText()));
            addresses.add(addressListing);

            Occupation occupation = new Occupation(tf10.getText(), Integer.parseInt(tf11.getText()), Integer.parseInt(tf12.getText()));
            occupations.add(occupation);

        }
    });



    JButton substractButton = new JButton( new AbstractAction("Print Contacts") {
        @Override
        public void actionPerformed( ActionEvent e ) {

            for (int i = 0; i < contactNumber.size(); i++) {
                Number x = contactNumber.get(i);
                Address f = addresses.get(i);
                Occupation g = occupations.get(i);
                System.out.println("-----------------------------");
                System.out.println("Phone Listing:\n" + x + "\n\nAddress Listing:" + f + "\nOccupation Listing:\n" + g + "\n");
                System.out.println("-----------------------------");
            }

            }
    });

    JButton importContacts = new JButton( new AbstractAction("Import Contacts") {
        @Override
        public void actionPerformed( ActionEvent e ) {

            importContacts();
        }
    });





    public void importContacts(){





        JFrame frame = new JFrame("Input");
        JPanel panel = new JPanel();

        JPanel inputpanel = new JPanel();

        JTextField input = new JTextField(20);

        JButton button = new JButton( new AbstractAction("Enter") {
            @Override
            public void actionPerformed( ActionEvent e ) {

                String fileName=input.getText();

                fileFill.fileFill(fileName,contactNumber, addresses, occupations);

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




    }



    public static void main(String[] args) {

        new AddressBookGui();

    }

}
