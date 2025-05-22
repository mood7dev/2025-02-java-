package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int min = 5;
        int time = (hour * 60) + min;

System.out.printf("%d시간 %d분%n", hour, min);
System.out.printf("총 %d분%n" , time);


    }
}
// 3시간 5분 총 185분
