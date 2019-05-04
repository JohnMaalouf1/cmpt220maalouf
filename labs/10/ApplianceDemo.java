package Appliances;
// Package

public class ApplianceDemo {
    // Class
    public static void main(String[] args) {
        // Main Method
        Appliance []myAppliances = {
                        // Initialized list
                        // size is 40
                        new TV(432),
                        new TV(195),
                        new TV(65),
                        new TV(124),
                        new TV(654),
                        new TV(367),
                        new TV(500),
                        new TV(456),
                        new TV(420),
                        new TV(678),
                        new TV(7318),
                        new TV(3214),
                        new TV(12414),
                        new TV(121),

                        new Telephone(123),
                        new Telephone(11),
                        new Telephone(421),
                        new Telephone(534),
                        new Telephone(877),
                        new Telephone(234),
                        new Telephone(489),
                        new Telephone(953),
                        new Telephone(234),
                        new Telephone(321),
                        new Telephone(719),
                        new Telephone(311),
                        new Telephone(421),

                        new Toaster(42),
                        new Toaster(123),
                        new Toaster(65),
                        new Toaster(63),
                        new Toaster(87),
                        new Toaster(23),
                        new Toaster(678),
                        new Toaster(685),
                        new Toaster(829),
                        new Toaster(432),
                        new Toaster(789),
                        new Toaster(283),
                        new Toaster(142),
                };

        System.out.println("The Length of all the items is " + myAppliances.length);
        System.out.println("The list of Appliances sorted by their price is");

        for (int i = myAppliances.length - 1; i > 0; i--)
            for (int x = 0; x < i; x++) {
                if (myAppliances[x + 1].compareTo(myAppliances[x]) >= 0) {
                    continue;
                }
                Appliance holder = myAppliances[x + 1];
                myAppliances[x + 1] = myAppliances[x];
                myAppliances[x] = holder;
            }

        for (int i = 0; i < myAppliances.length; i++) {
            Appliance app = myAppliances[i];
            System.out.println(app);
        }
    }
}
