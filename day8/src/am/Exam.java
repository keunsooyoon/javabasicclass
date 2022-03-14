package am;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		// 배열, 반복, 조건,
		// 주석, 클래스, 객체
		
		// Q1 첫 수부터 숫자 2개씩을 나누어 출력하세요 
		// 1,2        2,3       3,4       4,5
		
		// Q2 첫 수부터 숫자 2개씩을 더한 값이 짝수인 그 해당 숫자 2개의 인덱스 번호를 배열로
		//    만들어 출력하시오(처음 등장한 합한 값이 짝수인 2개의 수)

		int[] a = {1,3,4,5,6};
		int[] b = new int[2];
		
		for(int i = 0 ; i < a.length-1 ; i++) {
			if ((a[i]+a[i+1]) % 2 == 0) {
				b[0]= i;
				b[1]= i+1;
			}
			}
		
		System.out.println(Arrays.toString(b));
		}
	

}
