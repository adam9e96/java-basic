package chapter_18_interface.interface01;

/*
 * ===========================================================
 * fileName       : RemoteControl
 * date           : 2024-01-23
 * description    : 인터페이스 연습-1
 * ===========================================================
 * 추상클래스와 비슷하다.
 * 예를 들어 스마트 홈의 가전제품들을 원격 조정하기 위한 인터페이스를 정의.
 * 가전 제품들을 켜고 끄는 기능만을 정의.
 *
 * 만약에 인터페이스에 추가로 기능을 넣고자 한다면 에러가 발생할 것이다. (인터페이스의 추상 메서드를 재정의한
 * 클래스에서 아직 추가된 추상 메서드를 오버라이딩을 못해서)
 * 그러면 추가를 하더라도 문제없이 할 수있는 방법은 없는건가?
 * -> 인터페이스를 상속 받으면 된다.
 */
public interface RemoteControl {
    // 상수 필드
//    int MAX_VOLUME = 10;
//    int MIN_VOLUME = 0;

    // 추상 메서드 정의
    public abstract void turnOn(); // 가전 제품을 켠다.

    public void turnOff(); // 가전 제품을 끈다.
    // 인터페이스는 `public abstract`가 자동으로(묵시적) 붙어서 적을 필요없다.

//    public void volumUp(); // 추후에 필요해서 기능 추가함
//    public void volumDown(); // 추후에 필요해서 기능 추가함 <-- 문제발생
    //  나중에 추가된 기능(추상메서드) 때문에 구현 받은 클래스에서 문제가 발생한다..
//    void setVolume(int volume);

}
/*
메서드들은 모두 이름과 매개변수만 존재하고, 몸체가 없으며 세미콘론으로 종료되는 점에 유의.
인터페이스 안에서 선언되는메서드들은 모두 묵시적으로 `public abstract`가 포함됨.
따라서 `public`이나 `abstract` 수식어는 없어도 됨.

 */

/*
만약 다른 개발자들이 사용하고 있던 인터페이스를 변경시키면 해당 인터페이스로 구현된
모든 클래스가 동작되지 않음.
이런 경우 대비해서 인터페이스도 상속을 받아서 확장시킬 수 있도록 되어있음.
인터페이스도 `extends` 를 이용하여 다른 인터페이스를 상속 받을 수 있음.
 */
interface AdvancedRemoteControl extends RemoteControl { // RemoteControl 인터페이스에 상속을 받음
    public abstract void volumUp(); // 가전 제품의 불륨을 높인다.
    public void volumDown(); // 가전 제품의 불륨을 낮춘다.
}
/*
새로 추가될 메서드를 서브 인터페이스에 구현하면 RemoteControl 인터페이스를 구현하던 에러는 사라짐.
이 경우 인터페이스의 사용자들은 예전의 인터페이스를 계속 사용할 것인지 아니면
새 버전으로 업그레이드할 것인지 선택할 수 있음.
 */

/*
 * 인터페이스는 다른 클래스에 의하여 구현(implement) 될 수 있음
 * 인터페이스를 구현한다는 말은 인터페이스에 정의된 추상 메서드의 몸체를 정의한다는 의미.
 * 클래스가 인터페이스를 구현하기 위해서는 `implement` 키워드를 사용.
 * 예를 들어 Television 클래스가 RemoteControl, AdvancedRemoteControl 인터페이스를 구현하기 위한 문법은 아래와 같음.
 *
 */
// 추상클래스의 주 목적은 협업할 때 필요한 기능을 무조건 구현하도록 하는 것임.

class Television implements RemoteControl, AdvancedRemoteControl {
    private boolean on;
    private int volume = 0;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }


    @Override
    public void volumUp() {
        System.out.println("볼륨 키우기");
        volume++;

    }

    @Override
    public void volumDown() {
        System.out.println("볼륨 낮추기");
        volume--;
    }

}
