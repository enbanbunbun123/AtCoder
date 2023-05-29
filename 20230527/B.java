import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] photos = new int[M][N];
		for(int i = 0; i < M; i++) {
			for(int j = 0;j < N; j++) {
				photos[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		boolean[][] matrix = new boolean[N + 1][N + 1];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N-1; j++) {
				matrix[photos[i][j]][photos[i][j+1]] = true;
				matrix[photos[i][j-1]][photos[i][j]] = true;
			}
		}
		
		int count = 0;
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N-1; j++) {
				if(!matrix[i][j]) count++;
			}
		}
		
		System.out.println(count);
	}

}
