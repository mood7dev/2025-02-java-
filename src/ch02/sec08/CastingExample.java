package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte)var1; //강제 형변환
        System.out.println("var2: " + var2);

        double var7 = 3.14;
        int var8 = (int)var7;
        System.out.println("var8: " + var8);
    }
}
