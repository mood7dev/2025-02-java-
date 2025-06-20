package ch08.sec11.exam02;

public class Taxi implements Vehicle, Trunk{

    @Override
    public void run() {
        System.out.println("택시가 달린다");
    }

    @Override
    public void stop() {
        System.out.println("택시가 멈춘다");
    }

    @Override
    public void load(String luggage) {
        System.out.printf("트렁크에 %s를 싣는다.\n",luggage);
    }
}
