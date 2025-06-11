package ch06.sec11;

import java.io.PrintStream;

public class FinalStudy {
    public static void main(String[] args) {
        final  int num = 10;
        //num = 20;
        final int num2;
        num2 = 10;
        System.out.println("num2: " + num2);
        // num2 = 20; // 한번 입력되면 수정 할 수 없다

        PrintStream ps = System.out;

        FinalObject fo1 = new FinalObject(10);
        FinalObject fo2 = new FinalObject(20);

        fo1.myAge(); //immutable
        fo2.myAge();
    }
}
