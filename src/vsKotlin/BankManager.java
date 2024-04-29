package vsKotlin;

public class BankManager {
        // BankManager 클래스 정의
    }

    class Main {
        BankManager bankManager;

        // 생성자 주입
        Main(BankManager bankManager) {
            this.bankManager = bankManager;
        }

        void main() {
            // 메인 실행 로직
        }

        public static void main(String[] args) {
            BankManager bankManager = new BankManager();
            Main app = new Main(bankManager);
            app.main();
        }
    }
