package Starcraft;

public abstract class Unit {
    protected int x; //좌표 x
    protected int y; //좌표 y

    //추상메소드는 오브라이딩 필수(재정의 필수)
    //이동
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void stop() {
        System.out.println("현재 위치에 정지한다");
    }

    //private : 내부 안에서만 사용, 여기선 부모 못 벗어남.
    //protected : 상속관계는 가능.
    public abstract void move();
}