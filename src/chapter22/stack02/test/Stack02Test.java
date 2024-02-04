package chapter22.stack02.test;/*
 * ===========================================================
 * fileName       : Stack02Test
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 */

import java.util.Stack;

class Coin{
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Stack02Test {
    public static void main(String[] args) {
        Stack<Coin> coins = new Stack<>();

        Coin coin = new Coin(10);
        // 동전을 끼움.
        coins.push(new Coin(100));
        coins.push(coin);
        coins.push(new Coin(500));
        coins.push(new Coin(1000));


        while (coins.size() != 0){
            System.out.println("꺼내온 동전 : "+coins.pop().getValue() + "원");
        }
    }
}
