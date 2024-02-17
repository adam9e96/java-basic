package chapter26_designPattern.builder;

/**
 * ===========================================================
 * fileName       : Account
 * date           : 2024-02-16
 * description    : Builder 패턴 연습01
 * ===========================================================
 */
public class Account {  // 계좌라는 클래스를 만들고
    /*
    객체 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 얻을 수 있게 하는 패턴을 의미.
    Java 에서 객체의 초기화와 생성을 캡슐화하는 데 유용하게 사용.
     */
    private int accID;  // 계좌ID
    private int balance;    // 잔 액
    private String cusName;     // 고객 이름
    // 계좌 클래스를 외부에서 사용하려면 초기화 필요. -> 생성자를 통해 초기화
    //
    //

    // 필드가 10개 이상이 된다면.
    // 모든 필드를 사용하는 생성자가 필요
    public Account(int accID, int balance, String cusName) {    // 빌더에서 사용할 거임
        this.accID = accID;
        this.balance = balance;
        this.cusName = cusName;
    }

    // 클래스에 필드가 3개니까
    // 6가지? 생성자를 만들 수 있어요.

        // 이것은 출력할때 문자열로 출력해서 볼려고 만들어 둔거
    @Override
    public String toString() {
        return "Account{" +
                "accID=" + accID +
                ", balance=" + balance +
                ", cusName='" + cusName + '\'' +
                '}';
    }

    // 빌더라는 내부 클래스를 생성함    // static 을 사용해야 함 // 내부 클래스는 static
    // 외부 클래스를 생성하고 // 내부클래스를 생성하면 // 외부 클래스를 ㅇ인스턴스 화 시키기고  알아서 내부 클래스가 힙 메모리에 생성이 되요. // 외부 클래스가 죽어도 살아있을 수 있음
    // 내부 클래스 메모리에 살아 남아 메모리 누수? 같은 문제가 있어서 // 이건 저도 어려워서 잘모름
    public static class Builder {   // 을 위해서 내부 클래스를 이용하므로 static가 필요함. //Builder 내부 클래스를 이용해서 Account 외부 클래스 객체를 생성하는 거임.
        //객체 생성
        // 외부 클래스와 동일한 필드를 가짐
        private int accID;
        private int balance;
        private String cusName;

        // 빈 생성자. 객체 생성
        Builder() {

        }

        // 체이닝 메서드 사용을 위해 객체반환. // 체이닝 메소드
        // accId, balance, cusName 은 Builder 클래스의 멤버 메서드
        public Builder accID(int accID) {   // 사용되는 이름과 동일하게 작명함 setter 와 비슷함   // 여기서 `Builder` 라는 키워드를 사용하느데 키워드가 의미는 없음
            this.accID = accID;     // 반환형 이 내부클래스 이름
            return this;    // 해당 객체 반환 // Builder 내부 클래스의 객체 주소를 반환 함.
        }

        public Builder balance(int balance) {   // 메소드가 아니고 객체임 반환형 Builder(객체)
            this.balance = balance;
            return this;    // 이 구무은 빌더 패턴에서 사용되는 체이닝(연쇄) 메서드를 구현하는데 사용된다.
            // 이 구문은 현재 객체를 가르키는 키워드인 `this` 를 반환한다.
        }
        // 이 메서드는 빌더 패턴에서 사용되는 체이닝 메서드의 일종으로, balance 필드 값을 설정하고 빌더 객체 자체를 반환

        public Builder cusName(String cusName) {
            this.cusName = cusName;
            return this;
        }

        public Account build() {    // build라는 메소드 // new Account 객체를 호출함   // 반환형이 외부 클래스명.
            return new Account(this.accID, this.balance, this.cusName);
        }
    } // 내부 클래스 END.

}
