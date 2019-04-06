package lab7;

public class MyLong {

    private long value;

    public MyLong(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
    public boolean isEven() {
        if ((value % 2) == 0) {
            return true;
        } else return false;
    }

    public boolean isOdd() {
        if ((value % 2) == 0) {
            return false;
        } else return true;
    }

    public boolean isPrime() {
        if (value == 1)
            return false;
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(long value) {
        if ((value % 2) == 0) {
            return true;
        } else return false;
    }

    public static boolean isOdd(long value) {
        if ((value % 2) == 0) {
            return false;
        } else return true;
    }

    public static boolean isPrime(long value) {
        if (value == 1)
            return false;
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyLong x) {
        if ((x.getValue() % 2) == 0) {
            return true;
        } else return false;
    }

    public static boolean isOdd(MyLong x) {
        if ((x.getValue() % 2) == 0) {
            return false;
        } else return true;
    }

    public static boolean isPrime(MyLong x) {
        if (x.getValue() == 1)
            return false;
        for (int i = 2; i * i <= (x.getValue()); i++) {
            if ((x.getValue() % i == 0))
                return false;
        }
        return true;
    }

    public boolean equals(long myValue)
    {
        return myValue == value;
    }

    public boolean equals(MyLong MyValue)
    {
        return MyValue.getValue() == value;
    }

    public static long parseLong(char ch[]) {

        String str = "";

        for (int i = 0; i < ch.length; i++) {

            str += ch[i];
        }
        return Long.parseLong(str);
    }

    public static long parseLong(String str) {

        return Long.parseLong(str);

    }
}




