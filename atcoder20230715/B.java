package atcoder20230715;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    static class Product {
        int price;
        List<Integer> features;

        public Product(int price, List<Integer> features) {
            this.price = price;
            this.features = features;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextInt();  

        List<Product> products = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int price = scanner.nextInt();
            int C = scanner.nextInt();
            List<Integer> features = new ArrayList<>();
            for (int j = 0; j < C; j++) {
                features.add(scanner.nextInt());
            }
            products.add(new Product(price, features));
        }

        String answer = "No";
        outerLoop:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (products.get(i).price >= products.get(j).price
                    && products.get(j).features.containsAll(products.get(i).features)
                    && (products.get(i).price > products.get(j).price 
                        || !products.get(i).features.containsAll(products.get(j).features))) {
                    answer = "Yes";
                    break outerLoop;
                }
            }
        }
        System.out.println(answer);
    }
}
