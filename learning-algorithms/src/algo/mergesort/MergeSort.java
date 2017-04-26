package algo.mergesort;

public class MergeSort {

	public void sort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length-1);
	}

	private void sort(int[] inputArray, int start, int end) {
		if(end<= start){
			return;
		}
		int mid = (start + end)/2;
		sort(inputArray, start, mid); //sort left half
		sort(inputArray,mid+1,end); //sort right half
		merge(inputArray,start,mid,end); //merge sorted result into input array.		
	}

	private void merge(int[] inputArray, int start, int mid, int end) {
		int tempArray[] = new int[end - start + 1];

		int leftSideIndex = start;

		int rightSideIndex = mid + 1;
		int k = 0;

		while (leftSideIndex <= mid && rightSideIndex <= end) {
			if (inputArray[leftSideIndex] < inputArray[rightSideIndex]) {
				tempArray[k] = inputArray[leftSideIndex];
				leftSideIndex++;
			} else {
				tempArray[k] = inputArray[rightSideIndex];
				rightSideIndex++;
			}
			k++;
		} // end of loop

		if (leftSideIndex <= mid) {
			while (leftSideIndex <= mid) {
				tempArray[k] = inputArray[leftSideIndex];
				leftSideIndex++;
				k++;
			}
		} else if (rightSideIndex <= end) {
			while (rightSideIndex <= end) {
				tempArray[k] = inputArray[rightSideIndex];
				rightSideIndex++;
				k++;
			}
		}
		
		//copy temp array into input array.
		for (int i = 0; i < tempArray.length; i++) {
			inputArray[start+i] = tempArray[i];
		}
		
	}

}
