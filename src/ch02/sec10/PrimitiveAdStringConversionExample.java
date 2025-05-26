package ch02.sec10;

public class PrimitiveAdStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        System.out.println("value1: " + (value1 + 1));

        double value2 = Double.parseDouble("3.14");
        //double value2_1 = (double)"3.14";
        System.out.println("value2: " + value2);

        boolean value3 = Boolean.parseBoolean("true");
        System.out.println("value3: " + value3);

        long value4 = Long.parseLong("1000000");
        System.out.println("value4: " + value4);

        //문자열로 만들어주는 함수 String.valueOf()
        int intValue = 10;
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(value2);
    }
}
