package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        // Computer 객체 생성
        Computer myCom = new Computer();

        // sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
        int result1 = myCom.sum(1, 2, 3);
        // 합산 결과를 리턴받아 result1 변수에 대입
        System.out.println("result1: " + result1);

        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2: " + result2);

        // sum() 메소드 호출 시 배열을 제공하고
        int[] values = {1, 2, 3, 4, 5};
        // 합산 결과를 리턴 받아 result3 변수에 대입
        int result3 = myCom.sum(values);
        System.out.println("result3: " + result3);
        
        //sum() 메소드 호출 시 배열을 제공하고
        //합산 결과를 리턴받아 result4 변수에 대입
        int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println("result4: " + result4);
    }
}
