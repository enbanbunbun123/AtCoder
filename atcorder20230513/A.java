package atcorder20230513;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int half = N/2;
		int MathHalf = (int)Math.round(half);
		int MathHalfFloor = (int)Math.floor(half);
		
		int Twin = 0;
		int Awin = 0;
		
		if(N == 1) {
			char Win = S.charAt(N-1);
			System.out.println(Win);
		}else {
			for(int i = 0; i < N; i++) {
				char Winner = S.charAt(i);
				
				if(Winner == 'T'){
					Twin++;
				}else {
					Awin++;
				}	
				
				if(Twin == MathHalf) {
					System.out.println('T');
					return;
				}else if(Awin == MathHalf){
					System.out.println('A');
					return;
				}
			}
			
			if(Twin > Awin) {
				System.out.println('T');
			}else if (Awin > Twin) {
				System.out.println('A');
			}
		}
			
		}

}
