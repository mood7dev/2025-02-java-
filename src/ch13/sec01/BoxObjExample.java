package ch13.sec01;

public class BoxObjExample {
    public static void main(String[] args) {
        BoxObj obj = new BoxObj();
        obj.setObj(10);
            int result = (int)obj.getObj(); // 강제 형 변환 int
        System.out.println("result: " + result);

        obj.setObj("문자열");
        String strValue = (String)obj.getObj(); // 강제 형 변환 String
        System.out.println("strValue: " + strValue);

        obj.setObj(true);
        boolean boolValue = (boolean)obj.getObj(); // 강제 형 변환 boolean
        System.out.println("boolValue: " + boolValue);
    }
}
