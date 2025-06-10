package ch06.sec04;

public class Student {
    String name;

    public Student() {
        System.out.println("기본 생성자 호출!");
    }

    public void introduce() {
        System.out.printf("안녕 내 이름은 %s라고 해\n", this.name);
    }
}

