import java.util.*;
public class Main
{
    
    public static void bubbleSort(int[] arr,int i , int n)
    {
        if(n == i) return;
        
            int j = i;
            while(j>0 && arr[j-1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        
        
        bubbleSort(arr,i+1,n);
    }
	public static void main(String[] args) {
	    int [] arr = {5,4,3,2,1};
	    int n = arr.length;
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr,0,n);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	}
}