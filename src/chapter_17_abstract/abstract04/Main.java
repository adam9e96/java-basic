package chapter_17_abstract.abstract04;

public class Main {     // 메인 클래스
    public static void main(String[] args) {
        // 각 자동차를 생성하고 정보를 출력하도록 함
        Sedan sedan = new Sedan("현대", "소나타", 2022);
        SUV suv = new SUV("기아", "스포티지", 2023);

        sedan.displayInfo();
        suv.displayInfo();
        Car[] car;   // = new Car[2];
        car = new Car[]{new Sedan("현대", "아이오닉5", 2023),
                new SUV("테슬라", "ModelY", 2022)
        };
        car[0].displayInfo();
        car[1].displayInfo();

    }
}
