package chapter12.tv;

public class TvDemo {
    public static void main(String[] args) {
    /*
    참조 변수의 복사
     */
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1.toString()값은 " + t1.toString() + "입니다.");
//        t1.toString()값은 chapter12.tv.Tv@e9e54c2입니다. 10진수- > 245,257,410
//        패키지명.클래스명@16진수값
        System.out.println("t2.toString()값은 " + t2.toString() + "입니다.");
//        t2.toString()값은 chapter12.tv.Tv@7cca494b입니다.
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
        System.out.println();

        t1.channel = 7; // channel 값을 7으로 한다.
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다."); // 7
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다."); // 8
        System.out.println();


        t1 = t2; // t1의 참조 주소값을 지우고 t2가 참조하고 있는 주소값을 복사한다.

        System.out.println("t1.toString()값은 " + t1.toString() + "입니다.");
//        t1.toString()값은 chapter12.tv.Tv@7cca494b입니다. 10진수- > 245,257,410
//        패키지명.클래스명@16진수값
        System.out.println("t2.toString()값은 " + t2.toString() + "입니다.");
//       t2.toString()값은 chapter12.tv.Tv@7cca494b입니다.


        t1.channel = 27;
        System.out.println("t1의 channel 값을 27로 변경하였습니다.");
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다."); // 27
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다."); // 27


    }
}
