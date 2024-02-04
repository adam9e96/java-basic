package chapter12;

public class Area {
    // manual 메소드만 데이터 영역에 미리 올라감
    static void manual() { // static 이 있으므로 클래스 메서드
        System.out.println("현재 사용 가능한 함수 목록");
        System.out.println("triangle : 삼각형 넓이");
        System.out.println("rectangle : 사각형 넓이");
        System.out.println("입니다.");
    }

    double triangle(int a, int b) { // 삼각형 넓이를 반환하는 메서드
        return (double) a * b / 2;
    }

    int rectangle(int a, int b) { // 사각형 넓이를 반환하는 메서드
        return a * b;
    }
}
