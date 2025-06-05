package ch02.sec08;

public class CastingMethodExample {
    public static void main(String[] args) {
    double r1 = division(10,3);
        printnumber((int)r1);
    }

    public static double division(int a, int b){
        return (double) a / b;
    }

    public static void printnumber(int n) {
        System.out.println(n);
    }
}
