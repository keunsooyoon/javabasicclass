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



    // 3 6 9 °ÔÀÓ  100ÀÌÇÏÀÇ ¼ýÀÚÁß...

    // 1    2     Â¦     4     5       Â¦    7      8       Â¦       10
    // 11   12    Â¦
    // 21
    // Â¦   Â¦    Â¦Â¦   Â¦     Â¦      Â¦Â¦
    // 41
    // 51
    // Â¦
    // 71
    // 81
    // Â¦                                                   Â¦Â¦      100

    for (int i = 1 ; i <= 100 ; i++) {

        int cnt = 0; //'Â¦'ÀÇ °¹¼ö
        int x = i/10;// 12 -> 1
        int y = i%10;// 12 -> 2

        if (x % 3 == 0)
            cnt++;
        if (y % 3 == 0) 
            cnt++;



        if (i % 10 == 0) {
            if(cnt ==2)
                System.out.println("Â¦Â¦");
            else if (cnt == 1)
                System.out.println("Â¦");
            else 
                System.out.println(i);

        } else {
            if(cnt ==2)
            System.out.print("Â¦Â¦\t");
        else if (cnt == 1)
            System.out.print("Â¦\t");
        else 
            System.out.print(i +"\t");
        }
    }
}
}
