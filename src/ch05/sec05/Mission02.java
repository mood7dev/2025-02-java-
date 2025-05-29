package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
                String fileName = "가나다라.haha.jpg";

                int lastDotIdx = fileName.lastIndexOf(".");
                String ext = fileName.substring(lastDotIdx + 1);
                System.out.println("ext: " + ext);

            }
        }
