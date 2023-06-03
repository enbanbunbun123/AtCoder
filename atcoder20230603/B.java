package atcoder20230603;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		if(N < 1000) {
			System.out.println(N);
		} else if(N < 10000) {
			N = (N / 10) * 10;
			System.out.println(N);
		} else if(N < 100000) {
			N = (N / 100) * 100;
			System.out.println(N);
		} else if(N < 1000000) {
			N = (N / 1000) * 1000;
			System.out.println(N);
		} else if(N < 10000000) {
			N = (N / 10000) * 10000;
			System.out.println(N);
		} else if(N < 100000000) {
			N = (N / 100000) * 100000;
			System.out.println(N);
		} else if(N < 1000000000) {
			N = (N / 1000000) * 1000000;
			System.out.println(N);
		} else {
			N = (N / 10000000) * 10000000;
			System.out.println(N);
		}
	}

}
