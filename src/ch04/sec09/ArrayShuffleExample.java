package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 10칸 짜리 배열

        for(int i = 0; i < arr.length; i++) { // 0부터 9까지 숫자를 차례대로 넣기
            arr[i] = i; // arr[0] = 0, arr[1] = 1, ..., arr[9] = 9
        }

        /*배열에 있는 숫자 섞기*/
        for (int i = arr.length - 1; i>0; i-- ) {
            /* 0부터 i까지 중에 아무 숫자 하나를 랜덤으로 고르기 */
            int j = (int)(Math.random()*(i+1));
            /* 고른숫자 j와 i번째 숫자를 바꿔요 */
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}