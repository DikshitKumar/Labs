package algo.selectionsort;

public class SelestionSortApp {

	public static void main(String[] args) {
		int [] myArray = selectionSort(new int[] {52,25,6,4,82,16,89});
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	private static int[] selectionSort(int[] is) {
		int min = 0;
		for (int i = 0; i < is.length-1; i++) {
			min = i;
			for(int j =i+1; j<is.length; j++){
				if(is[j]<is[min]){
					min = j;
				}
			}
			int temp = is[i];
			is[i] = is[min];
			is[min] = temp;
		}
		return is;
	}

}
