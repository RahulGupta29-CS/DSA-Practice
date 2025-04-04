public class Main {

    static int maxConsecutiveOnes(int [] arr)
    {
        int n = arr.length;
        int count =0;
        int max = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i] == 1)
            {
                count++;
                max = Math.max(max,count);
            }

            else {
                count = 0;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes(arr));
    }
}

