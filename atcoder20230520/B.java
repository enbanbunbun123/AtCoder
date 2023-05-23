package atcoder20230520;

import java.util.Scanner;

public class B {
	static String target = "snuke";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();
		
		char[][] grid = new char[H][W];
		for(int i = 0; i < H; i++) {
			grid[i] = sc.nextLine().toCharArray();
		}
		int[][] directions = {
				{0, 1},
				{0, -1},
				{1, 0},
				{-1, 0},
				{1, -1},
				{1, 1},
				{-1, -1},
				{-1, 1}
		};
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				for(int[] dir : directions) {
					if(search(grid, i, j, dir[0], dir[1])) {
						for(int k = 0; k < target.length(); k++) {
							System.out.println((i + 1) + " " + (j + 1));
							i += dir[0];
							j += dir[1];
						}
					}
					return;
				}
			}
		}
		
	}

	static boolean search(char[][] grid, int i,int j, int di, int dj) {
		for(int k = 0; k < target.length(); k++) {
			if(i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != target.charAt(k)) {
				return false;
			}
			i += di;
			j += dj;
		}
		return true;
	}
}
