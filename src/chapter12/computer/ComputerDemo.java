package chapter12.computer;

public class ComputerDemo {
    public static void main(String[] args) {
        // Computer 객체 생성
        Computer computer = new Computer();

        // sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
        // 합산결과를 리턴 받아 result1 변수에 대입
        int result1 = computer.sum(1, 2, 3); // 3개의 인수
        System.out.println("result : " + result1);

        // sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고
        // 합산결과를 리턴 받아 result2 변수에 대입
        int result2 = computer.sum(1, 2, 3, 4, 5); // 5개의 인수
        System.out.println("result2 :" + result2);

        // sum() 메소드 호출 시 배열을 제공하고
        // 합산 결과를 리턴 받아 result3 변수에 대입
        int[] values = {1, 2, 3, 4, 5};
        int result3 = computer.sum(values);
        System.out.println("result3 :" + result3);

        // sum() 메소드 호출 시 배열을 제공하고
        // 합산 결과를 리턴 받아 result4 변수에 대입
        int result4 = computer.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("result4 : " + result4);

        int result5 = computer.sum();
        System.out.println("result5 : " + result5); // 결과 0

        /*
         * 가변길이 매개변수는 배열과 매우 유사하게 동작합니다. 자바에서 가변길이 매개변수(Varargs)는 메서드가 가변 길이의 인수 목록을 허용할 수 있도록 해줍니다.
         * 가변 길이 매개변수는 내부적으로 배열로 처리되며, 호출 시 여러 개의 인수를 배열로 전달 합니다.
         *
         * 배열과 유사한 방식으로 접근할 수 있는 이점과, 선언 및 호출 시 가변적인 수의 인수를 전달하는 장점도 있다.
         */
    }
}
