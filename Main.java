//7.5 Searching
import java.util.ArrayList;
public class Main
{
    public static void main (String [] args)
    {
        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        ints1.add(-1); ints1.add(0); ints1.add(1);
        ArrayList<Integer> ints2 = new ArrayList<Integer>();
        ints2.add(-1); ints2.add(-2); ints2.add(-3);
        ArrayList<Integer> ints3 = new ArrayList<Integer>();
        ints3.add(1); ints3.add(2); ints3.add(3);
        ArrayList<String> str1 = new ArrayList<String>();
        str1.add("String");
        ArrayList<String> str2 = new ArrayList<String>();
        str2.add("Strings"); str2.add("Stringy"); str2.add("String"); str2.add("Strung");
        ArrayList<String> str3 = new ArrayList<String>();
        str3.add("Strings"); str3.add("are"); str3.add("lame"); str3.add(".");
        ArrayList<Integer> ints4 = new ArrayList<Integer>();
        ints4.add(1); ints4.add(2);
        ArrayList<Integer> ints5 = new ArrayList<Integer>();
        ints5.add(2); ints5.add(3);
        int[] int1 = {1, 2, 3};
        int[] int2 = {-1, 0, 1};
        int[] int3 = {1, 2};

        System.out.print(ints1 + " ");
        System.out.println(Algorithm.nLessThan0(ints1));
        System.out.print(ints2 + " ");
        System.out.println(Algorithm.nLessThan0(ints2));
        System.out.print(ints3 + " ");
        System.out.println(Algorithm.nLessThan0(ints3));

        System.out.print(str1 + " ");
        System.out.println(Algorithm.inQ(str1, "String"));
        System.out.print(str2 + " ");
        System.out.println(Algorithm.inQ(str2, "String"));
        System.out.print(str3 + " ");
        System.out.println(Algorithm.inQ(str3, "String"));

        System.out.print(ints4 + " ");
        System.out.print(ints5 + " ");
        System.out.println(Algorithm.sameValueQ(ints4, ints5));
        System.out.print(ints1 + " ");
        System.out.print(ints2 + " ");
        System.out.println(Algorithm.sameValueQ(ints1, ints2));
        System.out.print(ints1 + " ");
        System.out.print(ints3 + " ");
        System.out.println(Algorithm.sameValueQ(ints1, ints3));

        System.out.print(ints3 + " ");
        System.out.println(Algorithm.firstAppear(ints3, 2));
        System.out.print(ints1 + " ");
        System.out.println(Algorithm.firstAppear(ints1, -1));
        System.out.print(ints4 + " ");
        System.out.println(Algorithm.firstAppear(ints4, 3));

        System.out.println(Algorithm.firstAppear(int1, 2));
        System.out.println(Algorithm.firstAppear(int2, -1));
        System.out.println(Algorithm.firstAppear(int3, 3));
    }
}