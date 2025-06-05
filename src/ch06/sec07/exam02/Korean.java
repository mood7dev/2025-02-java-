package ch06.sec07.exam02;

public class Korean {
    String nation;
    String name;
    String ssn;

    // ✅ 기본 생성자
    public Korean() {
        this.nation = "대한민국";
        this.name = "신사임당";
        this.ssn = "901022-2754312";
    }

    // ✅ 매개변수 있는 생성자
    public Korean(String name, String ssn) {
        this.nation = "대한민국"; // 기본값 고정
        this.name = name;
        this.ssn = ssn;
    }
}

