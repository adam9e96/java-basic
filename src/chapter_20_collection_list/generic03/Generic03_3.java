package chapter_20_collection_list.generic03;/*
 * ===========================================================
 * fileName       : Generic03_3
 * date           : 2024-01-26
 * description    :
 * ===========================================================
 */

// 제네릭의 범위 지정
// 제네릭 타입을 특정 범위로 한정해서 타입을 매개변수로 받으려는 경우 "extends" 예약어를 사용하여 변수를 선언.
// extends 뒤에 클래스는 하나만 쓸 수 있고 인터페이스는 여러 개 사용 가능. 클래스 없이 인터페이스만 사용할 수도 있음.
interface First {

}

interface Second {

}

class Third {

}

class Fourth implements First {

}

class Fifth implements Second {

}

class Sixth extends Third {

}

class Seventh extends Third implements First, Second {

}

class MyBox<T extends Third & First & Second> {
}   // Third 클래스를 상속 받고, First, Second 인터페이스를 구현하는 범위.

class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public boolean compare(T otherNumber) {
        return number.equals(otherNumber);
    }
}

public class Generic03_3 {
    public static void main(String[] args) {
//        MyBox<Fourth> myBox1 = new MyBox<>(); // Compile Error(X)
//        MyBox<Fifth> myBox2 = new MyBox<>(); // Compile Error(X)
//        MyBox<Sixth> myBox3 = new MyBox<>(); // Compile Error(X)
        MyBox<Seventh> myBox4 = new MyBox<>();  // Seventh 클래스는 Third 클래스를 상속 받고, First, Second 인터페이스를 구현하는 클래스.

        NumberBox<Integer> nBox = new NumberBox<>(100);
        System.out.println("check = " + nBox.compare(120));
//        NumberBox<String> nBox2 = new NumberBox<String>("홍길동"); // String Number 클래스를 상속 받지 않아서 사용이 안됨.
    }
}
