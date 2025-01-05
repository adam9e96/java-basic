package lambda;

import java.util.Arrays;
import java.util.List;

public class lambda01 {
    public static void main(String[] args) {

        List<String> champs = Arrays.asList("가렌", "럭스", "쓰레쉬", "블리츠크랭크", "애쉬");

        champs.stream()
                // 이름이 '블'로 시작하는 챔피언만 걸러내기
                .filter(name -> name.startsWith("블"))
                // 이름 길이를 반환 (map: 변환)
                .map(name -> name.length())
                // 각 길이를 화면에 출력
                .forEach(length -> System.out.println("길이: " + length));
    }
}
