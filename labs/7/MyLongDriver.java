package lab7;

public class MyLongDriver {

    public static void main(String[] args) {
        MyLong longItem1 = new MyLong(19);
        MyLong longItem2 = new MyLong(10);
        MyLong longItem3 = new MyLong(10);
        char[] srcArray = new char[]{'1', '2'};


        System.out.println("The value of Long Item 1 is: " + longItem1.getValue());
        System.out.println("Is Long Item 1 Even: " + longItem1.isEven());
        System.out.println("Is Long Item 1 False: " + longItem1.isOdd());
        System.out.println("Is Long Item 1 Prime: " + longItem1.isPrime());

        System.out.println();
        System.out.println("The value of Long Item 2 is: " + longItem2.getValue());
        System.out.println("Is Long Item 2 Even: " + longItem2.isEven(longItem2.getValue()));
        System.out.println("Is Long Item 2 False: " + longItem2.isOdd(longItem2.getValue()));
        System.out.println("Is Long Item 2 Prime: " + longItem2.isPrime(longItem2.getValue()));
        System.out.println();

        System.out.println("The value of Long Item 3 is: " + longItem3.getValue());
        System.out.println("Is Long Item 3 Even: " + longItem3.isEven(longItem3));
        System.out.println("Is Long Item 3 False: " + longItem3.isOdd(longItem3));
        System.out.println("Is Long Item 3 Prime: " + longItem3.isPrime(longItem3));

        System.out.println(longItem3.parseLong(srcArray));

    }
}
