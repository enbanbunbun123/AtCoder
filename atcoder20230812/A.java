package atcoder20230812;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
        String PI = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";

	       Scanner sc = new Scanner(System.in);
	       int N = sc.nextInt();
	       
	       System.out.println(PI.substring(0, N+2));
	}
}
