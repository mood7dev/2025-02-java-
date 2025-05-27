package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        System.out.println("1.result= " + result);
        result -= 5;
        System.out.println("2.result= " + result);
        result *= 3;
        System.out.println("3.result= " + result);
        result /= 5;
        System.out.println("4.result= " + result);
        result %= 3;
        System.out.println("5.result= " + result);
    }
}
