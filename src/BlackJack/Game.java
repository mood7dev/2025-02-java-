package BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private CardDeck deck;
    private Rule player;
    private Rule dealer;
    private Scanner scanner;

    public Game() {
        deck = new CardDeck();
        player = new Rule("플레이어");
        dealer = new Rule("딜러");
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("=== 블랙잭 게임 시작 ===");
        deck = new CardDeck();
        player.reset();
        dealer.reset();


        /*
        System.out.println("🔄 섞인 카드 덱 출력:");
        deck.printAllCards();
        */

        System.out.println("\n🎮 게임 참가자 생성 완료.");

        // 초반 카드 2장씩 분배
        for (int i = 0; i < 2; i++) {
            player.draw(deck);
            dealer.draw(deck);
        }
        new BlackJackMessage(GameMessageType.YOUR_TURN).showMessage();

        // 플레이어 턴 진행
        playerTurn();
        new BlackJackMessage(GameMessageType.Deal_TURN).showMessage();

        // 플레이어 버스트면 딜러 턴 안함
        if (!player.isBust()) {
            dealerTurn();
        }
        showResult();
    }

    private void playerTurn() {
        List<Rule> hands = new ArrayList<>();
        hands.add(player);

        // 스플릿은 일단 단일 핸드만 지원 (간단히)
        for (int i = 0; i < hands.size(); i++) {
            Rule hand = hands.get(i);
            System.out.println("\n" + hand.getName() + "의 턴 시작");

            new BlackJackMessage(GameMessageType.YOUR_MOVE).showMessage();

            while (true) {
                printHand(hand);

                if (hand.isBust()) {
                    System.out.println("버스트! 점수 초과");
                    break;
                }
                new BlackJackMessage(GameMessageType.HIT_OR_STAND).showMessage();
                System.out.print("Hit(h), Stand(s), Double Down(d), Split(p): ");
                String choice = scanner.nextLine().trim().toLowerCase();

                if (choice.equals("h")) {
                    hand.draw(deck);
                } else if (choice.equals("s")) {
                    break;
                } else if (choice.equals("d")) {
                    if (!hand.doubleDown(deck)) {
                        System.out.println("더블다운을 할 수 없습니다.");
                    } else {
                        printHand(hand);
                        break;  // 더블다운 후 턴 종료
                    }
                } else if (choice.equals("p")) {
                    if (hand.canSplit()) {
                        Rule newHand = hand.split();
                        newHand.draw(deck);
                        hands.add(newHand);
                        System.out.println("스플릿 완료! 새로운 핸드 추가.");
                        // 현재 핸드에도 카드 한 장 더 받기
                        hand.draw(deck);
                        printHand(hand);
                    } else {
                        System.out.println("스플릿 불가능한 카드입니다.");
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            }
        }
    }


    private void dealerTurn() {
        System.out.println("\n딜러의 턴 시작...");
        printHand(dealer);
        while (dealer.getScore() < 17) {
            dealer.draw(deck);
            System.out.println("딜러가 카드를 뽑았습니다.");
            printHand(dealer);
        }
        if (dealer.isBust()) {
            System.out.println("딜러 버스트!");
        }
        System.out.println("딜러 턴 종료. 최종 점수: " + dealer.getScore());
    }

    private void showResult() {
        int playerScore = player.getScore();
        int dealerScore = dealer.getScore();

        System.out.println("\n=== 게임 결과 ===");
        System.out.println(player.getName() + " 점수: " + playerScore);
        System.out.println(dealer.getName() + " 점수: " + dealerScore);

        if (playerScore > 21) {
            System.out.println("🃏 플레이어 버스트, 딜러 승리!");
        } else if (dealerScore > 21) {
            System.out.println("🎉 딜러 버스트, 플레이어 승리!");
        } else if (playerScore > dealerScore) {
            System.out.println("🎉 플레이어 승리!");
        } else if (playerScore < dealerScore) {
            new BlackJackMessage(GameMessageType.DEALER_WIN).showMessage();
        } else {
            System.out.println("🤝 무승부!");
        }
    }

    private void printHand(Rule hand) {
        System.out.println(hand.getName() + " 카드:");
        hand.getHaveCards().forEach(System.out::println);
        System.out.println("총 점수: " + hand.getScore());
    }

    public void run() {
        while (true) {
            startGame();

            System.out.print("다시 시작하시겠습니까? (s: 시작, q: 종료): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (!input.equals("s")) {
                System.out.println("게임을 종료합니다. 감사합니다!😎");
                break;
            }
            // 이미 startGame()에서 초기화하므로 여기선 안 해도 됨
        }
    }
}

