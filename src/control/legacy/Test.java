package control.legacy;

import control.Speaker;
import control.Tv;

public class Test {
    public static void main(String[] args) {

        Speaker speaker2 = new JBLSpeaker();
        speaker2.speakerSound();


        System.out.println("-------------");
        Tv tv = new SamsungTv();
        tv.sound();
    }
}
