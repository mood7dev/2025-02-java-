package ch07.sec02;

public class SmartPhone extends Phone {
    private boolean wifi;

    public SmartPhone(String model, String color) {
        super(model, color);  // 부모 클래스의 생성자 호출
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }


    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}