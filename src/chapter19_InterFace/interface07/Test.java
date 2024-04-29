package chapter19_InterFace.interface07;
/**
 * ===========================================================
 * fileName       : Test
 * date           : 2024-01-24
 * description    : 인스테이스 연습7
 *
 * 인터페이스의 디폴트 메서드
 * ===========================================================
 */

interface Buy {
    void buy();

    default void order() {  // 디폴트 메서드
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();

    default void order() { // 매개변수를 넣어서 다르게 실행해보자.
        System.out.println("판매 주문");
    }
//    default void order2(int a) { // 매개변수를 넣어서 다르게 실행해보자.
//        System.out.println("판매 주문" + a + "개");
//    }
}

class Customer implements Buy, Sell { // 다중 상속을 구현한 Customer 클래스

    @Override
    public void buy() {
        System.out.println("구매하기");
    }


    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    // order 라는 메서드가 한 개만 있었으면 문제가 없었음. 하지만 동일한 이름의 `default` 메서드가 두개 있으므로 모순이 발생하였다 (다중상속의문제)
    // 디폴트 메서드가 중복되었으니 두 인터페이스를 구현하는 Customer 클래스에서 재정의 해야 함.
    @Override
    public void order() {
        System.out.println("고객 판매 주문");
    }
    /*
    두 인터페이스의 디폴트 메서드가 중복되는 경우.
    한 클래스가 다중 구현한 인터페이스에 동일한 디폴트 메서드가 있는 경우.
    오버라이딩 해야함
     */
}

public class Test {
    public static void main(String[] args) {

        Customer customer = new Customer();

        Buy buyer = customer;   // 인터페이스 타입
        buyer.buy();
        buyer.order(); // 고객 판매 주문 실행

        Sell seller = customer;
        seller.sell();
        seller.order(); // 고객 판매 주문

        System.out.println();

        Customer customer2 = null;
        if (seller instanceof Customer) {
            System.out.println("true");
            // seller 를 하위 클래스  형인 Customer 로 다시 형 변환.
            customer2 = (Customer) seller;
            customer2.buy();
            customer2.sell();
        }
        customer.order(); // 고객 판매 주문

        System.out.println(customer.toString());
        System.out.println(buyer.toString());
        System.out.println(seller.toString());
        System.out.println(customer2.toString());

        /*
        결과
        chapter19_InterFace.interface07.Customer@3b07d329
        chapter19_InterFace.interface07.Customer@3b07d329
        chapter19_InterFace.interface07.Customer@3b07d329
        chapter19_InterFace.interface07.Customer@3b07d329

        업캐스팅, 다운 캐스팅 시 참조하는 객체의 주소 값은 변함이 없음.
         */
    }
}
