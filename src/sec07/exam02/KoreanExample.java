package sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {

        Korean korean = new Korean();
        System.out.println(korean.nation);
        System.out.println(korean.name);
        System.out.println(korean.ssn);

        Korean korean2 = new Korean("홍길동", "45345-4546");
        System.out.println(korean2.nation);
        System.out.println(korean2.name);
        System.out.println(korean2.ssn);

    }
}
