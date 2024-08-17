package chapter_21_collection_set.stack02.test2;/*
 * ===========================================================
 * fileName       : StckTest2
 * date           : 2024-01-28
 * description    :
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

public class StckTest2 {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<>();

        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(10));

        System.out.println(coinStack.peek().getValue());
        System.out.println(coinStack.pop().getValue());
    }
}

