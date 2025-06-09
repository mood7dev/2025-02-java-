package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromto(5, 8);
        int[] arr2 = makeArrayFromto(15, 20);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println();

        shuffleArray(arr);
        shuffleArray(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
    public static int[] makeArrayFromto(int from, int to) {
        int size = to - from + 1;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + i;
        }
        return array;
    }
    public static void shuffleArray ( int[] temp) {
        for (int i = temp.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int k = temp[i];
            temp[i] = temp[j];
            temp[j] = k;
        }
    }
}
