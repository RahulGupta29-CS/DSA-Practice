//Brute Force Approach

import java.util.*;

class Main {

	public static void main(String[] args) {

		int arr[] = {3,4,5,5,6,8};

		int n = arr.length;

		int temp[] = new int[n];

		int first = arr[0];

		for(int i=0; i<n; i++)

		{

			if(i == n-1)

				temp[i] = first;

			else

				temp[i] = arr[i+1];

		}

		System.out.println(Arrays.toString(temp));

	}

}

//Time Complexity: O(N) and Space Complexity: O(N)



//Optimal Approach

import java.util.*;

public class Main

{

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};

		int n = arr.length;

		int temp = arr[0];
		
		for(int i=0; i<n-1; i++)

		{

			arr[i] = arr[i+1];

		}

		arr[n-1] = temp;

		System.out.print(Arrays.toString(arr));

	}

}

//Time Complexity: O(N) and Space Complexity: O(1)