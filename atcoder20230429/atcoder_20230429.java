package atcoder20230429;

import java.util.Scanner;

public class atcoder_20230429 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int cols = N;
		int[] C = new int[cols]; 
		
		for(int j = 0; j < C.length; j++) {
			C[j] = sc.nextInt();
//			System.out.println("C[" + j + "]の値は " + C[j]);
		}
		
		int SUM = A + B;
//		System.out.println("SUMの値は " + SUM);
		
		for(int i = 0; i < N; i++) {
			if(SUM == C[i]) {
				System.out.print(i+1);
			}
		}
	}
}
