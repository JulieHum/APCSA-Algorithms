//8.2 Traversing 2D Arrays
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

    public static ArrayList<Integer> firstOccurrence(int[][] input, int i)
    {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1); result.add(-1);
        for (int r = 0; r < input.length; r++)
        {
            for (int c = 0; c < input[0].length; c++)
            {
                if (input[r][c] == i)
                {
                    result.set(0, r);
                    result.set(1, c);
                    return result;
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> diagonal (int[][] input)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int b = input.length;
        if (input.length > input[0].length)
        {
            b = input[0].length;
        }
        for (int i = 0; i < b; i ++)
        {
            result.add(input[i][i]);
        }
        return result;
    }

    public static String column (String[][] input, int c)
    {
        String result = "";
        for (int r = 0; r < input.length; r++)
        {
            result += input[r][c] + " ";
        }
        return result;
    }

    public static int maximum (int[][] input)
    {
        int max = input[0][0];
        for (int[] r : input)
        {
            for (int c = 0; c < r.length; c++)
            {
                if (r[c] > max)
                {
                    max = r[c];
                }
            }
        }
        return max;
    }

    public static int minimum (int[][] input)
    {
        int min = input[0][0];
        for (int[] r : input)
        {
            for (int c = 0; c < r.length; c++)
            {
                if (r[c] < min)
                {
                    min = r[c];
                }
            }
        }
        return min;
    }

    public static String shortest (String[][] input)
    {
        String min = input[0][0];
        for (String[] r : input)
        {
            for (int c = 0; c < r.length; c++)
            {
                if (r[c].length() < min.length())
                {
                    min = r[c];
                }
            }
        }
        return min;
    }

    public static String longest (String[][] input)
    {
        String max = input[0][0];
        for (String[] r : input)
        {
            for (int c = 0; c < r.length; c++)
            {
                if (r[c].length() > max.length())
                {
                    max = r[c];
                }
            }
        }
        return max;
    }

    public static int largestAbsDiff (int[][] input, int[][] input1)
    {
        int lAD = Math.abs(input[0][0] - input1[0][0]);
        for (int r = 0; r < input.length; r++)
        {
            for (int c = 0; c < input[0].length; c++)
            {
                if (Math.abs(input[r][c]-input1[r][c]) > lAD)
                {
                    lAD = Math.abs((input[r][c]-input1[r][c]));
                }
            }
        }
        return lAD;
    }

    public static double mean (double[][] input)
    {
        double sum = 0;
        for (double[] r : input)
        {
            for (int c = 0; c < input[0].length; c++)
            {
                sum += r[c];
            }
        }
        return sum/(input.length*input[0].length);
    }

    public static boolean twoEquivQ (int[][] input)
    {
        int i = 0;
        for (int r = 0; r < input.length; r++)
        {
            for (int c = 0; c < input[0].length; c++)
            {
                i = input[r][c];
                if (c != input[0].length-1)
                {
                    for (int c1 = c + 1; c < input[0].length; c++)
                    {
                        if (input[r][c1] == i)
                        {
                            return true;
                        }
                    }
                }
                if (r != input.length-1)
                {
                    for (int r1 = r + 1; r < input.length; r++)
                    {
                        for (int c2 = 0; c < input[r].length; c++)
                        {
                            if (input[r1][c2] == i)
                            {
                                return true;
                            }
                        }
                    }
                }
                else
                {
                    for (int c2 = 0; c < input[r].length; c++)
                    {
                        if (input[r][c2] == i)
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
//    public static int twoEquivQ1 (int[][] input)
//    {
//        int i = 0;
//        for (int r = 0; r < input.length; r++)
//        {
//            System.out.println("r" + r);
//            for (int c = 0; c < input[0].length; c++)
//            {
//                System.out.println("c" + c);
//                i = input[r][c];
//                System.out.println(i);
//                if (c != input[0].length-1)
//                {
//                    for (int c1 = c + 1; c < input[0].length; c++)
//                    {
//                        if (input[r][c1] == i)
//                        {
//                            return 1;
//                        }
//                    }
//                }
//                if (r != input.length-1)
//                {
//                    for (int r1 = r + 1; r < input.length; r++)
//                    {
//                        for (int c2 = 0; c < input[0].length; c++)
//                        {
//                            if (input[r1][c2] == i)
//                            {
//                                return 2;
//                            }
//                        }
//                    }
//                } else
//                {
//                    for (int c2 = 0; c < input[r].length; c++)
//                    {
//                        if (input[r][c2] == i)
//                        {
//                            return 3;
//                        }
//                    }
//                }
//            }
//        }
//        return 4;
//    }

    public static String lastAlpha (String[][] input)
    {
        String last = input[0][0];
        for (int r = 0; r < input.length; r++)
        {
            for (int c = 0; c < input[0].length; c++)
            {
                if (input[r][c].compareTo(last) > 0)
                {
                    last = input[r][c];
                }
            }
        }
        return last;
    }
}