package ch07.Poly2;

//abstract : 객체화 금지, new Product() 와 같이 직접 객체를 생성하지 말라는 의미
public abstract class Product {
    //캡슐화
    private final int price; //단위는 만원 단위
    private final int bonusPoint;
    private String name;

    //제품의 가격 정보를 저장할 수 있다. (price)
    //제품구매 시 제공하는 보너스 점수 저장할 수 있다.(bonusPoint)
    //캡슐화
    //getter: 외부에 값을 보내줄 수 있다.

    public Product(String name,int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = (int) (price * 0.1);
    }



    //getter
    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public String getName() {
        return this.name;
    }

    public abstract void message();
}





