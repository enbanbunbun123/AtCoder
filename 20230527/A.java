//package 20230527;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		
		if(isSimilar(N, S, T)) {
			System.out.println("Yes");	
		} else {
			System.out.println("No");
		}
	}

	static boolean isSimilar(int N, String S, String T) {
		for(int i = 0; i < N; i++) {
			char s = S.charAt(i);
			char t = T.charAt(i);
			
			if(s == t) continue;
			if(s == '1' && t =='l' || s == 'l' && t =='1') continue;
			if(s == '0' && t =='o' || s == 'o' && t =='0') continue;
			
			return false;
		}
		return true;
	}
}
