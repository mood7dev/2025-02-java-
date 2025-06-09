package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        gugudan(4, 9);
    }
    public static void gugudan(int from, int to) {
        for (int dan = from; dan <= to; dan++) {
            System.out.println("[" + dan + "단]");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, dan * i);
            }
        }
    }
}
