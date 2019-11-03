import java.util.*;

class Combo
{
    public static void main(String[] args)
    {
        ArrayList<Numbers> combos = new ArrayList<Numbers>();

        Numbers numbers;

        if (args.length > 0) numbers = new Numbers(args[0]);
        else numbers = new Numbers("1,2,3,4");

        combos.add(numbers);

        findCombos(0, combos, numbers);

        print(combos);
    }

    private static void findCombos(int i, ArrayList<Numbers> combos, Numbers n)
    {
        Numbers numbers = makeNewNumbers(n);

        if (i+1 >= numbers.len())
        {
            numbers.switchNo(numbers.len()-2, numbers.len()-1);
            combos.add(numbers);

            return;
        }
        else
        {
            findCombos(i+1,combos,numbers);

            numbers.switchNo(i, i+1);
            combos.add(numbers);

            findCombos(i-1, combos, numbers);

            return;
        }
    }

    private static Numbers makeNewNumbers(Numbers n)
    {
        return new Numbers(breakString(n.getInput()), breakInt(n.getIndex()));
    }

    private static String[] breakString(String[] s)
    {
        String[] n = new String[s.length];

        for (int i = 0; i < s.length; i++)
        {
            n[i] = s[i];
        }

        return n;
    }
    private static int[] breakInt(int[] in)
    {
        int[] n = new int[in.length];

        for (int i = 0; i < in.length; i++)
        {
            n[i] = in[i];
        }

        return n;
    }

    private static void print(ArrayList<Numbers> c)
    {
        for (Numbers n : c)
        {
            System.out.println(Arrays.toString(n.getInput()));
        }
    }
}