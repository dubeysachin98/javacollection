//Find a peak element which is not smaller than its neighbours
//Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.

//Note: If the array is increasing then just print the last element will be the maximum value.
public class ArrayPeakElement {
	
	//finding the maximum element
	static int findMaxInArray(int arr[]) {
		int n= arr.length;
        // If the array is strictly increasing or has only one element

		if  (n==1 && arr[0]>arr[1]) {
			return arr[0];
		}
		//if the array is stricktly decreasing
		if (arr[n-1]>arr[n-2]) {
			return arr[n-1];
		}
		
		//checking if in between number is Greater
		for (int i=1; i<n-1; i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				return arr[i];
			}
		}
		
		// This case handles when all elements are the same
        return arr[0];

	}
	
	public static void main(String[] args) {
		try {
			int[] array1 = {5, 10, 20, 15};
	        int[] array2 = {10, 20, 15, 2, 23, 90, 67};

	        int maxElement1 = findMaxInArray(array1);
	        int maxElement2 = findMaxInArray(array2);

	        System.out.println("Output for array1: " + maxElement1);
	        System.out.println("Output for array2: " + maxElement2);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

//Output for array1: 20
//Output for array2: 20
