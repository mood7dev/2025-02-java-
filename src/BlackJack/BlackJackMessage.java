package BlackJack;

public class BlackJackMessage {
    private final GameMessageType type;

    public BlackJackMessage(GameMessageType type) {
        this.type = type;
    }

    public void showMessage() {
        System.out.println(" (\\_/)");                     // 토끼 귀
        System.out.println(" ( •u•)");                    // 토끼 얼굴
        System.out.println(" / >📢");                     // 확성기
        System.out.println(" |　\"" + type.getMessage() + "\"　|");  // 메시지 출력
        System.out.println();
    }
}
