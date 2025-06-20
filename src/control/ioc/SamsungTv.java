package control.ioc;

import control.Speaker;
import control.Tv;

public class SamsungTv implements Tv {

    private Speaker speaker;

    public SamsungTv(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("SamsungTv의 소리는요");
        speaker.speakerSound();
    }
}
