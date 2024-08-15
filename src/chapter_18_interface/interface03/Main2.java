package chapter_18_interface.interface03;
/**
 * ===========================================================
 * fileName       : Skinnable
 * date           : 2024-01-24
 * description    : 인스테이스 연습3-2
 * ===========================================================
 */
public class Main2 {
    public static void main(String[] args) {

        PortablePlayer portablePlayer = new PortablePlayer();

        portablePlayer.play();
        portablePlayer.stop();

        System.out.println(Skinnable.LEOPARD);  // 인터페이스 상수 // 4

        portablePlayer.changeSkin(Skinnable.LEOPARD); // 스킨을 표범 무늬로 변경
        portablePlayer.changeSkin(2);// 위와 아래는 같지만 숫자를 넣기보다 숫자에 맞게 색상을
        // 매핑? 해놓으면 좀 더 논리에 맞다.
        portablePlayer.changeSkin(Skinnable.BLUE);

        portablePlayer.changeSkin(Skinnable.GREEN);
    }
}
