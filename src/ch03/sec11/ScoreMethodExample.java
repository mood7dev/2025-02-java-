package ch03.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10, 100);
        int randomScore2 = getRandomValue(1, 5);

        char grade = getGrade(randomScore);

        System.out.printf("점수: %d 등급: %c%n", randomScore, grade);
    }

    public static int getRandomValue(int from, int to) {
        return (int) (Math.random() * (to - from + 1)) + from;
    }

    public static char getGrade(int score) {
        if (score > 100 || score < 0) {
            return 'X';
        } else if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else {
            return 'D';
        }
    }
}