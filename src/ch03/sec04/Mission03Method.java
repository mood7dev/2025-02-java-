package ch03.sec04;

import ch03.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);

        printSingleLine(star);
    }

    public static void printSingleLine(int cnt) {
        for (int i = 0; i <= cnt; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
