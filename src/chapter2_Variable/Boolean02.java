package chapter2;

/*
 * ===========================================================
 * fileName       : Boolean02
 * date           : 2024-01-06
 * description    : 두 제품의 가격을 비교하여 두 제품이 동일한 가격인지 여부를
 판단하는데 `boolean` 변수를 활용.
 * ===========================================================
 */

public class Boolean02 {
    public static void main(String[] args) {

        int price1 = 30000;
        int price2 = 30001;

        boolean priceAreEqual = (price1 == price2);

        System.out.println("Product1  Price: " + price1);
        System.out.println("Product2  Price: " + price2);

        if (priceAreEqual) {
            System.out.println("두 제품의 가격은 같다.");
        } else {
            System.out.println("두 제품의 가격은 다르다");
        }

    }
}
