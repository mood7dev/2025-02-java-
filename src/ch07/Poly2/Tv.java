package ch07.Poly2;

public class Tv extends Product {
    public Tv() {
        super("TV",100);
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public void message(){
        System.out.println(getName() + "의 가격은 " + getPrice() + "만원 입니다");
    }

}

