package algo.recursion;

public class RecursionApp {

	public static void main(String [] args) {
		int[] A = {10,20,30,40,50,60,70};
		System.out.println(binarySearch(60,0,A.length-1,A));
		//reduceByOne(3);
	}
	
	private static int binarySearch(int i, int p, int r, int[] a) {
		System.out.println("[ "+ p +" ...."+ r + " ]");
		int q = 0;
		if(p>r) {
			return -1;
		} else {
			q = (p+r)/2;
			if(a[q] == i){
				return q;
			} else if(a[q]>i) {
				return binarySearch(i, p, q-1, a);
			} else {
				 return binarySearch(i, q+1, r, a);
			}
		}
	}

	public static void reduceByOne(int n) {
		if(n >= 0){ //base case
			reduceByOne(n-1);
		}
		System.out.println("Completed call :" +n);

	}
	
}
