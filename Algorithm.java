import java.util.ArrayList;

public class Algorithm
{
    public static int numOf (String[][] input, String s)
    {
        int counter = 0;
        for (String[] r : input)
        {
            for (String c : r)
            {
                if (c.contains(s))
                {
                    counter ++;
                }
            }
        }
        return counter;
    }

    public static boolean isInQ (int[][] input, int i)
    {
        for (int[] r : input)
        {
            for (int c : r)
            {
                if (c == i)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] firstOccurrence(int[][] input, int i)
    {
        for (int i = 0; i < input.length-1;i++)
    }
}