package day01;

public class Array02_2 {

	public static void main(String[] args) {
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
		
		for (String[] ss : box) {
			for (String sss: ss) {
				System.out.print(sss + "\t");
			}
			System.out.println();
		}
		
		//1. so라는 배열만들기
		String so[][] = new String[10][2];
		//2. box배열의 학번은 문자> 정수로 형변환
		//3. 비교하여 가장작은 숫자 so 배열에 넣기
		int num = Integer.parseInt(box[0][0]);
		int minindex =0;
		int min = num;
		int soindex = 0;
		
		for (int i = 0; i < box.length; i++) {
			if(min > Integer.parseInt(box[i][0])) {
				min= Integer.parseInt(box[i][0]);
				minindex = i;
			}
		}
		so[soindex][0] = String.valueOf(min);
		so[soindex][1] = box[soindex][1];
		
		System.out.println(so[soindex][0] + " " +so[soindex][1]);
		box[minindex][0] = "9999999";
		soindex++;
		//4. box배열 모두 null로 지운다.
		//5. so 배열에 다 넣은 것 출력
	}

}
