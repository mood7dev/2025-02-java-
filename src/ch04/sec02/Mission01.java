package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
// 0점 없다로 합니당
        while (true) {
            System.out.print("점수를 입력해주세요> (종료: 0 또는 0점) ");
            String input = sc.nextLine().trim();

            // "0" 또는 "0점" 입력시 종료
            if (input.equals("0") || input.equals("0점")) {
                System.out.println("종료");
                break;
            }

            // "점" 글자가 있으면 제거하고 숫자로 변환
            if (input.endsWith("점")) {
                input = input.substring(0, input.length() - 1);
            }

            try {
                score = Integer.parseInt(input);

                if (score < 0 || score > 100) {
                    System.out.println("잘못된 입력");
                } else if (score >= 60) {
                    System.out.println("합격");
                } else {
                    System.out.println("불합격");
                }

            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력");
            }
        }
    }
}

