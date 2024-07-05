package chapter12.korean;

public class KoreanDemo {
    public static void main(String[] args) {

        // Korean 객체 생성 및 초기화
        Korean korean1 = new Korean("김철수", "990125-4548722");
        Korean korean2 = new Korean("짱구", "080125-1457255");

        // Korean 객체 데이터 읽기
        System.out.println(korean1.name);
        System.out.println(korean1.ssn);
        System.out.println(korean1.nation);

        System.out.println(korean2.name);
        System.out.println(korean2.ssn);
        System.out.println(korean2.nation);

    }
}
