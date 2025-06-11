package ch06.sec09;

public class StaticCar {
    public static String model;
    public static int speed;

    public StaticCar(String m) {
        model = m;
    }

    public static void setSpeed(int s) {
        speed = s;
    }

    public static void run() {
        System.out.printf("%s가 달립니다. 시속 %dkm/h\n", model, speed);
    }
}
