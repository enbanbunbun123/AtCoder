package atcoder20230603;

import java.util.Scanner;

public class C {
    static int N, D;
    static int[][] coord;
    static boolean[] infected;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        D = sc.nextInt();
        coord = new int[N][2];
        infected = new boolean[N];

        for (int i = 0; i < N; i++) {
            coord[i][0] = sc.nextInt();
            coord[i][1] = sc.nextInt();
        }

        dfs(0);  // start from 1

        for (boolean b : infected) {
            if (b)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    static void dfs(int v) {
        infected[v] = true;

        for (int i = 0; i < N; i++) {
            if (!infected[i] && isClose(v, i)) {
                dfs(i);
            }
        }
    }

    static boolean isClose(int i, int j) {
        long dx = coord[i][0] - coord[j][0];
        long dy = coord[i][1] - coord[j][1];
        return dx * dx + dy * dy <= (long) D * D;
    }
}
