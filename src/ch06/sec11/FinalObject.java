package ch06.sec11;

public class FinalObject {
    private final String name = "홍길동";

    private final int AGE;

    public FinalObject(int age) {
        this.AGE =age;
    }

    public void myAge() {
        System.out.println("age: " + this.AGE);
    }
}
