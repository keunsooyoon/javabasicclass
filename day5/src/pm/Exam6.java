package pm;

public class Exam6 {

	public static void main(String[] args) {
		
//		// 5개의 원소가 있는 1차원 배열의 모든 원소를 순서대로 출력하는 코드를 for-each 문을 사용하여 작성하세요
//		int[] a = new int[]{1,2,3,4,5};		
//		
//		for (int each: a) {
//			System.out.println(each);
//		}
//		
//		
//		//b라는 이름의 2차원 배열 객체를 생성하세요
//		
//		//		1  3  5
//		//		7  9
//		
//		int[][] b = {{1,3,5},{7,9}};
//		
//		// 이중 for 문을 사용하여 2차원 배열의 모든 원소를 출력하시오.
//		//  (단, 반드시 .length를 사용)
//		
//		for(int i = 0; i < b.length ; i ++) {
//			for (int j = 0; j < b[i].length ; j++) {
//				System.out.println(b[i][j]);
//			}
//		}
//		
// String str = "내 이름은 [홍길동]입니다. 나이는 [15]살입니다."
// 라는 문자열이 있을떄 String 매서드를 사용하여 
// String name -> "홍길동" int age -> 15 가 저장되도록
// 코드를 작성하시오. 
// 단 indexOf() lastIndexOf() substring() 반드시 한번이상 사용

//(output)		
//name		
//age	
	String str = "내 이름은 [홍길동]입니다. 나이는 [15]살입니다.";
	
	int name1 = str.indexOf('[')+1;
	System.out.println(name1);
	
	int age1 = str.lastIndexOf('[')+1;
	System.out.println(age1);		


	String name = str.substring(name1,name1+3);
	
	System.out.println(name);
	
	
	String age = str.substring(age1, age1+2);
	
	System.out.println(age);
	}
}
