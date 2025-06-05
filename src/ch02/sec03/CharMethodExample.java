package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToInt('c');
        printCharToInt('가');
        printCharToInt('!');

        int val = getCharToInt('c');
        System.out.println("val: " + val);
    }
        public static void printCharToInt(char ch) {
            System.out.print("c: " + 'c');
        }

    public static int getCharToInt(char ch) {
        return 1;
    }
}




