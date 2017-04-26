package algo.quicksort;

import java.util.Arrays;

public class QuickSortApp {

	public static void main(String[] args) {
		int [] inputArray = {5, 8, 86, 54, 2, 26, 98, 45};
		quickSort(inputArray, 0, inputArray.length-1);
		System.out.println(Arrays.toString(inputArray));
	}

	
	
	private static void quickSort(int[] inputArray, int start, int end) {
		if(start < end){
			int q = partition(inputArray,start,end);
			quickSort(inputArray, start, q-1);
			quickSort(inputArray, q+1, end);
		}		
	}


	private static int partition(int[] inputArray, int start, int end) {
		int x = inputArray[end];
		int i = start -1;
		for (int j = start; j <= end-1; j++) {
			if(inputArray[j]<= x) {
				i = i+1;
				int temp = inputArray[i];
				int temp2 = inputArray[j];
				inputArray[i] = temp2;
				inputArray[j] = temp;
			}
		}
		int temp = inputArray[i+1];
		inputArray[end] = temp;
		inputArray[i+1] = x;
		
		return i+1;
	}

}
