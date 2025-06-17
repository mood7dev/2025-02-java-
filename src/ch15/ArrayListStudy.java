package ch15;

import java.util.*;

public class ArrayListStudy {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        //<String> 제네릭 : 제한을 건다
        // 제한의 의미는 오로지 String객체 주소값만 담을 수 있는 컬렉션
        Card card = new Card("","");

        //list.add(card); 안 담긴다.
        System.out.println("List.size(): " + list.size());
        list.add("가");
        list.add("나");
        list.add(1, "다");
        System.out.println("List.size(): " + list.size());
        System.out.println("List.get(0): " + list.get(0));
        System.out.println("List.get(1): " + list.get(1));
        list.remove(1);
        System.out.println("list.get(1): " + list.get(1));
    }
}
