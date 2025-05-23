package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        // char ch1 = `aa`; //문자타입은 문자 하나만 저장 가능
        // char ch2 = ""; //""는 문자열 타입이고 문자타입에 저장 불가능
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);
        
        name = job; // 주소값복사: Shallow 카피, 얇은 복사

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);// 나는 "자바"를 배웁니다.

        String str2 = "번호\t이름\t직업";
        System.out.println(str2);
        System.out.println("안녕하세요\t반가와요\tㅎㅎㅎ");

        String str3 = "나는 \n자바\n를 배웁니다.";
        System.out.println(str3);

        System.out.printf("%s%n%s%n%s%n", "나는", "자바를", "배웁니다.");
        System.out.println("끝");
    }
}
