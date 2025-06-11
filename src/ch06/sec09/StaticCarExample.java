package ch06.sec09;

public class StaticCarExample {
    public static void main(String[] args) {
        new StaticCar("벤츠");
        StaticCar.setSpeed(200);
        StaticCar.run();

        new StaticCar("BMW");
        StaticCar.setSpeed(150);
        StaticCar.run();
    }
}

