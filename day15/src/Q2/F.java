package Q2;

public class F {
	int a = 2;
	static int b = 3;
	
	void abc() {
		System.out.println(a);  //1
		System.out.println(b);  //2
	}
	
	static void bcd() {
		System.out.println(a);  //3 static매서드는 static 변수만 객체생성 없이 가져다 쓸수 있다. 
		//System.out.println(b);  4
	}
}
