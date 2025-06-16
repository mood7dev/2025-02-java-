package BlackJack;

public enum GameMessageType {
    START("운명의 한 판, 시작합니다! 🎲😤"),
    READY("블랙잭, 준비되셨나요? 🃏😎"),
    HIT_OR_STAND("Hit or Stand? ✋🤚🤔"),
    YOUR_MOVE("Your move! ▶️😏"),
    DRAW_MORE("카드 한 장 더 뽑으시겠습니까? ➕🃏😬"),
    Deal_TURN("딜러 Turn! ⚔️🔥"),
    GOOD_LUCK("Good Luck! 🍀😊"),
    DEALER_WIN("딜러 승리! 🐰"),
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