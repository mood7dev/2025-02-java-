package control.legacy;

import control.Speaker;
import control.Tv;

public class SamsungTv implements Tv {

    private HarmanSpeaker speaker;
    //삼성tv는 스피커를 사용할 수 있다.
    //스피커는 하만스피커를 사용한다.

    //생성자
    public SamsungTv() {
        this.speaker = new HarmanSpeaker();
    }

    @Override
    public void sound() {
        System.out.println("SamsungTv의 소리는요");
        speaker.speakerSound();
    }
}
