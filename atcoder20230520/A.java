package atcoder20230520;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int C = A/B;
		System.out.println(C);
		if (A%B != 0) {
			C++;
		}
		System.out.println(C);
	}

}