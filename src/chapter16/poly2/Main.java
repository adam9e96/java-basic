package chapter16.poly2;

/*
코딩 순서 : Product -> Tv -> Computer -> Buyer -> Test(Main)
 */
public class Main {
    public static void main(String[] args) {

        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Audio());

        System.out.println("현재 남은 돈은 " + buyer.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + buyer.bonusPoint + "점입니다.");
//        System.out.println(buyer.products);
        // 밑에 껄로 변경
//        buyer.summary();
        System.out.println("===========================");
        /*
        환불 기능 추가 및 리스트를 이용한 데이터 저장
        Buyer 클래스의 환불 기능을 추가하기 위해 배열에서 ArrayList 로 저장되는 데이터 타입을 변경.
         */
//        Buyer b = new Buyer();
//        Tv tv = new Tv();
//        Computer com = new Computer();
//        Audio audio = new Audio();
//        System.out.println("=1=");
//        b.buy(tv);
//        b.buy(com);
//        b.buy(audio);
//        b.summary();
//        System.out.println("=2=");
//        b.refund(com);
//        b.summary();
    }
}
