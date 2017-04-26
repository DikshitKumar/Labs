package algo.insertionsort;

public class InsertionSortApp {

	public static void main(String[] args) {
		int[] sortedArray = insertionSort(new int[]{5,6,2,84,26});
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
		
	}
	
	public static int[] insertionSort(int [] a) {
		int ele = 0;
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			ele = a[i];
			j = i-1;
			while (j>=0 && a[j]>ele) {
				a[j+1] = a[j];
				j--;				
			}
			a[j+1] = ele;
		}
		
		return a;
		
	}

}
