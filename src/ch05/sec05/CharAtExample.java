package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char gender = ssn.charAt(7);
        System.out.println("num: " + gender);

        switch(gender) {
            case '1' , '3' -> System.out.println("남자입니다.");
            case'2' , '4'-> System.out.println("여자입니다.");
        }
        int intGender = Character.getNumericValue('b');
        System.out.println(intGender);
    }
}
