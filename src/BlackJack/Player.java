package BlackJack;

import java.util.List;

public interface Player {
    // 플레이어 이름 반환
    String getName();

    // 플레이어가 가진 카드 리스트 반환
    List<Card> getHaveCards();

    // 카드 한 장 뽑기 (덱에서)
    void draw(CardDeck cardDeck);

    // 현재 점수 계산 반환
    int getScore();
}

