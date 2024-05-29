package chapter26_designPattern.builder03;

/**
 *
 */
class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;

    // private 생성자
    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Builder 클래스  (핵심)

    /**
     * Builder 클래스 <br>
     * Builder 클래스는 정적 내부 클래스(Static Inner Class)이다.<br>
     * 이렇게 하면 Builder 클래스는 외부 클래스의 인스턴스 없이도 생성될 수 있다.<br>
     *
     * 정적 내부 클래스로 정의하면 외부 클래스의 모든 인스턴스 멤버에 접근할 수 없지만, 외부
     * 클래스의 인스턴스화 없이도 `Builder` 객체를 생성할 수 있는 장점도 있다. <br>
     *
     * Builder 클래스의 인스턴스 생성방법 <br>
     * builder 클래스는 외부 클래스인 Person 의 private 생성자를 통해 인스턴스를 생성한다.
     *
     */
    public static class Builder { // 정적 내부 클래스
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        // 각 필드를 설정하는 메서드
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 최종적으로 Person 객체를 생성하는 메서드
        public Person build() {
            return new Person(this); // Person 객체(인스턴스)를 생성하고 반환함
        }
    } // END Builder Class

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        // 빌더 패턴을 사용하여 Person 객체 생성
        Person person = new Person.Builder() // 여기서 Person.Builder 객체 1개 생성됨.
                .firstName("Akaps") // 여기서 부터는 Builder 객체의 필드값이 설정됨
                .lastName("9999") // Builder 객체의 내부 상태를 변경할뿐 새로운 인스턴스 생성은 없음
                .age(30)
                .address("Daegu")
                .build(); // 이 줄에서 Person 객체가 1개 생성됨

        System.out.println(person);

    }
}