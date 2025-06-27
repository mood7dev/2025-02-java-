package ch13.sec01;
//제네릭은 타입이 컴파일 때 결정된다.
public class BoxGeneric<T> {
    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}

