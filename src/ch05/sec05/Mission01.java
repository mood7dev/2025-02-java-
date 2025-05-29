package ch05.sec05;

import java.util.Scanner;

import static java.lang.System.in;

public class Mission01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        while(true) {
            System.out.print("주민번호를 입력하시오> ");
            String print = sc.next();

            //주민등록번호 길이 체크
            if (print.length() != 14) {
                System.out.println("잘못 입력하셨습니다");
                continue;
            }
                char gender = print.charAt(7);

                switch (gender) {
                    case '1', '3' -> System.out.println("남자입니다.");
                    case '2', '4' -> System.out.println("여자입니다.");
                    default -> {
                        System.out.println("잘못 입력하셨습니다");
                        continue;
                    }
                }
                break;
        }
        System.out.println("프로그램 종료");
    }
}

/*
주민번호를 입력하시오

(만약) 주민등록번호길이가 다르면 "잘못입력하셨습니다."
(길이가 맞다면)8번째 자리의 값으로 "여성","남성" 출력해주세요.
(8번째 자리가 1~4가 아니라면) "잘못 입력하셨습니다."
 */