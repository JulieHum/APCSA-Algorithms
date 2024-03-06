//8.2 Traversing 2D Arrays

public class Main
{
    public static void main (String [] args)
    {
        String[][] strs1 = {{"Hello", "world", "!"}, {"It's", "me", "Genevieve"}};
        String[][] strs2 = {{"Hey", "what's", "up"}, {"Just", "saying", "hi"}};
        String[][] strs3 = {{"I", "like", "your", "shirt", "!"}, {"Really", "?", "Thanks", "!"}};
        String[][] strs4 = {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}};
        String[][] strs5 = {{"bravo", "charlie"}, {"zebra", "alpha"}};
        int[][] ints1 = {{1, 2}, {3, 4}};
        int[][] ints2 = {{1, 2, 3, 4}, {3, 4, 5, 6}};
        int[][] ints3 = {{-2, -1, 0, 2}, {3, 4, 5, 6}};
        int[][] ints4 = {{3, 2, 1}, {4, 5, 6}};
        int[][] ints5 = {{2, 3, 4}, {-1, -2, -3}};
        int[][] ints6 = {{1, 2, 3}, {4, 5, 6}};
        int[][] ints7 = {{1, 2},{3, 2}};
        double[][] doubles1 = {{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}};
        double[][] doubles2 = {{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}, {4.0, 6.0, 9.0}};
        double[][] doubles3 = {{2.9, 3.1, 2.0}, {3.5, 1.1, -0.8}, {-4.2, 3.1, 2.2}};
        System.out.println(Algorithm.numOf(strs1, "e"));
        System.out.println(Algorithm.numOf(strs2, "y"));
        System.out.println(Algorithm.numOf(strs3, "!"));
        System.out.println(Algorithm.isInQ(ints1, 5));
        System.out.println(Algorithm.isInQ(ints2, 3));
        System.out.println(Algorithm.isInQ(ints3, 1));
        System.out.println(Algorithm.firstOccurrence(ints1, 3));
        System.out.println(Algorithm.firstOccurrence(ints2, 4));
        System.out.println(Algorithm.firstOccurrence(ints3, 1));
        System.out.println(Algorithm.diagonal(ints1));
        System.out.println(Algorithm.diagonal(ints2));
        System.out.println(Algorithm.diagonal(ints3));
        System.out.println(Algorithm.column(strs4, 1));
        System.out.println(Algorithm.column(strs1, 2));
        System.out.println(Algorithm.column(strs2, 1));
        System.out.println(Algorithm.maximum(ints4));
        System.out.println(Algorithm.maximum(ints2));
        System.out.println(Algorithm.maximum(ints3));
        System.out.println(Algorithm.minimum(ints4));
        System.out.println(Algorithm.minimum(ints2));
        System.out.println(Algorithm.minimum(ints3));
        System.out.println(Algorithm.shortest(strs4));
        System.out.println(Algorithm.shortest(strs1));
        System.out.println(Algorithm.shortest(strs2));
        System.out.println(Algorithm.longest(strs4));
        System.out.println(Algorithm.longest(strs1));
        System.out.println(Algorithm.longest(strs2));
        System.out.println(Algorithm.largestAbsDiff(ints5, ints6));
        System.out.println(Algorithm.largestAbsDiff(ints2, ints3));
        System.out.println(Algorithm.largestAbsDiff(ints4, ints6));
        System.out.println(Algorithm.mean(doubles1));
        System.out.println(Algorithm.mean(doubles2));
        System.out.println(Algorithm.mean(doubles3));
        System.out.println(Algorithm.twoEquivQ(ints7));
        System.out.println(Algorithm.twoEquivQ(ints1));
        System.out.println(Algorithm.twoEquivQ(ints2));
        System.out.println(Algorithm.lastAlpha(strs5));
        System.out.println(Algorithm.lastAlpha(strs1));
        System.out.println(Algorithm.lastAlpha(strs2));
    }
}