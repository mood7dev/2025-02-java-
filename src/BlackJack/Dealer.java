package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Player {
    private final String name = "딜러";
    private final List<Card> haveCards;

    public Dealer() {
        this.haveCards = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Card> getHaveCards() {
        return haveCards;
    }

    // 카드 한 장 뽑기
    public void draw(CardDeck cardDeck) {
        Card card = cardDeck.getCard();
        haveCards.add(card);
    }

    @Override
    public int getScore() {
        int total = 0;
        int aceCount = 0;

        for (Card card : haveCards) {
            int[] values = card.getDenomination().getValues();
            total += values[values.length - 1]; // ACE: 11, others: 정수값
            if (values.length == 2) {
                aceCount++; // ACE 카드 개수 세기
            }
        }

        // 총점이 21을 초과하고 ACE가 있을 경우, ACE를 1로 취급하여 점수 조정
        while (total > 21 && aceCount > 0) {
            total -= 10; // 11 → 1 로 전환
            aceCount--;
        }

        return total;
    }
}
