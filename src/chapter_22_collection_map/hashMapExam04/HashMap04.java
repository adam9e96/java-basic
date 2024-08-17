package chapter_22_collection_map.hashMapExam04;/*
 * ===========================================================
 * fileName       : HashMap04
 * date           : 2024-01-29
 * description    :
 * ===========================================================
 */

import java.util.HashSet;
import java.util.Random;

/*
    로또 번호를 생성하는 프로그램을 작성해 보자.
    로또는 1부터 45까지의 숫자 중에서 6개를 선택한다. 로또 번호는 중복되지 않는다.
    따라서 집합을 나타내는 hashSet 을 사용하여서 중복을 검사해 보자.
    Math.random()을 사용하면 0부터 1사이으이 난수를 생성할 수 있음.
    0부터 1사이의 난수가 생성되면 여기에 44를 곱하고 1을 더하면 1부터 45 사이의 정수를 생성할 수 있음.
    생성된 정수는 HashSet 의 contains() 메서들를 이용하여서 이미 선택된 정수인지를 검사한다.

    실행 예 :
    10은(는) 중복된 번호입니다.
    10은(는) 중복된 번호입니다.

    Lotto : [37, 8, 26, 12, 28, 31]
 */
public class HashMap04 {
    public static void main(String[] args) {

        // 로또 번호를 저장할 HashSet
        HashSet<Integer> lottos = new HashSet<>();
        Random random = new Random();

        // 중복관련 경고문을 출력하지 않을거면 contains() 사용안해도됨
//        while (lottos.size() <6){
//            int lotto = random.nextInt(44)+1;
//            lottos.add(lotto);
//        }
//        System.out.println("Lotto : "+lottos);
//
//        while (lottos.size() <= 6){
//            int lotto = random.nextInt(44)+1;
//           if (lottos.contains(lotto)){
//               System.out.println(lotto + " 는 중복된 번호다");
//               continue;
//           }
//            lottos.add(lotto);
//        }
//        System.out.println("Lotto : "+lottos);
//


        // 자작 코드
        while (lottos.size() < 6) {
            int lotto = random.nextInt(44) + 1;

            if (lottos.isEmpty()) {  // 제일 처음에 비어있으면
                lottos.add(lotto);
            } else if (!(lottos.contains(lotto))) {    // 이미 있는지 중복 검사
                System.out.println(lotto + " 는 중복된 번호다");
                continue;
            } else {
                lottos.add(lotto);
            }
        }
        System.out.println("Lotto : " + lottos);

    }
}
// todo
//  - 역순으로 나오도록 해보자 -> 정렬 할려면 treeSet을 써야됨
