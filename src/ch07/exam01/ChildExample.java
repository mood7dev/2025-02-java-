package ch07.exam01;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        System.out.println("--------------------");
        Parent parent = child;
        //타입은 알고 있는 메소드만 호출할 수 있다.
        parent.method1();
        parent.method2();
        Child child2 = (Child) parent;
        child2.method3();
    }
}
