public class Algorithm {
    // 4.1 while Loops
    public static int numOfDigits(int i) {
        int digits = 1;
        while (Math.abs(i) >= 10) {
            i /= 10;
            digits++;
        }
        return digits;
    }


    public static boolean divisible(int f, int s) {
        return (f % s) == 0;

    }

    public static int sumOfOdds(int i, int j) {
        int sum = 0;
        while (j >= i) {
            if ((Math.abs(i) % 2) == 1) {
                sum += i;
                i += 2;
            } else {
                i += 1;
            }
        }
        return sum;
    }

    public static int sumOfMultiplesTen(int i, int j) {
        int sum = 0;
        while (j >= i) {
            if ((i % 10) == 0) {
                sum += i;
                i += 10;
            } else {
                if (i >= 0) {
                    i += (10 - (i % 10));
                } else {
                    i += (Math.abs(i) % 10);
                }
            }
        }
        return sum;
    }

    public static int sumOfParameterDigits(int i) {
        int sum = 0;
        i = Math.abs(i);
        while (i != 0) {
            sum += (i % 10);
            i /= 10;
        }
        return sum;
    }

    public static int largestPowerTwo(int i) {
        int p = 0;
        while (Math.pow(2, p) <= i) {
            p++;
        }
        return (int) Math.pow(2, p - 1);
    }




    // 4.3 Developing Algorithms Using Strings
    public static boolean secondInFirst(String s, String t) {
        boolean tf = false;
        for (int i = 0; i <= (s.length() - t.length()); i++) {
            if (s.substring(i, i + t.length()).equals(t)) {
                tf = true;
            }
        }
        return tf;
    }

    public static String stringReversed(String s) {
        String newString = "";
        for (int i = s.length(); i > 0; i--)
            newString += s.substring(i - 1, i);
        return newString;
    }

    public static boolean palindrome(String s) { // does not exclude special symbols
        return stringReversed(s).compareTo(s) == 0;
    }

    public static int occurrences (String s, String t)
    {
        String n = s;
        int place;
        int occurrence = 0;
        for (int i = 0; i < n.length(); i++)
        {
            place = n.indexOf(t);
            if (place != -1)
            {
                n = n.substring(place + t.length());
                occurrence++;
            }
        }
        return occurrence;
    }
}


