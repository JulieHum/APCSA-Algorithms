//7.4 Developing Algorithms Using ArrayLists
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        ints1.add(1); ints1.add(2); ints1.add(2); ints1.add(3); ints1.add(3);
        ArrayList<Integer> ints2 = new ArrayList<Integer>();
        ints2.add(1); ints2.add(1); ints2.add(1); ints2.add(2); ints2.add(3);
        ArrayList<Integer> ints3 = new ArrayList<Integer>();
        ints3.add(3); ints3.add(3); ints3.add(2); ints3.add(2); ints3.add(1); ints3.add(1);
        ArrayList<Integer> ints4 = new ArrayList<Integer>();
        ints4.add(1); ints4.add(2); ints4.add(2); ints4.add(3); ints4.add(3);
        ArrayList<Integer> ints5 = new ArrayList<Integer>();
        ints5.add(1); ints5.add(2); ints5.add(2); ints5.add(3); ints5.add(3);
        ArrayList<Integer> ints6 = new ArrayList<Integer>();
        ints6.add(1); ints6.add(2); ints6.add(3);
        ArrayList<String> str1 = new ArrayList<String>();
        str1.add("Hello"); str1.add("world"); str1.add("!");
        ArrayList<String> str2 = new ArrayList<String>();
        str2.add("Coding"); str2.add("is"); str2.add("fun"); str2.add("?");
        ArrayList<String> str3 = new ArrayList<String>();
        str3.add("Hi"); str3.add("there"); str3.add(".");
        ArrayList<Integer> ints7 = new ArrayList<Integer>();
        ints7.add(2); ints7.add(3); ints7.add(4);
        ArrayList<Integer> ints8 = new ArrayList<Integer>();
        ints8.add(-1); ints8.add(-2); ints8.add(-3);
        ArrayList<Double> doubles1 = new ArrayList<Double>();
        doubles1.add(1.5); doubles1.add(3.5); doubles1.add(5.5);
        ArrayList<Double> doubles2 = new ArrayList<Double>();
        doubles2.add(1.0); doubles2.add(2.0); doubles2.add(3.0); doubles2.add(4.0);
        ArrayList<Double> doubles3 = new ArrayList<Double>();
        doubles3.add(-1.5); doubles3.add(0.0); doubles3.add(1.5);
        ArrayList<Integer> ints9 = new ArrayList<Integer>();
        ints9.add(1); ints9.add(0); ints9.add(-1);
        ArrayList<Integer> ints10 = new ArrayList<Integer>();
        ints10.add(1); ints10.add(2); ints10.add(3); ints10.add(2);

        System.out.print(ints1 + " ");
        Algorithm.removeConsec(ints1);
        System.out.println(ints1);
        System.out.print(ints2 + " ");
        Algorithm.removeConsec(ints2);
        System.out.println(ints2);
        System.out.print(ints3 + " ");
        Algorithm.removeConsec(ints3);
        System.out.println(ints3);

        System.out.print(ints4 + " ");
        Algorithm.remove(ints4, 2);
        System.out.print(ints4 + " ");
        Algorithm.remove(ints4, 3);
        System.out.print(ints4 + " ");
        Algorithm.remove(ints4, 1);
        System.out.println(ints4);

        System.out.print(ints5 + " ");
        Algorithm.addInt(ints5, 4);
        System.out.println(ints5 + " ");
        System.out.print(ints1 + " ");
        Algorithm.addInt(ints1, 2);
        System.out.println(ints1 + " ");
        System.out.print(ints2 + " ");
        Algorithm.addInt(ints2, 3);
        System.out.println(ints2 + " ");

        System.out.print(ints6 + " " + ints3 + " ");
        System.out.println(Algorithm.reverseQ(ints6, ints3));
        System.out.print(ints1 + " " + ints3 + " ");
        System.out.println(Algorithm.reverseQ(ints1, ints3));
        System.out.print(ints2 + " " + ints3 + " ");
        System.out.println(Algorithm.reverseQ(ints2, ints3));

        System.out.print(ints3 + " ");
        System.out.println(Algorithm.maximum(ints3));
        System.out.print(ints2 + " ");
        System.out.println(Algorithm.maximum(ints2));
        System.out.print(ints5 + " ");
        System.out.println(Algorithm.maximum(ints5));

        System.out.print(ints3 + " ");
        System.out.println(Algorithm.minimum(ints3));
        System.out.print(ints2 + " ");
        System.out.println(Algorithm.minimum(ints2));
        System.out.print(ints5 + " ");
        System.out.println(Algorithm.minimum(ints5));

        System.out.print(str1 + " ");
        System.out.println(Algorithm.shortest(str1));
        System.out.print(str2 + " ");
        System.out.println(Algorithm.shortest(str2));
        System.out.print(str3 + " ");
        System.out.println(Algorithm.shortest(str3));

        System.out.print(str1 + " ");
        System.out.println(Algorithm.longest(str1));
        System.out.print(str2 + " ");
        System.out.println(Algorithm.longest(str2));
        System.out.print(str3 + " ");
        System.out.println(Algorithm.longest(str3));

        System.out.print(ints7 + " ");
        System.out.print(ints8 + " ");
        System.out.println(Algorithm.largestAbsDiff(ints7, ints8));
        System.out.print(ints1 + " ");
        System.out.print(ints2 + " ");
        System.out.println(Algorithm.largestAbsDiff(ints1, ints2));
        System.out.print(ints3 + " ");
        System.out.print(ints8 + " ");
        System.out.println(Algorithm.largestAbsDiff(ints3, ints8));

        System.out.print(doubles1 + " ");
        System.out.println(Algorithm.average(doubles1));
        System.out.print(doubles2 + " ");
        System.out.println(Algorithm.average(doubles2));
        System.out.print(doubles3 + " ");
        System.out.println(Algorithm.average(doubles3));

        System.out.print(ints6 + " ");
        Algorithm.reverse(ints6);
        System.out.println(ints6);
        System.out.print(ints1 + " ");
        Algorithm.reverse(ints1);
        System.out.println(ints1);
        System.out.print(ints8 + " ");
        Algorithm.reverse(ints8);
        System.out.println(ints8);

        ints2.add(4);
        System.out.print(ints2 + " ");
        System.out.println(Algorithm.consecQ(ints2));
        System.out.print(ints5 + " ");
        System.out.println(Algorithm.consecQ(ints5));
        System.out.print(ints7 + " ");
        System.out.println(Algorithm.consecQ(ints7));

        System.out.print(ints9 + " ");
        System.out.println(Algorithm.firstNegative(ints9));
        System.out.print(ints8 + " ");
        System.out.println(Algorithm.firstNegative(ints8));
        System.out.print(ints1 + " ");
        System.out.println(Algorithm.firstNegative(ints1));

        System.out.print(ints10 + " ");
        System.out.println(Algorithm.twoEqualQ(ints10));
        System.out.print(ints1 + " ");
        System.out.println(Algorithm.twoEqualQ(ints1));
        System.out.print(ints3 + " ");
        System.out.println(Algorithm.twoEqualQ(ints3));
    }
}