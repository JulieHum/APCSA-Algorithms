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

    public static String firstOccurrence(int[][] input, int i)
    {
        for (int r = 0; r < input.length; r++)
        {
            for (int c = 0; c < input[0].length; c++)
            {
                if (input[r][c] == i)
                {
                   return "[" + r + ", " + c + "]";
                }
            }
        }
        return "[-1, -1]";
    }

    public static
}