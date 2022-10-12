package day01;

import java.util.Scanner;

public class Basic01 {

	public static void main(String[] args) {
		System.out.println("세 정수의 최대값을 구합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값");
		int a = sc.nextInt();
		System.out.println("b의 값");
		int b = sc.nextInt();
		System.out.println("c의 값");
		int c = sc.nextInt();
		
		int max = -9999999;
		if (max < a) max =a;
		if (max < b) max =b;
		if (max < c) max =c;
		
		System.out.println("최댓값은 " + max + "입니다.");
		
		int min = 999999;
		if (min > a) min = a;
		if (min > b) min = b;
		if (min > c) min = c;
		
		System.out.println("최솟겂은 " + min + "입니다.");
		
		int mid;
		
		if (a>=b)
			if(b>=c)
				mid = b;
			else if (a <= c)
				mid = a;
			else
				mid = c;
		else if (a>c)
			mid = a;
		else if (b>c)
			mid = c;
		else
			mid = b;
		
		System.out.println("중앙값은 " + mid + "입니다.");
		
		int s = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < s + 1; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
