package BlackJack;

public enum GameMessageType {
    START("운명의 한 판, 시작합니다! 🎲😤"),
    READY("블랙잭, 준비되셨나요? 🃏😎"),
    HIT_OR_STAND("Hit or Stand? ✋🤚🤔"),
    YOUR_MOVE("Your move! ▶️😏"),
    DRAW_MORE("카드 한 장 더 뽑으시겠습니까? ➕🃏😬"),
    FIGHT("승부를 가려봅시다! ⚔️🔥"),
    GOOD_LUCK("Good Luck! 🍀😊"),
    BLACKJACK_GO("블랙잭 GO! 🚀🤩"),
    CARD_PLUS("카드 추가? 🃏➕🤨"),
    YOUR_TURN("Your Turn! 👑🙂");

    private final String message;

    GameMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}