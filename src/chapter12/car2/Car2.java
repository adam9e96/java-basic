package chapter12.car2;

/**
 * 가스를 사용하여 차량의 상태를 관리하고, 차량의 가스 상태에 따라 운행을 제어하는 메서드
 */
public class Car2 {
    // 필드 
    /**
     * 차량 가스의 잔량을 나타내는 필드
     */
    int gas;


    /**
     * 가스의 잔량을 설정
     * 리턴값이 없는 메소드로 매개값을 받아서 gas 필드 값을 변경
     *
     * @param gas 설정할 가스의 양
     */
    void setGas(int gas) {
        this.gas = gas;
    }

    /**
     * 가스의 잔량이 남아 있는지를 확인
     * 리턴 값이 boolean 인 메소드로 gas 필드 값이 0 이면 false 를, 아니라면 true 를 리턴
     *
     * @return 가스가 0이면 false, 그렇지 않으면 true 를 반환
     */
    boolean hasGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false; // false 를 리턴하고 메소드 종료
        }
        System.out.println("gas가 있습니다.");
        return true; // true 를 리턴하고 메소드 종료
    }

    /**
     * 가스가 남아 있는 동안 차량을 운행
     * 가스가 떨어지면 운행을 멈추고 메소드를 종료.
     * <p>
     * 리턴값이 없는 메소드로 gas 필드 값이 0 이면 return 문으로 메소드를 종료
     */
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. (gas잔량: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춤니다. (gas잔량: " + gas + ")");
                System.out.println("gas를 주입하세요.");
                return; // 메소드 종료
            }
        }
    }
}
