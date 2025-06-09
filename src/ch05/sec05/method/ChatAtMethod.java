package ch05.sec05.method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); //"남자"리턴
        String gender2 = checkGender("900212-2998756"); //"여자"리턴
        // 8번째 문자가  2,4 > 여자리턴 1,3 남자리언 1,2,3,4,가 아니면 null 리턴

        System.out.println("num: " + gender);
        System.out.println("num: " + gender2);
        System.out.println("num: " + checkGender("900212-5998756"));
    }

    public static String checkGender(String ssn) {

        char genderChar = ssn.charAt(7);
        return switch (genderChar) {
            case '2', '4' -> "여자입니다";
            case '1', '3' -> "남자입니다";
            default -> "null";
        };
    }
}

