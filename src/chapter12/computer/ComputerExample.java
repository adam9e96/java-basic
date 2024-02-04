package chapter12.computer;

public class ComputerExample {
    public static void main(String[] args) {
        // Computer 객체 생성
        Computer computer = new Computer();

        // sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
        // 합산결과를 리턴 받아 result1 변수에 대입
        int result1 = computer.sum(1, 2, 3);
        System.out.println("result : " + result1);

        // sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고
        // 합산결과를 리턴 받아 result2 변수에 대입
        int result2 = computer.sum(1, 2, 3, 4, 5);
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
    }
}
