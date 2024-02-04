package chapter19.interface03;
/**
 * ===========================================================
 * fileName       : Skinnable
 * date           : 2024-01-24
 * description    : 인스테이스 연습3-2
 * ===========================================================
 */
public interface Skinnable {
    int BLACK = 0;  // 검정   // public static final
    int RED = 1;    // 빨강
    int GREEN = 2;  // 녹색
    int BLUE = 3;   // 파랑
    int LEOPARD = 4;    // 표범 무늬

    void changeSkin(int skin);  // 스킨  변경 // public abstract
}

class PortablePlayer implements Skinnable, Player { // 인터페이스 다중상속
    private int skin = BLACK;   // 피부 기본 값 : BLACK = 0

    @Override
    public void play() {    // Player 추상 메서드 재정의1
        System.out.println("◆재생시작!");
    }

    @Override
    public void stop() {    // // Player 추상 메서드 재정의1
        System.out.println("◆재생종료!");
    }

    @Override
    public void changeSkin(int skin) {  // Skinnalbe 인터페이스 추상 메서드 재정의
        System.out.println("스킨을 ");
        switch (skin) {
            case BLACK:
                System.out.println("검정");
                break;
            case RED:
                System.out.println("빨강");
                break;
            case GREEN:
                System.out.println("녹색");
                break;
            case BLUE:
                System.out.println("파랑");
                break;
            case LEOPARD:
                System.out.println("표범무늬");
                break;
            default:
                System.out.println("기본값");
                break;
        }
        System.out.println("(으)로 변경했습니다.");
    }
}