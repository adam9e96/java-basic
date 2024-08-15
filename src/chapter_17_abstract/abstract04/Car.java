package chapter_17_abstract.abstract04;

    // 추상 클래스 Car 정의
    abstract class Car {
        private String brand;
        private String model;
        private int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // 추상 메서드 정의 - 각 자동차가 구체적으로 구현할 메서드
        public abstract void displayInfo(); // 추상 메서드

        // 일반 메서드 - 자동차 브랜드 반환
        public String getBrand() {
            return brand;
        }

        // 일반 메서드 - 자동차 모델 반환
        public String getModel() {
            return model;
        }

        // 일반 메서드 - 자동차 생산년도 반환
        public int getYear() {
            return year;
        }
    }
    // 각 자동차들의 구현 클래스
    class Sedan extends Car {
        public Sedan(String brand, String model, int year) {
            super(brand, model, year);
        }

        // 추상 메서드 구현
        @Override
        public void displayInfo() {
            System.out.println("세단 정보 - 브랜드: " + getBrand() + ", 모델: " + getModel() + ", 생산년도: " + getYear());
        }
    }

    class SUV extends Car {
        public SUV(String brand, String model, int year) {
            super(brand, model, year);
        }

        // 추상 메서드 구현
        @Override
        public void displayInfo() {
            System.out.println("SUV 정보 - 브랜드: " + getBrand() + ", 모델: " + getModel() + ", 생산년도: " + getYear());
        }
    }



 //   이 프로그램에서는 `Car` 클래스를 추상 클래스로 정의하고,
//   각 자동차는 이 클래스를 상속받아 `displayInfo` 메서드를 구현합니다.
//   `CarMain` 클래스에서는 각 자동차를 생성하고 정보를 출력하도록 합니다.
//   이를 실행하면 각 자동차의 정보가 출력됩니다.
