package atcoder20230701;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 食べた皿の数
        int M = scanner.nextInt(); // 値段のある皿の数
        scanner.nextLine();

        String[] plates = scanner.nextLine().split(" "); // 食べた皿
        String[] pricesColor = scanner.nextLine().split(" "); // 値段のあるカラー
        String[] pricesString = scanner.nextLine().split(" "); // 値段

        int[] prices = new int[M + 1];
        for (int i = 0; i <= M; i++) {
            prices[i] = Integer.parseInt(pricesString[i]);
        }

        int totalCost = 0;
        Map<String, Integer> knownPriceMap = new HashMap<>();
        for (int i = 0; i < M; i++) {
            knownPriceMap.put(pricesColor[i], prices[i+1]);
        }
        int defaultPrice = Integer.parseInt(pricesString[0]);

        for (String plate : plates) {
            if (knownPriceMap.containsKey(plate)) {
                totalCost += knownPriceMap.get(plate);
            } else {
                totalCost += defaultPrice;
            }
        }
        System.out.println(totalCost);
    }
}
