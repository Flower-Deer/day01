package day01;

import java.util.Scanner;

public class BasicQ {

	public static void main(String[] args) {
		//1~n까지 합 더하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int n = sc.nextInt();
		
		double sum = 0;
		sum = (1+n) * (n/2.0);
		System.out.println("1~ " + n + "까지의 합은 " + (int)sum);
		
		//num의 자릿 수 구하기.
		System.out.println("양의정수를 입력하세요.");
		int num = sc.nextInt();
		int s = num;
				
		int count = 0;
		while(num > 0) {
			num /= 10;
			count++;
		}
		System.out.println(s + "의 자릿수는 " +count + "입니다.");
		
		//논리 연산자
		boolean x=false, y =true;
		if(x && y) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		if(!(!x || !y)) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		//곱셈표 출력
		System.out.printf("%6s",  "|");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n-----------------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
			System.out.printf("%3s", "|");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
			
		}
		
		// X값 구하여 실수형 출력하기
		// a =10 b=13 c=12 근의공식사용
		double x1, x2, a=10.0, b=13.0, c=12.0;
		x1 = -b + Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
		x2 = -b - Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
