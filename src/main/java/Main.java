class Main {
    public static void main(String[] args) {

        // 구현시작
        Car car1 = new Car(230);
        Car car2 = new Car(210);

        // 구현끝

        car1.run();
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        car2.run();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class Car {
    int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.println("자동차가 최고속력 + " + speed + "km로 달립니다.");
    }
    // 구현
}