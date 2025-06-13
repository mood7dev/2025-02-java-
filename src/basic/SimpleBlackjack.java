import javax.swing.*;
import java.awt.*;
import java.util.*;  // java.util.List, ArrayList 등 임포트

public class SimpleBlackjack extends JFrame {

    private JPanel playerPanel, dealerPanel, controlPanel;
    private JLabel playerScoreLabel, dealerScoreLabel, statusLabel;
    private JButton hitButton, standButton;

    private java.util.List<String> playerCards = new ArrayList<>();
    private java.util.List<String> dealerCards = new ArrayList<>();
    private java.util.List<String> deck = new ArrayList<>();

    public SimpleBlackjack() {
        setTitle("간단 블랙잭");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 카드 덱 초기화 (4가지 모양, 13장)
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String s : suits) {
            for (String r : ranks) {
                deck.add(s + r);
            }
        }
        Collections.shuffle(deck);

        // 패널 세팅
        dealerPanel = new JPanel();
        dealerPanel.setBorder(BorderFactory.createTitledBorder("딜러"));
        dealerPanel.setPreferredSize(new Dimension(600, 100));

        playerPanel = new JPanel();
        playerPanel.setBorder(BorderFactory.createTitledBorder("플레이어"));
        playerPanel.setPreferredSize(new Dimension(600, 100));

        controlPanel = new JPanel();
        hitButton = new JButton("Hit");
        standButton = new JButton("Stand");
        playerScoreLabel = new JLabel("플레이어 점수: 0");
        dealerScoreLabel = new JLabel("딜러 점수: ?");
        statusLabel = new JLabel("게임 중...");

        controlPanel.add(hitButton);
        controlPanel.add(standButton);
        controlPanel.add(playerScoreLabel);
        controlPanel.add(dealerScoreLabel);
        controlPanel.add(statusLabel);

        add(dealerPanel, BorderLayout.NORTH);
        add(playerPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        // 처음 카드 2장씩 나누기
        playerCards.add(drawCard());
        playerCards.add(drawCard());
        dealerCards.add(drawCard());
        dealerCards.add(drawCard());

        updatePanels();

        // 버튼 액션
        hitButton.addActionListener(e -> {
            playerCards.add(drawCard());
            updatePanels();
            int score = calculateScore(playerCards);
            if (score > 21) {
                statusLabel.setText("플레이어 버스트! 패배");
                hitButton.setEnabled(false);
                standButton.setEnabled(false);
                revealDealerCards();
            }
        });

        standButton.addActionListener(e -> {
            hitButton.setEnabled(false);
            standButton.setEnabled(false);
            dealerTurn();
        });
    }

    private String drawCard() {
        if (deck.isEmpty()) {
            return "??"; // 카드 없을 경우
        }
        return deck.remove(0);
    }

    private void updatePanels() {
        playerPanel.removeAll();
        for (String card : playerCards) {
            playerPanel.add(new JLabel(card));
        }
        playerScoreLabel.setText("플레이어 점수: " + calculateScore(playerCards));

        dealerPanel.removeAll();
        for (int i = 0; i < dealerCards.size(); i++) {
            if (i == 0 || !hitButton.isEnabled()) {
                dealerPanel.add(new JLabel(dealerCards.get(i)));
            } else {
                dealerPanel.add(new JLabel("??"));
            }
        }

        if (!hitButton.isEnabled()) {
            dealerScoreLabel.setText("딜러 점수: " + calculateScore(dealerCards));
        } else {
            dealerScoreLabel.setText("딜러 점수: ?");
        }

        playerPanel.revalidate();
        playerPanel.repaint();
        dealerPanel.revalidate();
        dealerPanel.repaint();
    }

    private int calculateScore(java.util.List<String> cards) {
        int score = 0;
        int aceCount = 0;
        for (String card : cards) {
            String rank = card.substring(1);
            if ("JQK".contains(rank)) {
                score += 10;
            } else if ("A".equals(rank)) {
                aceCount++;
                score += 11;  // 에이스는 일단 11점으로 계산
            } else {
                score += Integer.parseInt(rank);
            }
        }
        while (score > 21 && aceCount > 0) {
            score -= 10;  // 에이스를 1점으로 변경
            aceCount--;
        }
        return score;
    }

    private void dealerTurn() {
        revealDealerCards();

        while (calculateScore(dealerCards) < 17) {
            dealerCards.add(drawCard());
            updatePanels();
            try {
                Thread.sleep(700);
            } catch (InterruptedException ignored) {}
        }

        int dealerScore = calculateScore(dealerCards);
        int playerScore = calculateScore(playerCards);

        if (dealerScore > 21 || playerScore > dealerScore) {
            statusLabel.setText("플레이어 승리!");
        } else if (dealerScore == playerScore) {
            statusLabel.setText("무승부");
        } else {
            statusLabel.setText("딜러 승리!");
        }
    }

    private void revealDealerCards() {
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        updatePanels();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleBlackjack game = new SimpleBlackjack();
            game.setVisible(true);
        });
    }
}
