package ch06.sec15;

public class Singleton {
    private String name;

    private Singleton() {}

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();  // = 할당 연산자 사용
        }
        return singleton;  // 새 인스턴스가 아닌 기존 인스턴스 반환
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMyName() {
        System.out.println("내 이름은 " + name + "입니다!");
    }
}
