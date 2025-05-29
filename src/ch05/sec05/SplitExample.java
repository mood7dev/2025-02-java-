package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "번호, 제목, 내용, 성명";

        // 공백 제거 후 쉼표로 분리
        String[] arr = board.replace(" ", "").split(",");

        // 인덱스별로 출력
        System.out.println("번호: " + arr[0]);
        System.out.println("제목: " + arr[1]);
        System.out.println("내용: " + arr[2]);
        System.out.println("성명: " + arr[3]);
        System.out.println();

        // for 문으로 전체 출력
        System.out.println("배열 전체 출력:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
