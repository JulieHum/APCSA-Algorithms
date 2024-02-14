public class Algorithm {
    public static void print (int[] input)
    {
        for (int i : input) {
            System.out.print(i + " ");
        }

    }
    public static void swap (int[] input, int s1, int s2)
    {
        int copy = input[s1];
        input[s1] = input[s2];
        input[s2] = copy;
    }

    public static int max (int[] input)
    {
        int n = input[0];
        for (int i = 1; i < input.length; i++)
        {
            if (input[i] > n) {
                n = input[i];
            }
        }
        return n;
    }

    public static int min (int[] input)
    {
        int n = input[0];
        for (int i = 1; i < input.length; i++)
        {
            if (input[i] < n)
            {
                n = input[i];
            }
        }
        return n;
    }

    public static String shortestString (String[] input)
    {
        String str = input[0];
        for (String s : input)
        {
            if (s.length() < str.length())
            {
                str = s;
            }
        }
        return str;
    }

    public static String longestString (String[] input)
    {
        String str = input[0];
        for (String s : input)
        {
            if (s.length() > str.length())
            {
                str = s;
            }
        }
        return str;
    }

    public static int largestAbsoluteDifference(int[] input, int[] input1)
    {
        int n = Math.abs(input[0] - input1[0]);
        for (int i = 1; i < input.length; i++)
        {
            if (Math.abs(input[i] - input1[i]) > n)
            {
                n = Math.abs(input[i] - input1[i]);
                return n;
            }
        }
        return n;
    }

    public static double average (double[] input)
    {
        double sum = 0;
        for (double d : input)
        {
            sum += d;
        }
        return sum/input.length;
    }

    public static void reverse (int[] input)
    {
        int n = input[input.length-1];
        for (int i = 0; i < input.length/2; i++)
        {
            input[input.length-i-1] = input[i];
            input[i] = n;
            n = input[input.length-i-2];
        }
    }

    public static boolean consecutive (int[] input)
    {
        for (int i = 0; i < input.length-1; i++)
        {
            if (input[i] == input[i+1])
            {
                return true;
            }
        }
        return false;
    }

    public static int firstNegative (int[] input)
    {
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] < 0)
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean equivalentValue (int[] input)
    {
        for (int i = 0; i < input.length; i++)
        {
            for (int j = i + 1; j < input.length; j++)
            {
                if (input[i] == input[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int longestConsecutiveStreak (int[] input, int i)
    {
        int n = 1;
        int c = 0;
        for (int j = 0; j < input.length; j++)
        {
            if (input[j] == i)
            {
                for (int k = j + 1; k < input.length; k++)
                {
                    if (input[k] == input[k-1])
                    {
                        n++;
                    }
                    if (n > c)
                    {
                        c = n;
                    }
                }
                n = 1;
            }
        }
        return c;
    }

    public static String lastAlphabetically (String[] input)
    {
        String s = input[0];
        for (int i = 1; i < input.length; i++)
        {
            if (input[i].compareTo(s) > 0)
            {
                s = input[i];
            }
        }
        return s;
    }

    public static boolean identialValues (int[] input, int[] input1)
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
}


