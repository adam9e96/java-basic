package chapter_18_interface.interface03;

/**
 * <h1>Player 인터페이스</h1>
 * <p>
 * 이 인터페이스는 다양한 플레이어의 공통 기능인 재생 및 정지 기능을 정의한다.
 * 모든 플레이어 클래스는 이 인터페이스를 구현해야 한다.
 * </p>
 */
public interface Player {

    /**
     * 미디어를 재생한다.
     */
    void play();    // 재생

    /**
     * 미디어 재생을 정지한다.
     */
    void stop();    // 정지
}

/**
 * <h1>VideoPlayer 클래스</h1>
 * <p>
 * 비디오를 재생하고 정지할 수 있는 비디오 플레이어 클래스 <br>
 * 각 비디오 플레이어는 고유의 제조번호를 가진다.
 * </p>
 *
 * <h2>생성자</h2>
 * <ul>
 *     <li>{@link #VideoPlayer()} - 비디오 플레이어를 생성하고 고유의 제조번호를 부여한다.</li>
 * </ul>
 *
 * <h2>메서드</h2>
 * <ul>
 *     <li>{@link #play()} - 비디오를 재생한다.</li>
 *     <li>{@link #stop()} - 비디오 재생을 종료한다.</li>
 *     <li>{@link #printInfo()} - 이 비디오 플레이어의 제조번호를 출력한다.</li>
 * </ul>
 */
class VideoPlayer implements Player {

    private final int id; // 제조번호
    private static int count = 0; // 현재까지 할당된 제조번호

    /**
     * 비디오 플레이어를 생성함과 동시에 고유한 제조번호를 부여한다.
     */
    public VideoPlayer() {
        id = ++count;   // 제조번호 증가
    }

    /**
     * 비디오 재생을 시작한다.
     */
    @Override
    public void play() {
        System.out.println("■ 비디오 재생 시작!");
    }

    /**
     * 비디오 재생을 종료한다.
     */
    @Override
    public void stop() {
        System.out.println("■ 비디오 재생 종료!");
    }

    /**
     * 비디오 플레이어의 제조번호를 출력한다.
     */
    public void printInfo() {
        System.out.println("이 기계의 제조번호는 [" + id + "]입니다.");
    }
}

/**
 * <h1>CDPlayer 클래스</h1>
 * <p>
 * CD를 재생하고 정지할 수 있는 CD 플레이어 클래스
 * </p>
 *
 * <h2>메서드</h2>
 * <ul>
 *     <li>{@link #play()} - CD 재생을 시작</li>
 *     <li>{@link #stop()} - CD 재생을 종료</li>
 *     <li>{@link #cleaning()} - CD 플레이어의 헤드를 청소</li>
 * </ul>
 */
class CDPlayer implements Player {

    /**
     * CD 재생을 시작한다.
     */
    @Override
    public void play() {
        System.out.println("◆ CD 재생 시작!");
    }

    /**
     * CD 재생을 종료한다.
     */
    @Override
    public void stop() {
        System.out.println("◆ CD 재생 종료!");
    }

    /**
     * CD 플레이어의 헤드를 청소한다.
     */
    public void cleaning() {
        System.out.println("헤드를 청소했습니다.");
    }
}
