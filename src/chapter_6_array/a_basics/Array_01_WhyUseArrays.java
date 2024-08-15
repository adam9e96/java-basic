package chapter_6_array.a_basics;


public class Array_01_WhyUseArrays {
    public static void main(String[] args) {
        /*
         * 학생 5명의 성적을 가지고 총점과 평균을 구함
         * case1. 배열을 사용하지 않는 경우
         */
        int score_001 = 95;
        int score_002 = 76;
        int score_003 = 67;
        int score_004 = 56;
        int score_005 = 87;

        int total = score_001 + score_002 + score_003 + score_004 + score_005; // 학생 5명 성적의 총합
        double avg = (double) total / 5; // 학생 5명 성적의 평균
        System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");

        // 문제점. 기존 방식 (배열을 사용하지 않는 방식)
        // 변수(학생)이(가) 추가될 때마다
        // 1. 변수를 추가로 선언
        // 2. total 변수에 더해야 하며
        // 3. avg 변수 계산도 수정해줘야 한다.

        // case2. 배열을 사용하는 경우
        // 학생 성적을 배열로 저장해서 관리
        // for 문을 사용하여 총점을 계산
        // 총점 계산 코드를 수정할 필요가 없음

        total = 0;

        // 배열 생성 및 초기화
        int[] scores = {95, 76, 67, 56, 87};  // 학생 성적 추가가 필요한 경우 여기만 수정하면 됨

//		System.out.println(scores.length); 배열의 크기 출력

        for (int i = 0; i < scores.length; i++) { // scores.length -> 배열의 갯수 // 현재 크기는 5
            total += scores[i];
        }
        avg = (double) total / scores.length;    // 학생 성적 평균
        System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");

        // new 키워드가 안보이는 이유
        // 원래라면 new int[5]; 을 해야하는데 개발자가 만들고 일일히 초기화 하는게 귀찮으니
        // 바로 배열생성할 때 초기화를 할거면 `new`키워드는 알아서 적용 되도록 했다.

        /*
         * for문의 실무 주 사용 용도가 반복문.
         * 그 중에서도 배열에서 대부분 사용한다.
         */

        /*
         * - 배열
         * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것이다.
         *
         * - 배열이 필요한 이유.
         * 1. 배열을 사용하면 변수의 개수를 줄일 수 있다.
         * 2. 배열을 사용하면 반복문과 함께 효율적인 연산을 수행할 수 있다.
         * 3. 배열을 사용하면 다차원의 데이터를 표현 할 수 있다.
         */

        /*
         * - 자바 배열의 특징
         * 1. 동일한 자료형만 저장
         * 2. 변수 선언시에 저장할 데이터의 개수를 지정
         * 3. 배열은 0번 부터 시작함
         * 4. 인덱스를 활용 할 수 있다.
         */
    }
}
