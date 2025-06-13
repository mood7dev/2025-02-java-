package blackjack11;

public class BlackJackInter {
    public static void main(String[] args) {
        // 메시지 출력
        BlackJackMessage message = new BlackJackMessage(GameMessageType.START);
        message.showMessage();

        // 카드 덱 출력
        CardDeck deck = new CardDeck();
        deck.printAllCards();

        Card c = deck.drawCard();
    }
}
