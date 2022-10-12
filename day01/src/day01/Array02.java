package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
//		String[][] box = {{"0397134", "김효진"}, {"0465345","이종협"}, {"0427214","서상춘"},
//				{"0487342","배영미"},{"0512478","김예진"}};
		
		String[][] box = new String[10][2];
		box[0][0] = "0397134";
		box[0][1] = "김효진";
		box[1][0] = "0465345";
		box[1][1] = "이종협";
		box[2][0] = "0427214";
		box[2][1] = "서상춘";
		box[3][0] = "0487342";
		box[3][1] = "배영미";
		box[4][0] = "0512478";
		box[4][1] = "김예진";
		
		// 삽입하기
//		box[5][0] = "0407357";
//		box[5][1] = "정성미";
		
		// 키보드로 받아 넣기
		// 비어있는 인덱스 5를 구해서 여기에 넣기!
		int i=0, j=0;
		for ( ; i < box.length; i++) {
			if (box[i][0] == null) {
				break;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학번입력 :");
		box[i][0] = sc.next();
		System.out.print("이름입력 :");
		box[i][1] = sc.next();
		
		for (String[] ss : box) {
			for (String sss: ss) {
				System.out.println(sss + "\t");
			}
			System.out.println();
		}
		
		//배영미 삭제하기
//		String deleteName = "배영미";
//		int k = 0;
//		for ( ; k < box.length; k++) {
//			if (box[k][1].equals(deleteName)) {
//				break;
//			}
//		}
//		System.out.println(box[k][1] + " " + k);
//		box[k][0] = null;
//		box[k][1] = null;
//		
//		System.out.println("-----삭제 후 출력 -----");
//		for (String[] ss : box) {
//			for(String sss : ss) {
//				System.out.println(sss + "\t");
//			}
//			System.out.println();
//		}
		
		//김예진 검색
		String searchName = "김예진";
		int q =0;
		boolean searchFlag = false;
		System.out.println(box[4][1].equals(searchName));
		try {
			for ( ; q < box.length; q++) {
				if(box[q][1].equals(searchName)) {
					searchFlag = true;
					break;
				}
			}
		}catch(NullPointerException e) {
			System.out.println("우리반이 아닙니다.");
		}
		
		System.out.println(box[q][0] + " " + box[q][1]);
		
	}
}
