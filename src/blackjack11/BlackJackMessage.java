package blackjack11;

public class BlackJackMessage {
    private GameMessageType type;

    public BlackJackMessage(GameMessageType type) {
        this.type = type;
    }

    public void showMessage() {
        System.out.println(" (\\_/)");
        System.out.println(" ( •u•)");
        System.out.println(" / >📢");
        System.out.println(" |　　\"" + type.getMessage() + "\"　　|");
        System.out.println();
    }
}
