package selfProject.interface02;/*
 * ===========================================================
 * fileName       : ServiceExample
 * date           : 2024-01-25
 * description    :
 private 메소드 -> default 메소드에서만 사용 가능함
 private 정적 메소드 -> 디폴트 메소드 + 정적 메소드 안에서도 후출이 가능함.
 * ===========================================================
 */

public class ServiceExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        Service service = new ServiceImpl();

        // 디폴트 메소드 호출
        service.defaultmethod1();
        System.out.println();
        service.defaultmethod2();
        System.out.println();

        // 정적 메소드 호출
        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
