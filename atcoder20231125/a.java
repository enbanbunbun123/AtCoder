package atcoder20231125;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N と L を入力
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.nextLine(); // 次の行に進む

        // スコアを入力
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        // 合格者数をカウント
        int passingCount = 0;
        for (int score : scores) {
            if (score >= L) {
                passingCount++;
            }
        }

        // 結果を出力
        System.out.println(passingCount);

        scanner.close();
	}

}
