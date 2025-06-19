package Starcraft;

//공중유닛
public abstract class FlyingUnit extends Unit {

    //private : 내부 안에서만 사용, 여기선 부모 못 벗어남.
    //protected : 상속관계는 가능.

    @Override
    public void move() {
        System.out.println("공중으로 이동합니다");
        super.move(x,y);
    }
}