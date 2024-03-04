//8.2 Traversing 2D Arrays

public class Main
{
    public static void main (String [] args)
    {
        String[][] strs1 = {{"Hello", "world", "!"}, {"It's", "me", "Genevieve"}};
        String[][] strs2 = {{"Hey", "what's", "up", "?"}, {"Just", "saying", "hi"}};
        String[][] strs3 = {{"I", "like", "your", "shirt", "!"}, {"Really", "?", "Thanks", "!"}};
        int[][]ints1 = {{1, 2}, {3, 4}};
        int[][]ints2 = {{1, 2, 3, 4}, {3, 4, 5, 6}};
        int[][]ints3 = {{-1, 0, 2}, {3, 4, 5, 6}};
        System.out.println(Algorithm.numOf(strs1, "e"));
        System.out.println(Algorithm.numOf(strs2, "y"));
        System.out.println(Algorithm.numOf(strs3, "!"));
        System.out.println(Algorithm.isInQ(ints1, 5));
        System.out.println(Algorithm.isInQ(ints2, 3));
        System.out.println(Algorithm.isInQ(ints3, 1));
    }
}