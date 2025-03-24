//Move all Zeros to the end of the array

//Brute force Approach

import java.util.*;

public class Main
{
	static void moveZeros(int []arr, int n)
	{
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			if(arr[i] > 0)
				list.add(arr[i]);
		}

		for(int i=0; i<n; i++)
		{
			if(i<list.size())
				arr[i] = list.get(i);
			else
				arr[i] = 0;
		}

	}

	public static void main(String[] args) {
		int arr[] = {0,1,0,3,12};
		int n = arr.length;
		moveZeros(arr,n);
		System.out.println(Arrays.toString(arr));
	}
}

//Optimal Approach




import java.util.*;

public class Main {
	public static int[] moveZeros(int n, int []a) {
		int j = -1;
		//place the pointer j:
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				j = i;
				break;
			}
		}

		//no non-zero elements:
		if (j == -1) return a;

		//Move the pointers i and j
		//and swap accordingly:
		for (int i = j + 1; i < n; i++) {
			if (a[i] != 0) {
				//swap a[i] & a[j]:
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				j++;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
		int n = 10;
		int[] ans = moveZeros(n, arr);
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println("");
	}
}


