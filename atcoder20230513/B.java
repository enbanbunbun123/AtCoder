package atcoder20230513;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();
		String[] numbers = line.split(" ");

		int[] num = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			num[i] = Integer.parseInt(numbers[i]);
		}
		
//		System.out.println(num);
		
		for(int i = 0; i < N; i++) {
			if(num[i] - num[i+1] != 1) {
				int insertIndex = i + 1;
				int insertValue = num[1] + 1;
//				num.add(insertIndex,insertValue)
			}
		}
	}

}
