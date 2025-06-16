package blackjack11;

import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT = 2;

    public static void main(String[] args) {
    CardDeck cd = new CardDeck();
    Dealer dealer = new Dealer();
    Gamer gamer = new Gamer();
    
    initPhase(cd, dealer, gamer); //초기세팅
    playPhase(cd, dealer, gamer);
    }

    private static void initPhase(CardDeck cd, Dealer dealer, Gamer gamer) {
        for(int i = 0; i<INIT_RECEIVE_CARD_COUNT; i++) {
            gamer.receiveCard(cd.drawCard());
            dealer.receiveCard(cd.drawCard());
        }
        if(dealer.needMoreCard()) {
            dealer.receiveCard(cd.drawCard());
        }
    }
    private static void playPhase(CardDeck cd, Dealer dealer, Gamer gamer) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            gamer.showCards();
            System.out.println("카드를 더 뽑겠습니까? (종료: 0)");
            String answer = scanner.next();
            if("0".equals(answer)) {
                break;
            }
            gamer.receiveCard(cd.drawCard());
        }
        Rule.getWinner(dealer,gamer);
        scanner.close();
    }
}