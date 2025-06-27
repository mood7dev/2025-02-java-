package ch13.sec01;

public class BoxGenericExample {

    public static void main(String[] args) {
        BoxGeneric<String> strBox = new BoxGeneric<>();
        strBox.setObj("안녕");

        String strValue = strBox.getObj();
        BoxGeneric<Integer> intBox = new BoxGeneric<>();

    }
}
