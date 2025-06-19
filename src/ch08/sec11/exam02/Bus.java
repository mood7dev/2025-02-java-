package ch08.sec11.exam02;

public class Bus implements Vehicle {

    @Override
    public void run() {
        System.out.println("버스가 달린다");
    }

    @Override
    public void stop() {
        System.out.println("버스가 멈춘다");
    }
    
    public void openBackDoor(){
        System.out.println("버스 문이 열린다");
    }
}
