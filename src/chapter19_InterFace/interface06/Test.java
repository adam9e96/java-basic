package chapter19_InterFace.interface06;

/**
 * ===========================================================
 * fileName       : Test
 * date           : 2024-01-24
 * description    : 인스테이스 연습6
 * ===========================================================
 */
interface Buy {
    void buy();

    void info();    // Sell 인터페이스와 이름이 겹친다.
}

interface Sell {
    void sell();

    void info();
}

class Customer implements Buy, Sell {   // 인터페이스 다중 상속

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    // 여기서 핵심!
    // 두 인터페이스에 이름이 같은 메서드가 선언되었다고 해도 구현은 클래스에서 이루어 지므로,
    // 오버라이딩을 하게되면 어떤 메서드를 호출해야 하는지 모호 하지 않음
    // 실체가 없는 거라 겹쳐도 문제 될 게 없는 것
    @Override
    public void info() {
        System.out.println("Customer 입니다.");
    }
}

/*
    한 클래스가 여러 인터페이스를 구현하는 경우
    한 클래스가 여러 클래스를 상속 받으면 같은 이름을 가진 메서드 호출이 모호해지는 문제가 발생할 수있음.
    그래서 자바는 다중 상속을 지원하지 않음.
    하지만 자바에서 인터페이스는 한 클래스가 여러 인터페이스를 구현할 수 있음.
    인터페이스를 구현한 코드나 멤버 변수를 가지지 않기 때문에 여러 개를 동시에 구현할 수있음.
    어떤 메서드를 호출해야 하는지 모호하지 않은 것.
 */

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(); // 다중 인터페이스 상속을 받은 클래스 객체 생성


        System.out.println(customer.hashCode()); // 990368553

        // Customer 타입인 customer 를 Buy 인터페이스형인 buyer 에 대입하여 형 변환.
        // buyer는 Buy 인터페이스의 메서드만 호출 가능
        Buy buyer = customer;
        buyer.buy();
        buyer.info();   // 실제 객체는 Customer(). 재정의된 메소드 호출

        System.out.println();
        System.out.println(buyer.hashCode()); // 990368553
        // 동일하다.

        // Customer 객체인 customer 를 Sell 인터페이스형인 seller 에 대입하여 형 변환.
        // seller 는 Sell 인터페이스의 메서드만 호출 가능
        Sell seller = (Sell) customer; // (Sell) 생략가능.
        seller.sell();
        seller.info();
//        seller.buy(); 다른 인터페이스의 추상메서드는 사용 불가능

        System.out.println();

        if (seller instanceof Customer) {
            // seller 를 하위 클래스 형인 Customer로 다시 형 변환. 이때는 명시해야됨
            Customer customer2 = (Customer) seller;

            customer2.buy();
            customer2.sell();
            customer2.info();

        }
    }

}
