package ch06.sec08.exam03;

public class Car {
    private int gas;
    private int oil;

    public Car setFuel(int gas, int oil) {
        this.gas = gas;
        this.oil = oil;
        return this;
    }

    public int getGas() {
        return gas;
    }

    public int getOil() {
        return oil;
    }
}


/*
접근제어자(Access Modifier)
private - 같은 클래스안에서만 접근 가능
default - private + 같은 패키지는 접근 가능
protected - default + 상속 관계는 접근 가능
public - 무조건 접근 가능

private 멤버 필드에 값 대입 방법 2가지
- 생성자
- (setter) 메소드

private 멤버  필드에 값 읽기 방법 1가지
- (getter) 메소드

*/
