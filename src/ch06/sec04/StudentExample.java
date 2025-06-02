package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        Student  s1 = new Student();
        Student  s2 =  new Student();

        s1.name = "홍길동";
        s1.introduce();
        s2.name = "신사임당";
        s2.introduce();

    }
}
