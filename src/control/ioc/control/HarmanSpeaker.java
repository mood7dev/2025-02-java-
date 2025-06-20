package control.ioc.control;

import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    // 생성자
    public HarmanSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    // 사운드 출력 기능 구현
    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 맑아요.");
        woofer.baseSound(); // 우퍼의 베이스 사운드도 함께 출력
    }
}