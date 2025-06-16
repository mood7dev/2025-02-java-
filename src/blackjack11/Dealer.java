package blackjack11;

public class Dealer extends  Gamer {
    private final static int CAN_RECEIVE_POINT = 16; // 매직넘버

    public boolean needMoreCard() {
    int score = Rule.getScore(this.openCards());
    return score<= CAN_RECEIVE_POINT;
        }
    }