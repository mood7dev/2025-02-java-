package ch13.sec02.exam01;

class Car{}
class Tv{}

public class Product<K, M> {
    private K kind;

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }


    private M model;

}
