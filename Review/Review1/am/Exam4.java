package am;

public class Exam4 {
    /* ���  

    �⺻������ �ҽ� �ڵ带 ���������� �Ʒ��� ���ʴ�� 1�پ� ó���ȴ�. 

    ���α׷��� �ǵ������� �帧�� �ٲ�� �� �ʿ䰡 �ִ�. �̶� ���Ǵ� ���� ����̴�. 

    �� ����� '���α׷��� ó�� ������ �ٲٴ� ��' �̴�. 

    �ڹٿ����� 5���� ����� 2���� ���� Ű���� break continue
    
    ���ǹ� if switch~case 
    
    �ݺ��� for    while~do while 


    if
    ���ǿ� ���� ���๮�� ���� ���θ� �����ϴµ� ���ȴ�. 


    */
public static void main(String[] args) {
    

    int val = 5;
    if(val < 3) {
        System.out.println("����1");
    } else {
        System.out.println("����2");
    }



    int score = 85;
    String c = " ";
    if (score >= 90) {
        c = "A";
    } else if (score >= 80) {
        c = "B";
    } else if (score >= 70) {
        c = "C";
    } else if (score >= 60) {
        c = "D";
    } else {
        c = "F";
    }

    System.out.println("����� ������ " + c + "�Դϴ�.");


    int x = 1;
    // �Է��Ͻ� {x}�� ���� �����Դϴ�.   0�Դϴ�    ���� �����Դϴ�.
    
    if(x > 0) {
        System.out.println(x + "�� ���� �����Դϴ�.");
    } else if ( x == 0) {
        System.out.println(x + "�� 0�Դϴ�.");
    } else {
        System.out.println(x + "�� ���� �����Դϴ�.");

    }

    
    switch(x){
        case 1:
        System.out.println(x + "�� ���� �����Դϴ�.");
        break;
        case 0:
        System.out.println(x + "�� 0�Դϴ�.");
        break;
        case -1:
        System.out.println(x + "�� ���� �����Դϴ�.");
        break;
    }

    // switch case

    int a = 1;
    switch(a) {
        case 1:
            System.out.println("1�Դϴ�.");
            break;
        case 2:
            System.out.println("2�Դϴ�.");
            break;
    }


    int month = 3;
    switch(month){
        case 3: case 4: case 5:
        System.out.println("���Դϴ�.");
        break;
        case 6: case 7: case 8:
        System.out.println("�����Դϴ�.");
        break;
    }

}
}
