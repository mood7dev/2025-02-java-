package control.legacy;

import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {

    private Woofer woofer;

    // 생성자
    public JBLSpeaker() {
        this.woofer = new MartenWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("JBLSpeaker: 소리가 깔끔");
        woofer.baseSound(); // 우퍼의 베이스 사운드도 함께 출력
    }
}
