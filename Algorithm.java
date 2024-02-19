//7.5 Searching
import java.util.ArrayList;

public class Algorithm
{
    public static int nLessThan0 (ArrayList<Integer> input)
    {
        int c = 0;
        for (int i : input)
        {
            if (i < 0)
            {
                c++;
            }
        }
        return c;
    }

    public static boolean inQ (ArrayList<String> input, String str)
    {
        for (String s : input)
        {
            if (s.equals(str))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean sameValueQ (ArrayList<Integer> input, ArrayList<Integer> input1)
    {
        for (int i : input)
        {
            for (int j : input1)
            {
                if (i == j)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int firstAppear (ArrayList<Integer> input, int i)
    {
        for (int j = 0; j < input.size(); j++)
        {
            if (input.get(j) == i)
            {
                return j;
            }
        }
        return -1;
    }

    public static int firstAppear (int[] input, int i)
    {
        for (int j = 0; j < input.length ; j++)
        {
            if (input[j] == i)
            {
                return j;
            }
        }
        return -1;
    }
}