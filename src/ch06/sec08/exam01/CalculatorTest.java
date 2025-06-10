package ch06.sec08.exam01;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        //전원켜기
        cal.powerOn();

        //덧셈 수행
        int sum = cal.plus(10,20);
        System.out.println("10+20= " + sum);

        //전원끄기
        cal.powerOff();
    }
}
