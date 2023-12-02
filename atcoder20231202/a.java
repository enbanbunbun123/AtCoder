package atcoder20231202;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int D = sc.nextInt();
		
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		d++;
		
		if(d > D) {
			d = 1;
			m++;
		}
		
		if(m > M) {
			m = 1;
			y++;
		}
		
		System.out.println(y + " " + m + " " + d);
	}
}
