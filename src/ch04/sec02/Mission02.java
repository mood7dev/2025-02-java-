package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rank;

        while (true) {
            System.out.print("점수를 입력해 주세요> (종료: 0)");
            String input = sc.nextLine().trim();

            if (input.equals("0")) {
                System.out.print("종료");
                break;
            }

            if (input.endsWith("점")) {
                input = input.substring(0);
            }

            try {
                rank = Integer.parseInt(input);

                if (rank < 0 || rank > 100) {
                    System.out.println("잘못 입력된 값");
                } else if (rank >= 90) {
                    System.out.println("A등급");
                } else if (rank >= 80) {
                    System.out.println("B등급");
                } else if (rank >= 70) {
                    System.out.println("C등급");
                } else {
                    System.out.println("D등급");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력");
            }
        }
    }
}


/*
(점수를 입력받는다.)
점수를 입력해 주세요>

(100초과 혹은 0미만이면) "잘못된 점수입니다."
(90점이상) A등급
(90점이상) A등급
(90점이상) A등급
(90점이상) A등급
 */