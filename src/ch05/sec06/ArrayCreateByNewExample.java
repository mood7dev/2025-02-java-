package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        // 배열공간 먼저 확보
        int[] arr1 = new int[3];

        int num = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = num += 10;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
    }
}
