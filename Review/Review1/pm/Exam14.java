package pm;


public class Exam14 {

    // this �ż���

    // this Ű����� �ſ� ����غ������� �ǹ̰� ���� �ٸ���. 
    // this()�ż���� �ڽ��� ���� Ŭ���� ������ �ٸ� �����ڸ� ȣ���Ѵ�. 
    // this() �ż����� Ư¡
    // 1. �������� ���ο����� ���ȴ�. 
    // 2. �������� ù �ٿ����� ����Ѵ�. 
    // �� �ΰ��� ��Ģ �� �ϳ��� �������� ������ ������ �߻��ȴ�. 

    public static void main(String[] args) {
        
   
    Y y = new Y();
    System.out.println();
    Y y3 = new Y(3);
}
}


class Y {
    Y() {  //�⺻ ������
        System.out.println("ù��° ������");
    }
    Y(int a) {
        this(); // ù�ٿ� ��ġ�Ѵ�. 
        System.out.println("�ι�° ������");
    }
}