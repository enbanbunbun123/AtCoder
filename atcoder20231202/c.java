package atcoder20231202;
import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int[] results = calculateSum(N, A);
		
		for(int sum : results) {
			System.out.print(sum + " ");
		}
		
		sc.close();
	}
	
	private static int[] calculateSum(int N, int[] A) {
		int[] sums = new int[N];
		
		for(int i = 0; i < N; i++) {
			int sum = 0;
			for(int j = 0; j < N; j++) {
				if(A[j] > A[i]) {
					sum += A[j];
				}
			}
			sums[i] = sum;
		}
		
		return sums;
	}
}
