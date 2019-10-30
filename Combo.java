import java.util.*;

class Combo
{
    public static void main(String[] args)
    {
        Numbers numbers;

        if (args.length > 0) numbers = new Numbers(args[0]);
        else numbers = new Numbers("1,2,3,4");

        System.out.println(Arrays.toString(numbers.getInput()));
    }
}