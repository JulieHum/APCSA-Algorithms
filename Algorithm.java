public class Algorithm
{
    public static int numOfDigits(int i)
    {
        int digits = 1;
        while (Math.abs(i) >= 10)
        {
            i /= 10;
            digits ++;
        }
        return digits;
    }

    public static boolean divisible (int f, int s)
    {
            return (f % s) == 0;

    }

    public static int sumOfOdds (int i, int j)
    {
        int sum = 0;
        while (j >= i)
        {
            if ((Math.abs(i) % 2) == 1)
            {
                sum += i;
                i +=2;
            }
            else
            {
                i += 1;
            }
        }
        return sum;
    }

    public static int sumOfMultiplesTen(int i, int j)
    {
        int sum = 0;
        while (j >= i)
        {
            if ((i % 10) == 0)
            {
                sum += i;
                i += 10;
            }
            else
            {
                if (i >= 0)
                {
                    i += (10 - (i % 10));
                }
                else
                {
                    i += (Math.abs(i) % 10);
                }
            }
        }
        return sum;
    }

    public static int sumOfParameterDigits(int i)
    {
        int sum = 0;
        i = Math.abs(i);
        while (i != 0)
        {
            sum += (i %10);
            i /= 10;
        }
        return sum;
    }

    public static int largestPowerTwo(int i)
    {
        int p = 0;
        while (Math.pow(2,p) <= i)
        {
            p++;
        }
        return (int)Math.pow(2,p-1);
    }

}

