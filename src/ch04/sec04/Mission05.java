package ch04.sec04;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = {10, 70, 90, 110};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("값: " + sum);
    }
}
