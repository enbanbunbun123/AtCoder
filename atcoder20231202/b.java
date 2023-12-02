package atcoder20231202;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        
        int minCost = findMinCost(N, S, M, L);
        System.out.println(minCost);
    }
    
    private static int findMinCost(int N, int S, int M, int L) {
        int[] dp = new int[N + 13]; // N + 最大パック数(12) + 1
        for(int i = 0; i < dp.length; i++) {
            dp[i] = 99999;
        }
        dp[0] = 0;
        
        for(int i = 0; i <= N; i++) {
            if(i + 6 < dp.length) {
                dp[i + 6] = Math.min(dp[i + 6], dp[i] + S);
            }
            if (i + 8 < dp.length) {
                dp[i + 8] = Math.min(dp[i + 8], dp[i] + M);
            }
            if (i + 12 < dp.length) {
                dp[i + 12] = Math.min(dp[i + 12], dp[i] + L);
            }
        }
        
        int minCost = 99999;
        for (int i = N; i < dp.length; i++) {
            if (dp[i] < minCost) {
                minCost = dp[i];
            }
        }
        
        return minCost;
    }
}
