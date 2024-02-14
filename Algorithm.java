import java.util.ArrayList;
public class Algorithm
{
    public static void addInt (ArrayList<Integer> input, int i)
    {
        for (int j = 0; j < input.size(); j++)
        {
            if (i < input.get(j))
            {
                input.add(j, i);
            }
        }
   }

   public static boolean reverse (ArrayList<Integer> input, ArrayList<Integer> input1)
   {
       if (input.size() != input1.size())
       {
           return false;
       }
       for (int i = 0; i < input.size(); i++)
       {
           if (input.get(i) == input.get(input1.size()-1-i))
           {}
           else
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
            if (input.get(j) - input1.get(j))
        }
    }
}