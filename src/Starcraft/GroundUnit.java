package Starcraft;

//지상유닛
public abstract class GroundUnit extends Unit {

    @Override
    public void move() {
        System.out.println("공중으로 이동합니다");
        super.move(x,y);
    }
}