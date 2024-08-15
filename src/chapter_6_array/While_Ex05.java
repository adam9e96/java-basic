package chapter_6_array;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : While_Ex05
 * date           : 2024-01-24
 * description    :
 * 사용자로부터 돈을 사용하는 프로그램
 * continue 문을 활용하여 잔액이 0원이 될 때까지 반복적으로 돈을 사용한다.
 * ===========================================================
 */
public class While_Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 잔액이 10000원. 사용할 금액을 입력받아 잔액이 0원이 되도록
        int money = 10000;
        System.out.println("현재 가진 돈은 " + money + "원입니다.");

        while (true) { //  무한 루프를 시작 // 사용자가 종료 조건을 만족할 때까지 계속해서 반복됩니다.
            System.out.print("얼마를 사용하시겠습니까? >>> ");
            int spendMoney = scanner.nextInt(); // 사용자로부터 정수를 입력받음

            // 입력받은 값이 올바른지 검사. 만약 올바르지 않다면 다시 입력을 요구하도록 한다.
            if (spendMoney <= 0 || spendMoney > money) {
                // 현재 가진 돈보다 크거나, 음수를 입력하면 다시 입력 요구
                System.out.println("다시 입력해 주세요(사용범위가 틀렸습니다.)");
                continue; // 현재의 반복을 벗어나서 다시 반복을 시작
            }

            money -= spendMoney;
            System.out.println("이제 " + money + "원이 남았습니다.");
            // 남은 돈의 양 출력
            if (money == 0) { // 잔액이 0원이 되면 프로그램을 종료
                break;
            }
        }
        System.out.println("모든 돈을 사용합니다. 종료");
        scanner.close(); // 프로그램이 끝나면 `Scanner` 객체를 닫아 메모리 누수를 방지
    }
}
