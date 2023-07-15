package atcoder20230715;

import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {

	       Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int P = sc.nextInt();
	        int Q = sc.nextInt();
	        
	        int[] D = new int[N];
	        for(int i = 0; i < N; i++) {
	        	D[i] = sc.nextInt();
	        }
	        
	        Arrays.sort(D);
	        
	        if(P > Q + D[0]) {
	        	System.out.println(Q + D[0]);
	        } else {
	        	System.out.println(P);
	        }
	}
}
