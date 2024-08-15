class Test {
    Test() {
        System.out.println("디폴트 생성자 호출");
    }

    Test(String model) {
        System.out.println("모델: " + model);
    }

    Test(String model, String color) {
        System.out.println("모델: " + model + ", 색상: " + color);
    }

    Test(String model, String color, int maxSpeed) {
        System.out.println("모델: " + model + ", 색상: " + color + ", 최대 속도: " + maxSpeed);
    }
}

public class C {
    public static void main(String[] args) {

        Test t = new Test();
    }
}