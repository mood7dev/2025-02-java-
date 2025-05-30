package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter"};

        System.out.print("season: " + season[0] + "," + "");
        System.out.print(season[1] + "," + "");
        System.out.print(season[2] + "," + "");
        System.out.print(season[3]  + ""); // season: Spring,Summer,Fall,Winter

        // 인덱스 0번 항목의 값 변경
        System.out.println();
        season[0] = "봄";
        System.out.println(season[0]); // 봄

        // 배열변수 선언과 배열 생성
        int[] scores = { 83, 90,87 };

        // 총합과  평균 구하기
        int sum = 0;
        for(int score: scores) {
            sum += score;
        }
        System.out.println("총합: " + sum); // 260
        double avg = (double) sum / scores.length;
        System.out.printf("평균: %.2f\n", avg); // 86.66666666666667
    }
}
