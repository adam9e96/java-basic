package chapter7;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : While_Ex02
 * date           : 2024-01-24
 * description    :
 * 사용자로부터 돈을 사용하는 프로그램을 구현하되, 한번에 출금 할 수 있는 금액이 1000원 이하인 경우에만
 * 출금이 가능하도록 하는 프로그램
 * 조건) break 문을 사용하지 않고 구현하기
 * ===========================================================
 */
public class While_Ex02 {
    /*
     *  1) 한번에 출금할 수 있는 금액은 1000원 이하
     *  2) break 사용하지 말 것
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 잔액이 10000원. 사용할 금액을 입력받아 잔액이 0원이 되도록
        int money = 10000;
        System.out.println("현재 가진 돈은 " + money + "원입니다.");

        while (true) {    // 무한 루프를 시작 // 사용자가 종료 조건을 만족할 때까지 실행
            System.out.print("얼마를 사용하시겠습니까? >>> ");
            int spendMoney = scanner.nextInt(); // 정수를 입력받음

            if (spendMoney <= 0 || spendMoney > money) {    // 음수이거나 0원, 가진돈보다 많은 금액을 요구하면 다시 요구
                // 현재 가진 돈보다 크거나, 음수를 입력하면 다시 입력 요구
                System.out.println("다시 입력해 주세요(사용범위가 틀렸습니다.)");
                continue; // 현재의 반복을 벗어나서 다시 반복을 시작
            } else if (spendMoney > 1000) {    // if 문이 틀릴경우(입력한값이 가진돈보다 적고 양수인경우)실행 // 1000원 이상을 요구 할 경우 다시 요구
                System.out.println("한번에 출금 가능한 금액은 1000원 이하여야 합니다.");
                continue;
            }
            money -= spendMoney;
            System.out.println("이제 " + money + "원이 남았습니다.");
            // 남은 돈의 양 출력
            if (money == 0) { // 돈이 0원이 되면 종료
                break;
            }
        }
        System.out.println("모든 돈을 사용합니다. 종료");
        scanner.close();
    }
}
