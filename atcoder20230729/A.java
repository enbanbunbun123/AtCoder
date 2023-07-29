package atcoder20230729;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       String S = sc.next();
	       
	       List<String> valid = Arrays.asList("ACE","BDF","CEG","DFA","EGB","FAC","GBD");
	       
	       if(valid.contains(S)) {
	    	   System.out.println("Yes");
	       } else {
	    	   System.out.println("No");
	       }
	}
}
