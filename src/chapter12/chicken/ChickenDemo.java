package chapter12.chicken;

public class ChickenDemo {
    public static void main(String[] args) {
        Chicken chi1 = new Chicken("네네치킨", 2);
        chi1.ck = "교촌치킨";
        System.out.println(chi1.ck);
        System.out.println(chi1.quantity);
        chi1.ck = "네네치킨";
        chi1.quantity = 3;
        System.out.println("${chi1.ck} = " + chi1.ck);
        System.out.println("${chi1.quantity} = " + chi1.quantity);
    }
}
