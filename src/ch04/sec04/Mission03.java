package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;
        System.out.println("star " + star);
        for (int i = 0; i < star; i++) {
            System.out.println();
            for (int k = 0; k < star; k++)
                System.out.printf("*");
        }
    }
}