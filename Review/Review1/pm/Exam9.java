package pm;

public class Exam9 {
    /*
Ŭ������ ���� ������� - �ʵ� / �ż��� / ������ / this this()

�ʵ� - Ŭ������ ���Ե� ����, ��ü�� �Ӽ� ���� �����Ҽ� �ִ�. 
    */
    public static void main(String[] args) {
        
        A a = new A();
        System.out.println(a.m);
        System.out.println(a.n);
        a.work1();
    }
}

class A {
    int m = 3; //�ʵ� , ��������
    int n = 4;

    void work1() {
        int k = 5; // ��������
        int m = 2;
        System.out.println(k);
        work2(2);
    }

    void work2(int i) {
        int j = 4; // ��������
        System.out.println(i + j);
    }
}
