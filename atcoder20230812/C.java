package atcoder20230812;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        char[] S = scanner.nextLine().toCharArray();
        int[] colors = new int[N];
        List<List<Integer>> colorIndices = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            colorIndices.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            colors[i] = scanner.nextInt();
            colorIndices.get(colors[i] - 1).add(i);
        }

        char[] result = new char[N];
        for (int i = 0; i < M; i++) {
            List<Integer> indices = colorIndices.get(i);
            for (int j = 0; j < indices.size(); j++) {
                result[indices.get(j)] = S[indices.get((j - 1 + indices.size()) % indices.size())];
            }
        }

        System.out.println(new String(result));
    }
}


