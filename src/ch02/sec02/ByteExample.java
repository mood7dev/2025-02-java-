package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
// byte: -128 ~ 127
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = -127;
        System.out.println("var1: "+ var1);
        System.out.println("var2: "+ var2);
        System.out.println("var3: "+ var3);
        
        //byte var4 = -129; 컴파일 에러
        // 컴파일 에러가 났다는 건 데이터를 대입할 수 없다.
        // 너무 큰 값이라서 or 타입이 맞지 않아서
    }
}
