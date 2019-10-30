public class Numbers
{
    String[] input;
    int[] index;

    public Numbers(String i)
    {
        input = i.split(",");

        index = fillIndexes(input.length);
    }

    public static int[] fillIndexes(int len)
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
        String placeholder0 = input[a];
        input[a] = input[b];
        input[b] = placeholder0;

        int placeholder1 = index[a];
        index[a] = index[b];
        index[b] = placeholder1;
    }

    public String[] getInput()
    {
        return input;
    }
}