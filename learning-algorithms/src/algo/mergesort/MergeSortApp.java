package algo.mergesort;

public class MergeSortApp {

	public static void main(String[] args) {
		int[] inputArray = {9, 7, 3, 1, 6, 4, 8, 0};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(inputArray);
		
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

}
