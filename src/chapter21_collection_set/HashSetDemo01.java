package chapter21_collection_set;

import java.util.HashSet;
import java.util.Random;

/**
 * 이 프로그램은 로또 번호를 생성하는 기능을 제공합니다.
 * <p>
 * 로또 번호는 1부터 45까지의 숫자 중에서 6개를 선택하며, 중복되지 않습니다.
 * <p>
 * HashSet을 사용하여 중복된 번호를 자동으로 제거합니다.
 * <p>
 * 프로그램 동작:
 * <ul>
 *     <li>Math.random() 또는 Random 클래스를 사용하여 1부터 45 사이의 난수를 생성합니다.</li>
 *     <li>생성된 난수가 HashSet에 이미 포함되어 있는지 확인합니다.</li>
 *     <li>중복된 경우 경고 메시지를 출력하고, 중복되지 않은 경우 HashSet에 추가합니다.</li>
 *     <li>HashSet에 6개의 고유한 번호가 들어갈 때까지 반복합니다.</li>
 * </ul>
 * </p>
 */
public class HashSetDemo01 {
    public static void main(String[] args) {

        // 로또 번호를 저장할 HashSet
        HashSet<Integer> lottos = new HashSet<>();
        Random random = new Random();

        // 로또 번호를 6개 생성
        while (lottos.size() < 6) {
            int lotto = random.nextInt(45) + 1; // 1부터 45 사이의 난수 생성

            // 중복된 번호인지 확인하고 처리
            if (lottos.contains(lotto)) {
                System.out.println(lotto + "은(는) 중복된 번호입니다.");
            } else {
                lottos.add(lotto); // 중복되지 않은 경우에만 추가
            }
        }

        // 생성된 로또 번호 출력
        System.out.println("Lotto : " + lottos);
    }
}
