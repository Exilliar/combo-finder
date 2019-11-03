import java.util.*;

public class Numbers
{
    String[] input;
    int[] index;

    public Numbers(String i)
    {
        input = i.split(",");

        index = fillIndexes(input.length);
    }

    public Numbers(String[] inp, int[] ind)
    {
        input = inp;
        index = ind;
    }

    private static int[] fillIndexes(int len)
    {
        int[] a = new int[len];

        for (int i = 0; i < len; i++)
        {
            a[i] = i;
        }

        return a;
    }

    public void switchNo(int a, int b)
    {
        int realIndexA = findRealIndex(a);
        int realIndexB = findRealIndex(b);

        String placeholder0 = input[realIndexA];
        input[realIndexA] = input[realIndexB];
        input[realIndexB] = placeholder0;

        int placeholder1 = index[realIndexA];
        index[realIndexA] = index[realIndexB];
        index[realIndexB] = placeholder1;
    }

    private int findRealIndex(int a)
    {
        for (int i = 0; i < index.length; i++)
        {
            if (index[i] == a) return i;
        }

        return -1;
    }

    public String[] getInput()
    {
        return input;
    }

    public int[] getIndex()
    {
        return index;
    }

    public int len()
    {
        return input.length;
    }
}