package ch06.sec09;

public class CarExample {
    private static Car Car;

    public static void main(String[] args) {
        Car porsche = new Car("포르쉐");
        Car benz = new Car("벤츠");
        Car bmw = new Car("BMW");

       porsche.run();
        benz.run();
        bmw.run();
    }
}
