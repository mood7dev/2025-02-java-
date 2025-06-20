package control.ioc;

import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;


    public JBLSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("JBLSpeaker: 소리가 깔끔");
        woofer.baseSound(); // 우퍼의 베이스 사운드도 함께 출력
    }
}
