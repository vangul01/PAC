
public class hw5 {
	public static void main (String[] args) {
		int result = 0;
		int X = 7;
		int A[] = {1, 4, 2, 7, 5, 8, 2};
		for(int i=0; i<A.length; i++) {
			if (A[i] == X) {
				result = i;				
			}
		} 
		System.out.print("This is the outcome of your search: " + result);
	}
}