package atcoder20230701;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s[] = new int[8];
        
        for(int i = 0; i < 8; i++) {
        	s[i] = sc.nextInt();
        }
        String output = isCorrect(s) ? "Yes" : "No";
		System.out.println(output);
	}

		private static boolean isCorrect(int[] s) {
			for(int i = 0; i < s.length; i++) {
	        	if(s[i] <= 99 || s[i] >= 676 || s[i] % 5 != 0) {
	        		return false;
	        	}
	        	if(i > 0 && s[i] < s[i-1]) {
	        		return false;
	        	}
			}
			return true;
	}
}
