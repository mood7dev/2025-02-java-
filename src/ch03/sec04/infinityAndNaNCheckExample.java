package ch03.sec04;

public class infinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        System.out.println("z: " + z);
        System.out.println("z: " + (5 / 0.0));
        // System.out.println("z: " + (5/0));

        System.out.println(z + 2);
/*
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);

 */
        }
    }
