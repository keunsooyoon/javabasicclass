package am;
public class Exam5 {
    public static void main(String[] args) {
        //for문으로 0 1 2 3 4 5


        // for(int i = 0 ; i < 6 ; i++) {  //start stop step
        //     System.out.print(i + " ");
        // }
        //while문으로 0 1 2 3 4 5

        // int a = 0;
        // while(a < 6) {
        //     System.out.print(a + " ");
        //     a++;
        // }

        // 구구단을 출력하세요 for 
        // 2 * 1 = 2
        // 2 * 2 = 4

        // 9 * 9 = 81

        // for (int i = 2 ; i < 10 ; i++) {
        //     //System.out.println(i);
        //     for ( int j = 1 ; j < 10 ; j++) {
        //         System.out.println(i + " * " + j + " = " + i*j);
        //     }
        // }

        int dan = 2;
        while (dan < 10){
            int num = 1;
            while (num < 10){
                System.out.println(dan + " * " + num + " = " + dan * num);
                num++;
            }
            dan++;
        }




    }
}
