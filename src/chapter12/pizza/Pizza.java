package chapter12.pizza;

public class Pizza {
    // 생성자는 반환형이 없다.
    int size;
    String type;

    public Pizza() { // 매개변수가 없는 생성자
        size = 12;
        type = "슈퍼슈프림";
    }

    public Pizza(int s, String t) { // 매개변수가 있는 생성자
        size = s;
        type = t;
    }
    /*
    생성자를 하나라도 만들면(기본생성자든 아니든) 빈 생성자를 생성 해주지 않는다.
     */
}
