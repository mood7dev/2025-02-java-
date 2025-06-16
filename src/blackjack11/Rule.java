package blackjack11;

import java.util.List;
import blackjack11.Dealer;
import blackjack11.Gamer;
import blackjack11.Card;

public class Rule {

    public static int getScore(List<Card> openCards) {
        int total = 0;
        for (Card card : openCards) {
            total += card.getValue();
        }
        return total;
    }

    // 오타 수정 + 실제 점수 반환 로직만 남김
    public static int convertDenominationToScore(String denomination) {
        return switch (denomination) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }

    public static void getWinner(Dealer dealer, Gamer gamer) {
        int gamerScore = Rule.getScore(gamer.openCards());
        int dealerScore = Rule.getScore(dealer.openCards());
        if (gamerScore > 21 && dealerScore > 21) {
            System.out.println("🤝 비김: 둘 다 21점 초과");
        } else if (gamerScore <= 21 && dealerScore <= 21 && gamerScore == dealerScore) {
            System.out.println("🤝 비김: 점수 동일");
        } else if (gamerScore > 21 && dealerScore <= 21) {
            System.out.println("🎉 게이머 승!");
        } else if (gamerScore <= 21 && dealerScore <= 21 && gamerScore > dealerScore) {
            System.out.println("🎉 게이머 승!");
        } else if (gamerScore > 21 && dealerScore <= 21) {
            System.out.println("🃏 딜러 승!");
        } else if (gamerScore <= 21 && dealerScore <= 21 && gamerScore > dealerScore) {
            System.out.println("🃏 딜러 승!");
        } else {
            System.out.println("❓ 판단할 수 없는 상태입니다.");
        }
    }
}

