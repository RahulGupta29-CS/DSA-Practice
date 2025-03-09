import java.util.*;
public class QuickSort
{
    static  int partition(int[]arr, int low, int high)
    {
        int pivot = arr[low]; // Choose first Element as Pivot
        int i = low;
        int j = high;

        while (i<j)
        {
            //Find Element Greater than Pivot From Left
            //Here arr[i]<= pivot is because if there are 2 same numbers then we need to place it in either left or right
            while (arr[i] <= pivot && i<= high-1)
            {
                i++;
            }

            //Find Element Smaller than pivot From Right
            while (arr[j] > pivot && j >= low +1)
            {
                j--;
            }
            //Swap if i and j haven't crossed
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Swap pivot with element at j(final Position of pivot)
        int temp = arr[j];
        arr[j] =arr[low];
        arr[low] = temp;


        return j; // Return partition index
    }


    static void quickSort(int []arr,int low , int high)
    {
        if(low < high)
        {
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);//Sort left Array
            quickSort(arr,partitionIndex+1,high);//Sort Right Array

        }
    }


    public static void main(String[] args) {
        int [] arr = {10,7,8,9,1,5};
        int n = arr.length;
        System.out.println("Before Sorting:" + Arrays.toString(arr));

        quickSort(arr,0,n-1);
        System.out.println("After Sorting" + Arrays.toString(arr));

    }
}