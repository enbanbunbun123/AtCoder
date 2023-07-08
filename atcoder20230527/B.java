package atcoder20230527;
import java.util.Scanner;

public class  B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] a = new int[M][N];

        // Read photo arrays
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Initialize array for unfriendly pairs
        boolean[][] unfriendly = new boolean[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                unfriendly[i][j] = true;
            }
        }

        // Check each photo for consecutive people
        for (int i = 0; i < M; i++) {
            int[] pos = new int[N + 1];
            for (int j = 0; j < N; j++) {
                pos[a[i][j]] = j;
            }
            for (int j = 1; j <= N; j++) {
                for (int k = j + 1; k <= N; k++) {
                    if (Math.abs(pos[j] - pos[k]) == 1) {
                        unfriendly[j][k] = false;
                    }
                }
            }
        }

        // Count unfriendly pairs
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (unfriendly[i][j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
