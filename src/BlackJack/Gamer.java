package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Gamer implements Player {
    private final String name;
    private final List<Card> cards;

    public Gamer(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Card> getHaveCards() {
        return cards;
    }

    @Override
    public void draw(CardDeck cardDeck) {
        cards.add(cardDeck.getCard());
    }

    @Override
    public int getScore() {
        int total = 0;
        int aceCount = 0;

        for (Card card : cards) {
            int[] values = card.getDenomination().getValues();
            total += values[values.length - 1]; // ACE: 11, others: 정수값
            if (values.length == 2) aceCount++; // ACE인지 확인
        }

        while (total > 21 && aceCount > 0) {
            total -= 10; // ACE: 11 → 1 로 조정
            aceCount--;
        }

        return total;
    }
    public void reset() {
        cards.clear();
    }
}
