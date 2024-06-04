package chapter26_designPattern.singleton01;

public class Singleton {
    // 유일한 인스턴스를 정적(final)으로 선언
    private static final Singleton instance = new Singleton();

    // 생성자를 private으로 선언하여 외부에서 인스턴스 생성을 방지
    private Singleton() {
        // 추가 초기화 작업이 필요하면 여기서 수행할 수 있습니다.
    }

    // 유일한 인스턴스를 반환하는 정적 메서드
    public static Singleton getInstance() {
        return instance;
    }

    // 메인 메서드에서 싱글톤 인스턴스의 동일성을 확인하는 예제
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // 두 인스턴스가 동일한지 확인
        System.out.println(s1 == s2);  // 출력: true
        System.out.println(s3.hashCode() == s1.hashCode());
    }
}
