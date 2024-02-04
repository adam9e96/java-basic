package chapter22.stack01.test;/*
 * ===========================================================
 * fileName       : MainTest
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 */

import java.util.ArrayList;

class Stack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    // push // 스택 맨 뒤에 요소 추가
    public void push(String str) {
        arrayStack.add(str);
    }

    // pop // 스택 맨 위에 요소를 반환 하고 제거
    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었음");
            return null;
        }
        return arrayStack.remove(len - 1);
    }
// peek // 스택 맨 뒤에 요소를 반환
        public String peek () {
            int len = arrayStack.size();
            if (len == 0) {
                System.out.println("요소가 없음");
                return null;
            }
            return arrayStack.get(len - 1);
        }

}
    public class MainTest{
        public static void main(String[] args){
            Stack stack = new Stack();
            stack.push("갤럭시");
            System.out.println(stack.peek());

            System.out.println(stack.pop());
            stack.peek();
        }
}