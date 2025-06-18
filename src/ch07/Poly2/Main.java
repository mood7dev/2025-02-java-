package ch07.Poly2;

public class Main {
    public static void main(String[] args) {
        //제품 목록
        Tv tv = new Tv();
        Computer com = new Computer();

        //메시지
        tv.message();
        com.message();

        // 바이어 객체화
        Buyer buyer = new Buyer();

        buyer.buy(tv);
        buyer.buy(tv);
        buyer.buy(tv);
        buyer.buy(tv);
        buyer.buy(com);
        buyer.buy(com);
        buyer.buy(com);
        buyer.buy(com);

        System.out.println("잔액: " +buyer.getMoney());
        System.out.println("적립된 보너스 포인트: " + buyer.getBonusPoint());

    }
}
