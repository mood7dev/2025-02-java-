package blackjack11;

import java.util.List;

public class BlackJackInter {
    private static List<Card> cards;

    public static void main(String[] args) {
        // 메시지 출력
        BlackJackMessage message = new BlackJackMessage(GameMessageType.START);
        message.showMessage();

        // 카드 덱 생성 및 출력
        CardDeck deck = new CardDeck();
        deck.printAllCards();

        // 카드 한 장 뽑기
        Card c = deck.drawCard();

        // 게이머에게 카드 지급
        Gamer gamer = new Gamer();
        gamer.receiveCard(c);

        // 출력
        System.out.println("-----------------");
        deck.printAllCards();

        System.out.println("-----게이머 카드-----");
        System.out.println(c); // 뽑은 카드 출력
        gamer.showCards();

        System.out.println("-----딜러 카드-----");
        // 딜러 카드 받기
        Dealer dealer = new Dealer();
        dealer.receiveCard(deck.drawCard());
        dealer.receiveCard(deck.drawCard());
        dealer.showCards();
        System.out.printf("needMoreCard: %b\n", dealer.needMoreCard());

        if (dealer.needMoreCard()) {
            dealer.receiveCard(deck.drawCard());
        }
        dealer.showCards();

        // 점수 계산
        List<Card> openedCards = gamer.openCards();
        int score = Rule.getScore(openedCards); // 점수 계산 메서드가 int를 반환한다고 가정
        System.out.println("게이머 점수: " + score);
    }
}

