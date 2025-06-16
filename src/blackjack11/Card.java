package blackjack11;

public class Card {
    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", this.getPattern(), this.getDenomination());
    }

    // 카드의 점수를 반환하는 메서드
    public int getValue() {
        return Rule.convertDenominationToScore(this.denomination);
    }
}
