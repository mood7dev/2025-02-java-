package ch04.sec04;

public class Mission07 {
    public static void main(String[] args) {
        int[] scores = {90, 88, 100, 70, 60};
        int sum = 0;
        double avg = 0;
        for( int i = 0; i < scores.length; i++ ) {
            sum += scores[i];

        }
        avg = sum / scores.length;
        System.out.println(avg);
    }
}

/*
어떤 학생이 받은 점수이다 평균점수를 구하라.
 */