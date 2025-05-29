package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1.equals (strVar2));

        System.out.println();

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
        System.out.println(strVar3 == strVar4);
        System.out.println(strVar3.equals (strVar4));
    }
}
// 동일성(identity) 주소값이 같다면 동일하다. ==
// 동등성(equality) 값이 같다면 동등하다. equals메소드