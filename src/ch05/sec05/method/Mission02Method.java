package ch05.sec05.method;

public class Mission02Method {
    public static void main(String[] args) {
        String ext = getExt("sadf.sdkf.jpg"); // "jpg"리턴
        String ext2 = getExt("sadf.sdkf.jpeg");// jpeg"리턴

        System.out.println("ext: " + ext);
        System.out.println("ext: " + ext2);
    }
    public static String getExt(String img) {
        int Idx = img.lastIndexOf(".");
        String ext = img.substring(Idx+1);
        return ext; // String 반환
    }
}


