package algo.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] A = {10,20,30,40,50,60,70};
		System.out.println(binarySearch(20,A));
	}

	private static int binarySearch(int i, int[] a) {
		int p = 0;
		int r = a.length -1;
		int q = 0;
		do {
			q = (p+r)/2;
			if(a[q]==i){
				return q;
			} else if(a[q]>i){
				r = q-1;
			} else {
				p = q+1;
			}
		} while (p<=r);
		
		return -1;
		
	}

}
