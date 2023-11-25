package atcoder20231125;

import java.util.Scanner;


public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		int R = sc.nextInt();
		
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int[] X = new int[N];
		for(int i = 0; i < N; i++) {
			if(A[i] < L) {
				X[i] = L;
			} else if(A[i] > R) {
				X[i] = R;
			} else {
				X[i] = A[i];
			}
		}
		
		for(int x : X) {
		    System.out.print(x + " "); 
		}
		
		sc.close();
	}

}
