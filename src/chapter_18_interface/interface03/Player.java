package chapter_18_interface.interface03;

/**
 * ===========================================================
 * fileName       : Skinnable
 * date           : 2024-01-23
 * description    : 인터페이스 연습3
 * ===========================================================
 */
public interface Player { // 플레이어 인터페이스
    void play();    // 재생

    void stop();    // 정지   // public abstract
}

class VideoPlayer implements Player { // 비디오 플레이어
    private int id; // 제조번호 // 객체 생성시 0으로 초기화됨
    private static int count = 0; // 현재까지 할당된 제조번호

    public VideoPlayer() { // 생성자
        id = ++count;   // 생성과 동시에 1
    }

    @Override
    public void play() {
        System.out.println("■ 비디오 재생시작!");
    }

    @Override
    public void stop() {
        System.out.println("■ 비디오 재생종료!");
    }

    // 추가된 메소드
    public void printInfo() { // 제조 번호 표시
        System.out.println("이 기계의 제조번호는 [" + id + "]입니다.");

    }
}

class CDPlayer implements Player { // CD 플레이어

    @Override
    public void play() {
        System.out.println("◆ CD 재생 시작!");

    }

    @Override
    public void stop() {
        System.out.println("◆ CD 재생 종료");
    }

    // 추가된 메소드
    public void cleaning() { // 헤드 청소
        System.out.println("헤드를 청소했습니다.");

    }
}