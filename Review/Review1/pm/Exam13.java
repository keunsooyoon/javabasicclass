package pm;

public class Exam13 {
    /* this Ű����
    ��� �ż���� �ڽ��� ���Ե� Ŭ������ ��ü�� ����Ű�� this ���� ����
    �� �ִ�. 
    this. �� �����ص� �׻� �ڹٰ� �߰����ֱ⶧���� ���� �Ű��� �� �ʿ䰡
    ���� �������� this. ��������� �� �ٿ���� �Ҷ��� �ִ�. 

    */
    public static void main(String[] args) {
        P p = new P();
        p.work();
        System.out.println(p.m);
        System.out.println(p.n);
    }
}

class P {  // �����ڴ� �ڹٰ� �ڵ����� �⺻ �����ڸ� �ۼ����ش�. 
    int m;
    int n;
    void init(int a, int b) {
        int c;
        c = 3;
        this.m = a;  // this. �� �����ϸ� �ڵ����� �ڹٰ� �ٿ��ش�. 
        this.n = b;  // this. �� �����ϸ� �ڵ����� �ڹٰ� �ٿ��ش�. 
    }
    void work() {
        this.init(2,3); // this. �� �����ϸ� �ڵ����� �ڹٰ� �ٿ��ش�. 
    }
}