package chapter26_designPattern.singleton01;

public class Singleton {
    // 유일한 인스턴스를 정적(final)으로 선언
    private static final Singleton instance = new Singleton();

    // 생성자를 private으로 선언하여 외부에서 인스턴스 생성을 방지
    private Singleton() {}

    // 유일한 인스턴스를 반환하는 정적 메서드
    public static Singleton getInstance() {
        return instance;
    }
}
