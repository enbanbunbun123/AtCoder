package atcoder20231125;

import java.util.Scanner;

public class c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long D = sc.nextLong(); // Dを読み込む
        long closestDifference = Long.MAX_VALUE; // 最小差を追跡するための変数

        int maxX = (int) Math.sqrt(D); // xの最大値はDの平方根の整数部分

        for (int x = 0; x <= maxX; x++) {
            int y = (int) Math.sqrt(D - (long) x * x); // yの値を計算
            // y、y-1、y+1のケースでDに最も近い値を探す
            for (int dy = -1; dy <= 1; dy++) {
                int newY = y + dy;
                if (newY < 0) {
                    continue; // yが0未満になる場合はスキップ
                }
                long currentDifference = Math.abs((long) x * x + (long) newY * newY - D);
                if (currentDifference < closestDifference) {
                    closestDifference = currentDifference; // 最小差を更新
                }
            }
        }

        System.out.println(closestDifference); // 結果を出力
        sc.close(); // スキャナーを閉じる
    }
}
