package ch07.sec02;

public class Phone {
    String model;
    String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void hangup() {
        System.out.println("전화를 끊습니다.");
    }
}
