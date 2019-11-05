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

        findCombos(0, combos, numbers,0);

        System.out.println("finish");
        print(combos);
    }

    private static void findCombos(int i, ArrayList<Numbers> combos, Numbers n, int numLoops)
    {
        if (numLoops == 30) return;

        Numbers numbers = makeNewNumbers(n);

        System.out.println(i + " : " + Arrays.toString(numbers.getInput()));
        print(combos);

        if (i+1 >= numbers.len())
        {
            // numbers.switchNo(numbers.len()-2, numbers.len()-1);
            numbers.switchNoBase(i, i-1);
            // combos.add(numbers);
            addCombo(numbers, combos);

            Numbers tempNumbers = makeNewNumbers(numbers);

            tempNumbers.switchNoBase(i, i-2);

            // numbers.switchNo(i-1, i-2);
            // combos.add(numbers);
            boolean check = addCombo(tempNumbers, combos);

            if (!check)
            {
                System.out.println("caught");
                Numbers newNumbers = makeNewNumbers(tempNumbers);
                newNumbers.switchNoBase(i-3, i);
                addCombo(newNumbers, combos);
                findCombos(i-3,combos,newNumbers,numLoops+1);
            }
            else findCombos(i-2, combos, tempNumbers, numLoops+1);

            return;
        }
        else
        {
            if (i >= 0)
            {
                findCombos(i+1,combos,numbers, numLoops+1);

                return;
            }
            else return;
        }
    }

    private static boolean addCombo(Numbers n, ArrayList<Numbers> combos)
    {
        for (Numbers num : combos)
        {
            if (Arrays.equals(num.getInput(), n.getInput()))
            {
                System.out.println("repeat " + Arrays.toString(num.getInput()));
                return false;
            }
        }

        combos.add(n);

        return true;
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