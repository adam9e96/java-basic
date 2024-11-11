package chapter_18_interface.interface03;

/**
 * <h1>PlayerDemo 클래스</h1>
 * <p>
 * 이 클래스는 인터페이스와 다형성을 활용하여 여러 플레이어 객체를 생성하고 조작하는 예시를 보여준다.
 * 비디오 플레이어와 CD 플레이어 객체를 생성하여 재생 및 정지 동작을 수행한다.
 * 또한 비디오 플레이어의 제조번호를 확인할 수 있는 기능을 포함한다.
 * </p>
 *
 * <h2>기능</h2>
 * <ul>
 *     <li>Player 인터페이스를 사용한 다형성 적용</li>
 *     <li>비디오 플레이어 및 CD 플레이어 생성</li>
 *     <li>각 플레이어의 재생 및 정지 동작 호출</li>
 *     <li>비디오 플레이어 객체의 제조번호 출력</li>
 * </ul>
 */
public class PlayerDemo {
    public static void main(String[] args) {
        // Player 배열 생성 및 초기화
        Player[] players = new Player[2];
        players[0] = new VideoPlayer(); // 비디오 플레이어 (id 값: 1)
        players[1] = new CDPlayer();    // CD 플레이어

        // Player 배열을 생성과 동시에 초기화
        Player[] players1 = new Player[]{new VideoPlayer(), new CDPlayer()}; // id 값 2

        // Player 배열을 순회하며 재생 및 정지
        for (Player player : players) {
            player.play(); // 재생
            player.stop(); // 정지
            System.out.println();
        }

        System.out.println("=============");

        for (Player player : players1) {
            player.play(); // 재생
            player.stop(); // 정지
            System.out.println();
        }

        System.out.println("=============");

        // VideoPlayer 객체 4개 생성
        VideoPlayer[] videoPlayers = new VideoPlayer[4]; // id 3, 4, 5, 6

        System.out.println("videoPlayers.length : " + videoPlayers.length);

        // VideoPlayer 배열 초기화
        for (int i = 0; i < videoPlayers.length; i++) {
            videoPlayers[i] = new VideoPlayer();
        }

        // 마지막 VideoPlayer 객체의 제조번호 출력
        videoPlayers[videoPlayers.length - 1].printInfo();

        // 문제 설명: 이 기계의 제조번호는 [7]입니다.
        // VideoPlayer 객체가 이미 위에서 2번 생성된 것이 카운트되어 제조번호가 7로 출력됨

    }
}
