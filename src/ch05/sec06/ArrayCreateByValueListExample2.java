package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{83, 90, 87};
        System.out.println("main: " + Arrays.toString(scores));
        printItem(scores);
    }

    /*
    void : 리턴타입
    main, printItem 등 : 메소드명
    ( ... ) : 파라미터
    */
    public  static void printItem(int[] arr) {
        System.out.println("printItem: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("score[%d]: %d\n", i, arr[i]);


        /*
        score[0] : 83
        score[1] : 83
        score[2] : 83
        score[3] : 83

         */
        }
    }
    }

