package am;

import javax.lang.model.util.ElementScanner6;

public class Exam6 {
    public static void main(String[] args) {
        
   
    // for (int i = 0 ; i <= 10 ; i++){
    //     if (i % 2 == 0){
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    // for(;;)
    //     System.out.println("Hello World");
    // }


    // while(true){
    //     System.out.println("Hello World");
    // }
    // int i = 0;
    // while(true){
    //     if (i == 10){
    //         break;
    //     }
    //     System.out.println("Hello World");
    //     i++;
    // }



    // int i = 0;

    // do {
    //    System.out.println("Hello World");
    //     i++;
    // }while(i <= 10);



    // 3 6 9 ����  100������ ������...

    // 1    2     ¦     4     5       ¦    7      8       ¦       10
    // 11   12    ¦
    // 21
    // ¦   ¦    ¦¦   ¦     ¦      ¦¦
    // 41
    // 51
    // ¦
    // 71
    // 81
    // ¦                                                   ¦¦      100

    for (int i = 1 ; i <= 100 ; i++) {

        int cnt = 0; //'¦'�� ����
        int x = i/10;// 12 -> 1
        int y = i%10;// 12 -> 2

        if (x % 3 == 0)
            cnt++;
        if (y % 3 == 0) 
            cnt++;



        if (i % 10 == 0) {
            if(cnt ==2)
                System.out.println("¦¦");
            else if (cnt == 1)
                System.out.println("¦");
            else 
                System.out.println(i);

        } else {
            if(cnt ==2)
            System.out.print("¦¦\t");
        else if (cnt == 1)
            System.out.print("¦\t");
        else 
            System.out.print(i +"\t");
        }
    }
}
}
