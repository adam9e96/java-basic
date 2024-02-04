package chapter16.poly2;

public class Tv extends Product{
    Tv() {
        //조상클래스의 생성자 Product(int price)를 호출한다.
        super(100); // Tv의 가격을 100만원으로 한다.
    }

    @Override
    public String toString() {
        return "Tv";
    }
}
