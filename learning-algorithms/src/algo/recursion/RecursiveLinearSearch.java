package algo.recursion;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		int[] a = { 5, 4, 6, 8, 9, 3 };
		int x = 1;
		int i = 0;
		System.out.println(linearSearch(a, x, i));

	}

	private static int linearSearch(int[] a, int x, int i) {
		if (i > a.length-1) {
			return -1;
		} else if (a[i] == x) {
			return i;
		} else {
			System.out.println("index at :" + i);
			return linearSearch(a, x, i + 1);
		}
	}
}
