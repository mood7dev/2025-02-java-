package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CardDeck {
    private Stack<Card> cardDeck;

    public CardDeck() {
        cardDeck = new Stack<>();
        init();    // 카드덱 생성
        shuffle(); // 섞기
    }

    // 덱 초기화
    private void init() {
        List<Card> cards = new ArrayList<>();
        for (Card.CardPattern pattern : Card.CardPattern.values()) {
            for (Card.Denomination denomination : Card.Denomination.values()) {
                cards.add(new Card(pattern, denomination));
            }
        }
        Collections.shuffle(cards);
        cardDeck.addAll(cards);
    }

    // 셔플
    private void shuffle() {
        Collections.shuffle(cardDeck);
    }

    // 카드 한 장 뽑기
    public Card getCard() {
        if (cardDeck.isEmpty()) {
            throw new IllegalStateException("덱에 카드가 없습니다.");
        }
        return cardDeck.pop();
    }

    // 현재 남은 카드 수
    public int getRemainingCardCount() {
        return cardDeck.size();
    }
}
