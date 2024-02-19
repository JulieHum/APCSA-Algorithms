//7.3 Developing Algorithms Using ArrayLists
import java.util.ArrayList;
public class Algorithm
{
    public static void removeConsec (ArrayList<Integer> input)
    {
        for (int i = 1; i < input.size(); i++)
        {
            if (input.get(i).equals(input.get(i-1)))
            {
                input.remove(i);
                i--;
            }
        }
    }

    public static void remove (ArrayList<Integer> input, int i)
    {
        for (int j = 0; j < input.size(); j++)
        {
            if (input.get(j) == i)
            {
                input.remove(j);
                j--;
            }
        }
    }

    public static void addInt (ArrayList<Integer> input, int i)
    {
        int added = 0;
        if (input.size() == 0)
        {
            input.add(i);
        }
        for (int j = 0; j < input.size()-1; j++)
        {
            if (input.get(j) <= i && input.get(j+1) >= i && added == 0)
            {
                j++;
                input.add(j, i);
                added++;
            }
        }
        if (i > input.get(input.size()-1))
        {
            input.add(input.size(), i);
        }

    }

    public static boolean reverseQ (ArrayList<Integer> input, ArrayList<Integer> input1)
    {
        if (input.size() != input1.size())
        {
            return false;
        }
        for (int i = 0; i < input.size(); i++)
        {
            if (!(input.get(i)).equals(input1.get(input1.size()-1-i)))
            {
                return false;
            }
        }
        return true;
    }

    public static int maximum (ArrayList<Integer> input)
    {
        int i = input.get(0);
        for (int j : input)
        {
            if (j > i)
            {
                i = j;
            }
        }
        return i;
    }

    public static int minimum (ArrayList<Integer> input)
    {
        int i = input.get(0);
        for (int j : input)
        {
            if (j < i)
            {
                i = j;
            }
        }
        return i;
    }

    public static String shortest (ArrayList<String> input)
    {
        String str = input.get(0);
        for (String s : input)
        {
            if (s.length() < str.length())
            {
                str = s;
            }
        }
        return str;
    }

    public static String longest (ArrayList<String> input)
    {
        String str = input.get(0);
        for (String s : input)
        {
            if (s.length() > str.length())
            {
                str = s;
            }
        }
        return str;
    }

    public static int largestAbsDiff (ArrayList<Integer> input, ArrayList<Integer> input1)
    {
        int i = 0;
        if (input.size() != input1.size())
        {
            return -1;
        }
        for (int j = 0; j < input.size(); j++)
        {
            if (Math.abs(input.get(j) - input1.get(j)) > i)
            {
                i = Math.abs(input.get(j) - input1.get(j));
            }
        }
        return i;
    }

    public static double average (ArrayList<Double> input)
    {
        double sum = 0.0;
        for (double d : input)
        {
            sum += d;
        }
        return sum/input.size();
    }

    public static void reverse (ArrayList<Integer> input)
    {
        int n = 0;
        for (int i = 0; i < input.size()/2 ; i++)
        {
            n = input.get(i);
            input.set(i, input.get(input.size()-1-i));
            input.set(input.size()-1-i, n);
        }
    }

    public static boolean consecQ (ArrayList<Integer> input)
    {
        for (int i = 1; i < input.size(); i++)
        {
            if (input.get(i).equals(input.get(i-1)))
            {
                return true;
            }
        }
        return false;
    }

    public static int firstNegative (ArrayList<Integer> input)
    {
        for (int i = 0; i < input.size(); i++)
        {
            if (input.get(i) < 0)
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean twoEqualQ (ArrayList<Integer> input)
    {
        for (int i = 0; i < input.size(); i++)
        {
            for (int j = i + 1; j < input.size(); j++)
            {
                if (input.get(i).equals(input.get(j)))
                {
                   return true;
                }
            }
        }
        return false;
    }
}