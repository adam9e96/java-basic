package chapter19_InterFace.interface08;

/*
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-24
 * description    :
 * 1. 인터페이스 `interface` 는 클래스 혹은 프로그램이 제공하는 기능을 명시적으로 선언하는 역할.
 * 2. 인터페이스는 추상메서드와 상수로만 이루어짐.
 * 3. 구현된 코드가 없기 때문에 당연히 인터페이스로는 인스턴스를 생성할 수 없음.
 * ===========================================================
 */
/*
/*
 todo #1 읽어 봐야 할거
자바 7까지는 인터페이스에서 추상메서드와 상수, 이 두 가지 요소만 선언해서 사용할 수 있음.
그런데 인터페이스를 구현한 여러 클래스에서 동일한 기능의메서드를 사용한다했고 인터페이스에서 코드를 구현할 수 없으므로
추상 메서드를 선언하고
각 클래스마다 똑같이 그 기능을 반복해서 구현해야 함.

자바 8 부터는 이런 부분에서 인터페이스 활용성을 높이기 위해 디폴트 메서드와 정적 메서드 기능을 제공.
디폴트 메서드는 인터페이스에서 구현 코드까지 작성한 메서드.
인터페이스를 구현한 클래스에 기본적으로 제공할 메서드. 인터페이스에서 구현하지만, 이 후 인터페이스를 구현한 클래스가 생성되면
그 클래스에서 사용할 기본 기능.
정적 메서드는 인스턴스 생성과 상관없이 사용할 수 있는 메서드. 사용할 때는 인터페이스 이름으로 직접 참조하여 사용.

자바 9 부터는 인터페이스에 `private` 메서드를 구현할 수 있음.
private 메서드는 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음.
따라서 기존에 구현된 코드를 변경하지 않고 인터페이스를 구현한 클래스에서 공통으로 사용하는 경우에 private 메소드를 사용하면
코드 재사용성을 높일 수 있음.
또한 클라이언트 프로그램에 제공할 기본 기능을 private 메소드로 구현하기도 함.
 */


public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc calc = new CompleteCalc();

        System.out.println(calc.add(num1, num2));   // 추상 클래스에서 오버라이딩 한 메소드 1
        System.out.println(calc.subtract(num1, num2)); // 추상 클래스에서 오버라이딩 한 메소드 2
        System.out.println(calc.times(num1, num2)); // 일반 클래스에서 오버라이딩 한 메소드 1
        System.out.println(calc.divide(num1, num2)); // 일반 클래스에서 오버라이딩 한 메소드 2
        calc.showInfo(); // CompleteCalc 에서 추가한 메소드

//         == 추가된 코드 ==
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr)); // static 메소드이기에 인터페이스.메소드명 호출

        // 인터페이스 static 메소드
        System.out.println(Calc.total(new int[]{10, 5})); // 바로 대입하는 방식

        calc.description(); // 인터페이스 default 메소드

    }
}
