//7.6 Sorting
import java.util.ArrayList;
public class Main
{
    public static void main (String [] args)
    {
        String [] ssstrs1 = {"zebra", "alpha"};
        String [] ssstrs2 = {"zebra", "alpha", "delta", "beta", "phi", "gamma", "zeta", "lambda"};
        String [] ssstrs3 = {"bake", "cake", "make", "rake", "lake", "take", "ache", "fake", "wake", "opaque", "remake", "jake"};
        String [] isstrs1 = {"zebra", "alpha"};
        String [] isstrs2 = {"zebra", "alpha", "delta", "beta", "phi", "gamma", "zeta", "lambda"};
        String [] isstrs3 = {"bake", "cake", "make", "rake", "lake", "take", "ache", "fake", "wake", "opaque", "remake", "jake"};
        ArrayList<String> ssstrings1 = new ArrayList<String>();
        for (String str : ssstrs1)
        {
            ssstrings1.add(str);
        }
        ArrayList<String> ssstrings2 = new ArrayList<String>();
        for (String str : ssstrs2)
        {
            ssstrings2.add(str);
        }
        ArrayList<String> ssstrings3 = new ArrayList<String>();
        for (String str : ssstrs3)
        {
            ssstrings3.add(str);
        }
        ArrayList<String> isstrings1 = new ArrayList<String>();
        for (String str : isstrs1)
        {
            isstrings1.add(str);
        }
        ArrayList<String> isstrings2 = new ArrayList<String>();
        for (String str : isstrs2)
        {
            isstrings2.add(str);
        }
        ArrayList<String> isstrings3 = new ArrayList<String>();
        for (String str : isstrs3)
        {
            isstrings3.add(str);
        }
        ArrayList<Integer> ssints1 = new ArrayList<Integer>();
        ssints1.add(1); ssints1.add(0); ssints1.add(-1);
        ArrayList<Integer> ssints2 = new ArrayList<Integer>();
        ssints2.add(3); ssints2.add(2); ssints2.add(1);
        ArrayList<Integer> ssints3 = new ArrayList<Integer>();
        ssints3.add(5); ssints3.add(1); ssints3.add(3); ssints3.add(9); ssints3.add(7);
        ArrayList<Integer> isints1 = new ArrayList<Integer>();
        isints1.add(1); isints1.add(0); isints1.add(-1);
        ArrayList<Integer> isints2 = new ArrayList<Integer>();
        isints2.add(3); isints2.add(2); isints2.add(1);
        ArrayList<Integer> isints3 = new ArrayList<Integer>();
        isints3.add(5); isints3.add(1); isints3.add(3); isints3.add(9); isints3.add(7);
        Sort.selectionSort(ssstrs1);
        Sort.selectionSort(ssstrs2);
        Sort.selectionSort(ssstrs3);
        Sort.insertionSort(isstrs1);
        Sort.insertionSort(isstrs2);
        Sort.insertionSort(isstrs3);
        Sort.strSelectionSort(ssstrings1);
        Sort.strSelectionSort(ssstrings2);
        Sort.strSelectionSort(ssstrings3);
        Sort.strInsertionSort(isstrings1);
        Sort.strInsertionSort(isstrings2);
        Sort.strInsertionSort(isstrings3);
        Sort.intSelectionSort(ssints1);
        Sort.intSelectionSort(ssints2);
        Sort.intSelectionSort(ssints3);
        Sort.intInsertionSort(isints1);
        Sort.intInsertionSort(isints2);
        Sort.intInsertionSort(isints3);
    }
}