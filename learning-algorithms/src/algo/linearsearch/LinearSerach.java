package algo.linearsearch;

public class LinearSerach {

	public static void main(String[] args) {
		int[] a = {5,4,6,8,9,3};
		int x = 8;
		System.out.println(linearSearch(a, x));
		
		
	}

	private static int linearSearch(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}

}
