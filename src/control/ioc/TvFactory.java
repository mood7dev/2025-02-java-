package control.ioc;

import control.*;
import control.ioc.control.HarmanSpeaker;

public class TvFactory {
    //싱글톤
    private static TvFactory tvFactory = null;

    public static TvFactory getInstance() {
        if (tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    private TvFactory() {
    }

    public Tv factory(String speakerName, String wooferName) {
        //삼성 tv 객체화 하려면 뭐가 필요함?
        //스피커의 주소값 필요
        Woofer woofer = switch (wooferName) {
            case "marten" -> new MartenWoofer();
            case "genelex" -> new GenelecWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakerName) {
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };
        return new SamsungTv(speaker);
    }
}
