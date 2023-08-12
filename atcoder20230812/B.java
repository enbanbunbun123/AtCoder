package atcoder20230812;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] betCount = new int[N];
        List<List<Integer>> bets = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int Ci = sc.nextInt();
            betCount[i] = Ci;
            List<Integer> playerBets = new ArrayList<>();
            for (int j = 0; j < Ci; j++) {
                playerBets.add(sc.nextInt());
            }
            bets.add(playerBets);
        }

        int X = sc.nextInt();

        int minBetCount = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (bets.get(i).contains(X)) {
                minBetCount = Math.min(minBetCount, betCount[i]);
            }
        }

        List<Integer> winners = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (bets.get(i).contains(X) && betCount[i] == minBetCount) {
                winners.add(i + 1);
            }
        }

        System.out.println(winners.size());
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i));
            if (i != winners.size() - 1) {
                System.out.print(" ");
            }
        }
        if (winners.size() > 0) {
            System.out.println();
        }
    }
}
