package ch04.sec04.method;

public class Mission05Method {
    public static void main(String[] args) {
        int[] arr = {10, 70, 90, 110, 4};
        int sum = addAllupArray(arr); // 배열의 모든 값을 더한 값을 리턴
        System.out.println("합계: " + sum);
    }
public static int addAllupArray (int[] arr1) {
        int sum = 0;
        for(int item: arr1) {
            sum += item;
        }
    return sum;
    }
}
