package am;

import java.util.Arrays;

public class Exam7 {
    public static void main(String[] args) {
        //�迭�� ������ �ڷ����� ���� �����ϴ� �ڷ����̴�. 
        //�迭�� �����Ҷ� ������ ũ�⸦ ������ �� ����. 

            //�迭 ����
        int[] arr1 = new int[3];
        int[] arr2;
        arr2 = new int[3];

        String[] str1 = new String[3];

            // �迭 �� �ֱ�
        arr1[0] = 1;
        arr1[1] = 2;
        str1[0] = "hi";

        String[] str2 = {"hi","Hello"};


            // �迭 ������
        for (String each:str2) {
            System.out.println(each);
        }


        System.out.println(str2.length); //�迭�� ���� ���ϱ� 

        System.out.println(Arrays.toString(str2));
    }
}
