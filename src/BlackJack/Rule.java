package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Rule implements Player {
    private final String name;
    private final List<Card> hand = new ArrayList<>();
    private boolean hasDoubleDown = false;

    public Rule(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Card> getHaveCards() {
        return hand;
    }

    @Override
    public void draw(CardDeck deck) {
        hand.add(deck.getCard());
    }

    public boolean doubleDown(CardDeck deck) {
        if (hasDoubleDown || hand.size() != 2) {
            return false; // 더블다운 불가 조건
        }
        draw(deck);
        hasDoubleDown = true;
        return true;
    }

    // 스플릿 가능 여부 판단
    public boolean canSplit() {
        if (hand.size() != 2) return false;
        int val1 = hand.get(0).getDenomination().getValues()[0];
        int val2 = hand.get(1).getDenomination().getValues()[0];
        return val1 == val2;
    }

    // 스플릿 실행 (새로운 Rule 객체에 한 장을 넘겨줌)
    public Rule split() {
        if (!canSplit()) return null;
        Card cardToSplit = hand.remove(1);
        Rule newHand = new Rule(name + " (Split)");
        newHand.hand.add(cardToSplit);
        return newHand;
    }

    @Override
    public int getScore() {
        int total = 0;
        int aceCount = 0;
        for (Card card : hand) {
            int[] values = card.getDenomination().getValues();
            total += values[values.length - 1]; // ACE는 11로 계산
            if (values.length == 2) aceCount++;
        }
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }
        return total;
    }

    public boolean isBust() {
        return getScore() > 21;
    }

    public void reset() {
        hand.clear();
        hasDoubleDown = false;
    }
}
