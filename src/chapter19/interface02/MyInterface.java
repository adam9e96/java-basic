package chapter19.interface02;
/**
 * ===========================================================
 * fileName       : Interface2
 * date           : 2024-01-24
 * description    : 인터페이스 연습-2
 *
 * ===========================================================
 */
public interface MyInterface {
    // 아래 코드 모두 public static final 이 자동으로 붙음
    int w = 10; // public static final 생략
    static int x = 20;
    final int y = 30;
    public static final int z = 40;
    void aba();
}

class Interface2 implements MyInterface{

    @Override
    public void aba() {
        System.out.println("MyInterface 구현 받은 클래스");
    }
}
