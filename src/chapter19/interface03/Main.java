package chapter19.interface03;
/**
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-23
 * description    : 인터페이스 연습3
 * ===========================================================
 */
public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[2]; // 인터페이스를 데이터 타입으로 하는 배열 생성 <--- 다형성을 이용한 방법은 가능
        players[0] = new VideoPlayer(); // 비디오 플레이어 // 여기서 id값 : 0->1
        players[1] = new CDPlayer();    // CD 플레이어

        Player[] players1 = new Player[]{new VideoPlayer(), new CDPlayer()}; // 생성과 동시에 초기화도 가능
            // id 값 1 -> 2
        for (Player player : players) {
            player.play(); // 재생
            player.stop(); // 정지
            System.out.println();
        }

        VideoPlayer[] videoPlayers = new VideoPlayer[4]; // id 2 -> 3,4,5, 6이됨
        for (int i = 0; i < videoPlayers.length; i++) {
            videoPlayers[i] = new VideoPlayer();
        }
        videoPlayers[videoPlayers.length - 1].printInfo(); // 이 기계의 제조번호는 [?] 입니다.
        // new VideoPlayer가 이미 한번 선언되어서 그거 포함된 값임
        System.out.println();
    }
}
