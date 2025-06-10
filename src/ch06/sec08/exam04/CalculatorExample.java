package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        //한 변의 길이가 40인 정사각형의 넓이
        Calculator nemo = new Calculator();
        double result = nemo.areaRectangle(40);
        System.out.println(result);

        //직사각형 넓이
        double result2 = nemo.areaRectangle(40,50);
        System.out.println(result2);
    }
}
