package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setFuel(10, 5);  // oil 값도 같이 넣어줘야 함

        int car1Gas = car1.getGas();
        System.out.println("car1Gas: " + car1Gas);
        System.out.println("car1oil: " + car1.getOil());

        System.out.println("--------------");

        Car car2 = new Car();
        car2.setFuel(30,40);
        System.out.println("car1Gas: " + car2.getGas());
        System.out.println("car1oil: " + car2.getOil());
    }
}
