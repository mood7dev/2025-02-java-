package BlackJack;

public class Card {
    private final CardPattern pattern;
    private final Denomination denomination;

    public Card(CardPattern pattern, Denomination denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public CardPattern getPattern() {
        return pattern;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return pattern + "이며, " + denomination + "이며, 보이는 카드 숫자는 " + denomination.getValues()[0] + "입니다.";
    }

    // 카드 숫자 (A, 2~10, J, Q, K)
    public enum Denomination {
        ACE(new int[]{1, 11}),
        TWO(new int[]{2}),
        THREE(new int[]{3}),
        FOUR(new int[]{4}),
        FIVE(new int[]{5}),
        SIX(new int[]{6}),
        SEVEN(new int[]{7}),
        EIGHT(new int[]{8}),
        NINE(new int[]{9}),
        TEN(new int[]{10}),
        JACK(new int[]{10}),
        QUEEN(new int[]{10}),
        KING(new int[]{10});

        private final int[] values;

        Denomination(int[] values) {
            this.values = values;
        }

        public int[] getValues() {
            return values;
        }
    }

    // 카드 무늬 (스페이드, 하트 등)
    public enum CardPattern {
        SPADE("♠"),
        HEART("♥"),
        DIAMOND("♦"),
        CLUB("♣");

        private final String symbol;

        CardPattern(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }
}
