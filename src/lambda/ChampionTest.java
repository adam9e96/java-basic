package lambda;

/**
 * @FunctionalInterface 어노테이션은 컴파일 시 이 인터페이스가  함수형
 * 인터페이스 조건을 만족하는지(추상메서드가 정확히 1개인지) 확인 해줍니다.
 */
@FunctionalInterface
interface ChampionAction {
    // 챔피언이 무엇인가를 수행하도록 지시 하는 역할을 하는 메서드
    void perform(String championName);
}

public class ChampionTest {

    public static void main(String[] args) {

        ChampionAction championAction = new ChampionAction() {
            @Override
            public void perform(String championName) {
                System.out.println(championName + "이(가) 적 챔피언을 처치했습니다!");
            }
        };

        // 예: 챔피언 가렌이 수행한다.
        championAction.perform("가렌");
        // 결과: 가렌이(가) 적 챔피언을 처치했습니다!
    }

}
