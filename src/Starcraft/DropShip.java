package Starcraft;

//수송기
public class DropShip extends FlyingUnit {
    protected GroundUnit[] units = new GroundUnit[8];
    protected int loadedIndex = 0;

    // 유닛 하나를 태운다
    public boolean load(GroundUnit unit) {
        if (loadedIndex == units.length) {
            return false; // 수송기 가득 참
        }
        units[loadedIndex++] = unit;
        return true;
    }

    //유닛 하나를 떨군다. 메소드명 unload
    public GroundUnit unload() {
        if (loadedIndex == 0) {
            return null; // 적재된 유닛 없음
        }
        GroundUnit unit = units[--loadedIndex]; // 인덱스 먼저 줄이고
        units[loadedIndex] = null;
        return unit;
    }
}