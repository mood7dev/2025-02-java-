package ch06.sec08;

public class PrimitiveAndRef {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println("num: " + num);

        Numbox numbox = new Numbox();
        numbox.num=10;
        changeNum(numbox);
        System.out.println("numbox.num: " + numbox.num);
    }
    public  static void changeNum(int numA) {
        numA = 20;
        System.out.println("numA: " + numA);
    }
    public  static void changeNum(Numbox numbox) {
        numbox.num = 20;
    }
}


class Numbox {
    int num;


}


