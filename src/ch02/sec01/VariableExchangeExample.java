package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3 , y = 5;
        int a = x;
        x = y;
        y = a;
        System.out.printf("x: %d, Y: %d\n", x, y);
        // 스와핑 처리

    }
}
