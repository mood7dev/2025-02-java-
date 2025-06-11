package ch06.sec10;

public class SamsungTv {
    public static String brand;
    public String model;
    public int inch;

    public void printValues() {
        System.out.printf("%s, %s, %d\n", brand, model, inch);
    }
    
    //static 메소드는 static 멤버필드, 파라미터만 사용하는 경우에만
    public static void staticMethod(int n1, int n2) {
        System.out.printf("%s, %s, %d\n", brand, n1, n2);
    }
}
