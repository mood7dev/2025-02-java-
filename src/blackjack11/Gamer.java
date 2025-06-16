package blackjack11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gamer {
    private List<Card> cards = new ArrayList<>();

    // 카드 받기
    public void receiveCard(Card card) {
        cards.add(card);
    }

    // 카드 출력
    public void showCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    // 카드 리스트 반환
    public List<Card> openCards() {
        return Collections.unmodifiableList(cards); // 외부 수정 방지용
    }
}

