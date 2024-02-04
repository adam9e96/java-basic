package chapter15.parent;

public class Child extends Parent {
    int x = 20;

    void method() {
        int x = 30;
        System.out.println("x = " + x); // 가장 좁은 범위의 필드를 잡음
        System.out.println("this.x = " + this.x); // 객체의 필드를 잡음, 없으면 동일 이름의 부포 필드를 잡음
        // this.x 는 부모나 상속받는 객체에 필드를 가르킴. 지역필드는 안가르킴 에러뜸
        /*
        super : 상속을 하면 자식의 멤버 (변수, 메서드)와 이름이 겹치게 될 때가 있는데 이를 구분하기 위해 super.변수
        super.메서드() 를 사용하면 자식의 멤버가 호출되지 않고 상속 받은 부모의 멤버를 호출할 수 있게 된다.
         */
//        System.out.println("super.x = " + super.x);
        // 같은 변수필드, 메서드 이름이 충돌할 경우 가장 가까운 가장 좁은 범위의 필드를 가르킨다.
    }
}
