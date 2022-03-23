package am;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* Object은 모든 타입의 객체 저장 가능하지만 이때 주의해야 할 점이 있다. 
데이터를 저장할때는 상관없지만 저장된 데이터를 각각의 타입으로 꺼내기 위해서는 
저장된 형태로 캐스팅해야한다. 필드 자체가 Object 타입이기 때문에 get()
매서드로 가져오는 타입 또한 항상 Object타입이다. 따라서 Apple객체를 저장했을 때는 
get() 매서드로 가져온 Object 을 Apple타입 혹은 Pencil객체를 저장했을때는
가져온 Object 타입을 각Pencil타입으로 각각 캐스팅 해야 한다. 

하지만 실수로 실제로는 Apple객체인데 가져올떄는 Pencil객체로 캐스팅을 하게되면
잘못 캐스팅했을 때 발생하는 예외인 ClassCastException 는 실행 예외이기때문에
문법오류는 발생하지 않는다. 잘못된 캐스팅은 실행 중에 예외를 발생하게 된다. 
프로그램이 강제 종료될것이다. 

*/
class Apple {}
class Pencil {}

class Goods {  // Object 모든 타입의 객체 저장 가능
	private Object object = new Object();
	public Object get() {
		return object;
	}
	public void set(Object object) {
		this.object = object;

	}
}

