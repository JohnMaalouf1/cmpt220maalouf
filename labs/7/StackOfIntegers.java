package lab7;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        elements = new int[10];
    }

    public StackOfIntegers(int size) {
        elements = new int[size];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        if (!empty())
            return elements[size - 1];
        return -1;
    }

    public void push(int value) {
        if (size != elements.length) {
            elements[size] = value;
            size++;
        }
    }

    public int pop() {
        if (!empty()) {
            size--;
            return elements[size];
        }
        return -1;
    }

    public int getSize() {
        return size;
    }


    public static int[] findFactors(int num) {

        int[] factorCheckArray = {-1, num};
        int fact = 2;
        while (num > fact) {
            if (num % fact != 0) {
                fact++;
            } else {
                factorCheckArray[0] = (num / fact);
                factorCheckArray[1] = fact;
                return factorCheckArray;
            }
        }
        return factorCheckArray;
    }
}
