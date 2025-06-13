package BlackJack;

public class Display {
    public static void main(String[] args) {
        // 게임 시작 메시지 출력
        new BlackJackMessage(GameMessageType.START).showMessage();

        // 카드 덱 생성 및 출력
        CardDeck deck = new CardDeck();
        System.out.println("🔄 섞인 카드 덱 출력:");
        deck.printAllCards();

        System.out.println("\n🎮 게임 참가자 생성 중...");
        Gamer gamer = new Gamer("플레이어 1");
        Dealer dealer = new Dealer();

        // 카드 배분
        System.out.println("\n🃏 카드 배분 중...");
        for (int i = 0; i < 2; i++) {
            gamer.draw(deck);
            dealer.draw(deck);
        }

        // 플레이어 카드와 점수 출력
        System.out.println("\n" + gamer.getName() + "의 보유 카드:");
        gamer.getHaveCards().forEach(System.out::println);
        System.out.println("총 점수: " + gamer.getScore());

        // 딜러 카드와 점수 출력
        System.out.println("\n" + dealer.getName() + "의 보유 카드:");
        dealer.getHaveCards().forEach(System.out::println);
        System.out.println("총 점수: " + dealer.getScore());

        // 게임 종료 메시지
        new BlackJackMessage(GameMessageType.GOOD_LUCK).showMessage();
    }
}
