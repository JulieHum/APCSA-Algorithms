/** This class is a demonstration of selection sort and insertion sort
 * for AP Computer Science A.
 * @author Mr Holmer */
public class Sort
{
    /** Prints an array.
     * @param arr the array to be printed */
    public static void print(int[] arr)
    {
        String str = "[";
        for(int i = 0; i < arr.length - 1; i++)
            str += arr[i] + ", ";
        str += arr[arr.length - 1] + "]";
        System.out.println(str);
    }
    public static void print(String[] arr)
    {
        String str = "[";
        for(int i = 0; i < arr.length - 1; i++)
            str += arr[i] + ", ";
        str += arr[arr.length - 1] + "]";
        System.out.println(str);
    }
    /** Returns an int array of one or two digit numbers
     * @param length the length of the array
     * @return an int array of specified length */
    public static int[] random(int length)
    {
        int[] ints = new int[length];
        for(int i = 0; i < length; i++)
        {
            ints[i] = (int)(Math.random()*100);
        }
        return ints;
    }
    /** Returns the index of the minimum value in an int array
     * beginning at a specified index
     * @param index the starting index to search
     * @param arr the array to search
     * @return the index of the minimum value */
    public static int findMinIndex(int index, int[] arr)
    {
        int minUpdate = 0;
        int min = arr[index];
        for(int i = index; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                index = i;
                minUpdate++;
            }
        }
        System.out.println("Minimum Updates: " + minUpdate);
        return index;
    }
    public static int findMinIndex(int index, String[] arr)
    {
        int minUpdate = 0;
        String min = arr[index];
        for(int i = index; i < arr.length; i++)
        {
            if(arr[i].compareTo(min)<0)
            {
                min = arr[i];
                index = i;
                minUpdate++;
            }
        }
        System.out.println("Minimum Updates: " + minUpdate);
        return index;
    }
    /**Swaps the elements of two indices of an array
     * @param arr the array in which to swap
     * @param i the index of the first element
     * @param j the index of the second element */
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swap(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /** Sorts an int array in ascending order with selection sort
     * @param arr the int array to be sorted */
    public static void selectionSort(int[] arr)
    {
        int swaps = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int minIndex = findMinIndex(i, arr);
            if(minIndex != i)
            {
                swap(arr, i, minIndex);
                swaps++;
            }
            print(arr);
        }
        System.out.println("Swaps: " + swaps);
    }
    public static void selectionSort(String[] arr)
    {
        int swaps = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int minIndex = findMinIndex(i, arr);
            if(minIndex != i)
            {
                swap(arr, i, minIndex);
                swaps++;
            }
            print(arr);
        }
        System.out.println("Swaps: " + swaps);
    }
    public static void insertionSort(int[] arr)
    {
        int swaps = 0;
        for(int i = 1; i < arr.length; i++)
        {
            int temp = arr[i];
            int index = i;
            while(index > 0 && temp < arr[index - 1])
            {
                swap(arr, index, index - 1);
                swaps++;
                index--;
            }
            print(arr);
        }
        System.out.println("Swaps: " + swaps);
    }
}