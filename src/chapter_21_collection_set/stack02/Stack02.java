package chapter_21_collection_set.stack02;/*
 * ===========================================================
 * fileName       : Stack02
 * date           : 2024-01-26
 * description    : Stack 을 이용한 동전케이스
    stack 연습 ex) 택시 동전통
    자바에서 직접 제공하는 stack 을 이용
 * ===========================================================
 */

import java.util.Stack;

class Coin { // 동전 케이스를 구현한 클래스
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Stack02 {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();    // 스택은 클래스임

        // 동전을 끼움.
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

//        while (!coinBox.isEmpty()) { // 동전 케이스가 비었는지 확인 // 비었으면 true인데 not이므로 있으면 true나 다름없다.
//            Coin coin = coinBox.pop();  // 동전 케이스에서 제일 위의 동전을 꺼냄
//            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");    // 비어있을 때까지 반복
//
//        }

        while(coinBox.size() != 0){
            // case1
//            Coin coin = coinBox.pop();
//            System.out.println(coin.getValue());
            //case2
            System.out.println("꺼내온 동전 : "+coinBox.pop().getValue()  + "원");    // 비어있을 때까지 반복
        }
        /*
        꺼내온 동전 : 10원
        꺼내온 동전 : 500원
        꺼내온 동전 : 50원
        꺼내온 동전 : 100원
         */
        // 코드 수정 //
        // todo while문 안에 size 를 넣어서서 조정

    }
}
