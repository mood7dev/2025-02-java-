package ch07.Poly2;

// 캡슐화
//  money: 본인이 가지고 있는 소유 금액을 저장할 수 있다.
// bonusPoint: 제품 구매시 보너스점수를 저장할 수 있다.
// 소유금액은 만원단위이면 일천만원을 기본적으로 가지고 있다.
// 구매시 제품 가격만큼 소유금액은 차감된다.
// 구매시 구매한 제품 이름이 출력된다.
// e.g. "TV 을/를 구입하였습니다."
// 구매시 구매 포인트를 적립된다.
// 구매시 소유금액이 부족하면 "잔액이 부족합니다."
// 내용이 출력되면서 구매하지 않는다.
public class Buyer {
    private int  money;
    private int  bonusPoint;

    //  this.money : 고객 돈
    // p.getPrice() : 제품가격
    public Buyer() {
        this.money = 1_000;
    }

    public int getMoney(){
        return this.money;
    }

    public int getBonusPoint(){
        return this.bonusPoint;
    }

    //구매 매서드
    public void buy(Product p){
        if(this.money < p.getPrice()) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        this.money -= p.getPrice();
        this.bonusPoint += p.getBonusPoint();
        System.out.println(p.getName() + "을/를 구입하였습니다");
    }
}

