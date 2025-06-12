package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myphone.getModel());
        System.out.println("색상: " + myphone.getColor());

        myphone.getClass();
        myphone.internet();
        myphone.hangup();
    }
}
