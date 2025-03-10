public class Main
{
    static int secondSmallest(int [] arr,int n)
    {
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        
        if(n<2)
            return -1;
        for(int i=0; i<n; i++)
        {
            if(arr[i] < smallest)
                {
                    ssmallest = smallest;
                    smallest = arr[i];
                }
            else if(arr[i] < ssmallest && arr[i] != smallest)
                ssmallest = arr[i];
        }
        
        return ssmallest;
    }
    
    static int secondLargest(int [] arr,int n)
    {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        
        if(n<2)
            return -1;
        for(int i=0; i<n; i++)
        {
            if(arr[i] > largest)
                {
                    slargest = largest;
                    largest = arr[i];
                }
            else if(arr[i] > slargest && arr[i] != largest)
                slargest = arr[i];
        }
        
        return slargest;
    }
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,7,8};
		 int n = arr.length;
		 System.out.println(secondSmallest(arr,n));
		 System.out.println(secondLargest(arr,n));
		
		
	}
}