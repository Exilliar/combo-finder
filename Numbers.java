public class Numbers
{
    String[] input;
    int[] index;
    int numCombos;

    public Numbers(String i)
    {
        input = i.split(",");

        index = fillIndexes(input.length);

        numCombos = findCombos(input.length);
    }

    public Numbers(String[] inp, int[] ind)
    {
        input = inp;
        index = ind;
        numCombos = findCombos(input.length);
    }

    private static int findCombos(int len) // factorial function to find total number of combinations
    {
        if (len > 0) return findCombos(len-1) * len;
        else return 1;
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
    public void switchNoBase(int a, int b)
    {
        String placeholder0 = input[a];
        input[a] = input[b];
        input[b] = placeholder0;

        int placeholder1 = index[a];
        index[a] = index[b];
        index[b] = placeholder1;
    }

    private int findRealIndex(int a)
    {
        for (int i = 0; i < index.length; i++)
        {
            if (index[i] == a) return i;
        }

        System.out.println("Error in findRealIndex " + a);

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

    public int getNumCombos()
    {
        return numCombos;
    }

    public int len()
    {
        return input.length;
    }
}