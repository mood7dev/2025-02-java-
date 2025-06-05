package sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        String model = "소나타";
        boolean start = true;
        int speed = 100;

        Car car = new Car("소나타", true, 100);

        System.out.println("모델명: " + car.model);
        System.out.println("시동여부: " + car.start);
        System.out.println("현재속도: " + car.speed);
    }
}
