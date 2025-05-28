package ch04.sec04;

public class Mission06 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 100) {
                break;
            }
            max = i;
            }
        System.out.println(max);
    }
}
/*
1부터 몇까지 더하면 누적합계가 100을 넘지 않는
제일 큰 수가 무엇인지 알아내는 예제.
 */