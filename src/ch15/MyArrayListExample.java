package ch15;

public class MyArrayListExample {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        int length = list.size();
        String[] values = {"가","크","나","다","라"};
        for(String value : values) {
        list.add(value);
        list.checkValues();
}
        String str = list.get(0);
        String str1 = list.get(2);
        String str2 = list.get(3);

        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.printf("값: "+"[%s, %s]%n",str1, str2);
        System.out.printf("값: "+"[%s,%s,%s,%s]%n",values);
        System.out.printf("값: "+"[%s,%s,%s,%s,%s]%n",values);
        System.out.printf("값: "+"[%s,%s,%s]%n",str,str1,str2);

    }
}