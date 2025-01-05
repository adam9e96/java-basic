package lambda;

public class ChampionTestLambda {
    public static void main(String[] args) {
        // (매개변수) -> {구현부}
        ChampionAction championAction = (championName) -> {
            System.out.println(championName + "이(가) 적 챔피언을 처치했습니다!");
        };

        // 가렌이 수행
        championAction.perform("가렌");
        // 결과: 가렌이(가) 적 챔피언을 처치했습니다!

        // 라이즈가 수행
        championAction.perform("라이즈");
    }
}
