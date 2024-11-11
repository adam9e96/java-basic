package chapter_7_method.b_practice;

// final 키워드를 사용하여 상수를 정의합니다.
class Constants {
    public static final double PI = 3.14159;
    public static final int MAX_USERS = 100;
}

// final 키워드를 사용하여 클래스의 상속을 방지합니다.
final class ImmutablePerson {
    private final String name;
    private final int age;

    // 생성자를 통해 final 필드를 초기화합니다.
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // final 메서드를 정의하여 하위 클래스에서 오버라이딩하지 못하게 합니다.
    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    // 메서드 내에서 final 지역 변수를 사용하여 변경을 방지합니다.
    public void printInfo() {
        final String info = "Name: " + name + ", Age: " + age;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // 익명 클래스에서 final 지역 변수를 안전하게 사용할 수 있습니다.
                System.out.println(info);
            }
        };
        new Thread(runnable).start();
    }
}

// 아래 클래스는 상속이 불가능하여 컴파일 오류가 발생합니다.
// public class SubClass extends ImmutablePerson {
// }

public class MethodDemo09Final {
    public static void main(String[] args) {
        // 상수 사용 예제
        System.out.println("PI: " + Constants.PI);
        System.out.println("Max Users: " + Constants.MAX_USERS);

        // 불변 객체 생성 및 사용 예제
        ImmutablePerson person = new ImmutablePerson("Alice", 30);
        person.printInfo();
    }
}
