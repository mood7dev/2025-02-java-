package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        // byte 용량  -128 ~ 127
        byte var1 = 125;
        for(int i=0; i<5; i++) {
            var1++;
            System.out.printf("var1: %d\n", var1);
        }
        System.out.println("--------------");

            byte var2 = -125;
            for(int j =0; j<5; j++) {
                var2--;
                System.out.printf("var2: %d\n", var2);
            }
        }
    }
