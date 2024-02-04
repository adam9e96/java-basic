package chapter16.poly2;

import chapter13.test.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/*
수정
1) 구매한 물품을 저장하는 기능 추가.
2) 구매한 물품에 대한 정보를 요약해서 보여주는 기능 추가.
 */
public class Buyer { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수
    // Product product = new Audio();
    ArrayList<Product> products = new ArrayList(); // 가장 큰 점은 사이즈 지정을 안함.
    // 구입한 제품을 저장하는데 사용될 ArrayList 객체 <-- 이거쓰면 i가 필요없어짐

//    Product[] products = new Product[10]; // 구입한 제품을 저장하기 위한 배열
//    int i = 0;           // Product배열에 사용될 카운터 <-- 현재 몇개를 샀는지와 인덱스용 두가지로 사용가능함

    void buy(Product product) {  // 부모 클래스 타입으로 매개변수 받음.
        // 부모 클래스의 필드 사용. price, bonusPoint
        if (money < product.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= product.price;             // 가진 돈에서 구입한 제품의 가격을 뺸다.
        bonusPoint += product.bonusPoint;   // 제품의 보너스 점수를 추가한다.
//        products[i++] = product;            // 제품을 Product[] products에 저장한다.
        products.add(product); // 구입한 제품을 ArrayList에 저장한다.
        System.out.println(product + "을/를 구입하셨습니다.");
    }

    void summary() {            // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;            // 구매한 물품의 가격합계
        String itemList = "";    // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.

        if (products.isEmpty()) {    // ArrayList가 비어있는지 확인한다.
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
//        ArrayList의 i 번째에 있는 객체를 얻어 온다.
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            sum += product.price;
            itemList += (i == 0) ? "" + product : ", " + product;
        }


        // 1) for 이용
//        for (int i = 0; i < products.length; i++) {
//            if (products[i] == null)
//                break;
//            sum += products[i].price;
//            itemList += products[i] + ", ";
//        }

        // 2) foreach 이용
//         for (각 요소의 타입과 요소를 담을 변수 : 배열 또는 컬렉션)
//        for (Product product : products) {
//            if (product == null)
//                break;
//            sum += product.price;
//            itemList += product + ", ";
//        }
//         foreach문의 단점은 인덱스 [i] 를 이용할 수 없어서 값자체를 이용함

        // 3) 반복을 줄이기 위해 인스턴스 변수 i 사용
//        for (int i = 0; i < this.i; i++) {
//            sum += products[i].price;
//            itemList += products[i].toString() + ", ";
//        }
        System.out.println(products.get(products.size() - 1));
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }

    public void refund(Product product) { // 구입한 제품을 환불한다.
//        if (products.remove(product)) { // 제품을 ArrayList 에서 제거한다. if 조건문에 있는건 boolean 반환값 유추가능. 처음보는 메소드를 만나면 유추됨
//            money += product.price;
//            bonusPoint -= product.bonusPoint;
//            System.out.println(product + "을/를 반품하셨습니다.");
//        } else {
//            System.out.println("구입하신 제품 중 해당 상품이 없습니다.");
//        }
        // case2
        // 매개 변수로 받은 객체가 존재하면 삭제
        int idx = findIdx(product);
        if (idx == -1){ // 요소가 없는 경우.
            System.out.println("구입하신 제품 중 해당 상품이 없습니다.");
        }
        // 환불처리


        // 자리 변경
//        for (int i = idx; i < this.i; i++) {
//            products[i] = products[i+1];
//        }
//        this.i--;
    }
    private Integer findIdx(Product product){
        int idx = -1;
//        for (int i = 0; i < this.i; i++) {
//            if ()
//        }
        return idx;
    }
}
