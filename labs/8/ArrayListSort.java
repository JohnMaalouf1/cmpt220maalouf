package lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSort
{
    public static void sort(ArrayList<Integer> a)
    {
        int i=0;
        while (i<a.size()) {
            for(int x=0; x<a.size()-1; x++) {
                if(a.get(x) > a.get(x+1))
                {
                    int temp = a.get(x);
                    a.set(x, a.get(x+1));
                    a.set(x+1, temp);
                }
            }
            i++;
        }
    }
}