package blackjack11;

public class CardDeck {
    private Card[] cards = new Card[52];
    private String[] patterns = {"SPADE♠", "HEART♥", "DIAMOND♦", "CLUB♣"};
    private int selectedIdx = 0;

    public CardDeck() {
        init();
        shuffle();
    }

    // 카드 생성 52개
    public void init() {
        int index = 0;
        for (int i = 0; i < patterns.length; i++) {
            for (int k = 1; k <= 13; k++) {
                String denomination = switch (k) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(k);
                };
                cards[index++] = new Card(patterns[i], denomination);
            }
        }
    }

    // 셔플 : 카드섞기
    private void shuffle() {
        for (int i = cards.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    // 카드 한장 뽑기
    public Card drawCard() {
        if (selectedIdx < cards.length) {
            return cards[selectedIdx++];
        } else {
            return null; // 카드가 더 이상 없으면 null 반환
        }
    }

    // 모든 카드 출력용 메서드
    public void printAllCards() {
        for (Card c : cards) {
            System.out.println(c);  // c.toString() 자동 호출됨
        }
    }
}
