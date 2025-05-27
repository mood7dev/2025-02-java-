package ch03.sec04;

public class infinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        System.out.println("z: " + z);
    }
}
