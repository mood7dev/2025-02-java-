package basic;

public class Memo {
    public static void main(String[] args) {
                // 게시판 컬럼명 문자열
                String board = "번호, 제목, 내용, 성명";

                // 공백 제거 후 쉼표로 분리
                String[] arr = board.replace(" ", "").split(",");

                // 인덱스별로 출력 (게시판 헤더 출력)
                System.out.println("게시판 컬럼명 출력:");
                System.out.println("1열: " + arr[0]); // 번호
                System.out.println("2열: " + arr[1]); // 제목
                System.out.println("3열: " + arr[2]); // 내용
                System.out.println("4열: " + arr[3]); // 성명
                System.out.println();

                // 게시판 헤더를 가로로 출력하기
                System.out.print("게시판 헤더: ");
                for (String column : arr) {
                    System.out.print(column + "\t");
                }
            }
        }
