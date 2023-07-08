package atcoder20230708;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); 
        int B = scanner.nextInt(); 
        
        if(isAdjacent(A,B)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
	}

	static boolean isAdjacent(int A, int B) {
		return(A == 1 && B == 2 || A == 2 && B == 3 ||
			A == 4 && B == 5 || A == 5 && B == 6 ||
			A == 7 && B == 8 || A == 8 && B == 9);
	}
}
