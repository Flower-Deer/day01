package day01;

import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		
//		int[] aa = new int[10]; //1차원 배열
//		
//		String[][] b = new String[2][3]; //2치원 배열
//		b[0][0] = "a";
//		b[0][1] = "b";
//		b[0][2] = "c";
//		b[1][0] = "d";
//		b[1][1] = "e";
//		b[1][2] = "f";
//		
//		double[][][] c = new double[2][3][3]; //3차원 배열
		
		//1번
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = 100 * i;
			System.out.println(a[i] + 100);
		}
		
		//2번
		int num = 100;
		int sum1 = 0;
		int sum2 = 0;
		int[][] box = new int[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				box[i][j] = num;
				num -= 5;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			sum1 += box[0][i];
			sum2 += box[1][i];
		}
		System.out.println(sum1 + "," + sum2);
	
		//3번
		String[][][] str = { {{"a","b"},{"c","d"},{"e","f"}},
							 {{"g","h"},{"i","j"},{"k","l"}} };
		//면의 갯수, 행의 갯수, 열의 갯수
		System.out.println(str.length); //면의갯수
		System.out.println(str[0].length); //행의갯수
		System.out.println(str[0][0].length); //열의갯수
		
//		for (int i = 0; i < str.length; i++) {
//			for (int j = 0; j < str[i].length; j++) {
//				for (int j2 = 0; j2 < str[i][j].length; j2++) {
//				}
//			}
//		}
	}
}

