package ch05.sec11;

public class Confirmation08 {
    public static void main(String[] args) {
        // 2차원 배열 선언 및 초기화
        // 각 행마다 배열 길이가 다를 수 있음 (가변 배열)
        int[][] arr = {
                {95, 86},              // 0행, 2개 요소
                {83, 92, 96},          // 1행, 3개 요소
                {78, 83, 93, 87, 88},  // 2행, 5개 요소
        };

        int sum = 0;     // 점수 합계를 저장할 변수
        int count = 0;   // 점수 총 개수를 저장할 변수

        // 행 반복: 0부터 시작해서 모든 행 방문
        for(int i = 0; i < arr.length; i++) {
            // 각 행의 열(요소) 반복
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];   // 현재 요소를 sum에 더함
                count++;            // 요소 개수 1 증가
            }
        }

        // 합계 출력
        System.out.println("총 합계: " + sum);

        // 평균 계산 (실수로 정확한 소수점까지 표현)
        double average = (double) sum / count;

        // 평균 출력
        System.out.println("평균: " + average);
    }
}
