package BlackJack;

public class BlackJackMessage {
    private final GameMessageType type;

    public BlackJackMessage(GameMessageType type) {
        this.type = type;
    }

    public void showMessage() {
        System.out.println(" (\\_/)");
        System.out.println(" ( •u•)");
        System.out.println(" / >📢");
        System.out.println(" |　\"" + type.getMessage() + "\"　|");  // 메시지 출력
        System.out.println();
    }
}
