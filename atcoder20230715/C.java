package atcoder20230715;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {

	public static void main(String[] args) {

	       Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        sc.nextLine();
	        
	        Set<String> unique = new HashSet<>();

	        for(int i = 0; i < N; i++) {
	        	String s = sc.nextLine();
	        	String reversed = new StringBuilder(s).reverse().toString();
	        	
	        	if(!unique.contains(s) && !unique.contains(reversed)) {
	        		unique.add(s);
	        	}
	        }
	        System.out.println(unique.size());
    }

}
