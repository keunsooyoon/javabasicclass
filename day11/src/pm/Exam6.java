package pm;

public class Exam6 {
	
	
	/* 
	 예외를 강제로 발생 시키기 throw
	예를들면 int age= -1; 실제는 예외가 아니다. 하지만 경우에 따라
	나이는 -1살은 절대 있을수가 없으므로 강제로 예외 인식시킬 필요가 있다. 
	몸무게의 경우에도 500kg는 절대 있을수가 없는 값이므로 예외로 인식시킬 필요가 있다.

	이럴 경우 해결방법은 예외 클래스를 직접 정의하여 사용하는 것이다. 
	사용자 정의 예외 클래스를 만들어보면 다른 예외 들의 동작 매커니즘도 자연스럽게 이해를 할수 있다. 
	 
	 
	 
	*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



class MyException extends Exception { // 일반예외
	MyException() {
		
	}
	MyException(String s){
		super(s);
	}
}

class MyRTException extends RuntimeException { // 실행예외
	MyRTException() {
		
	}
	MyRTException(String s){
		super(s);
	}
}
