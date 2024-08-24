package lesson6;

public class Vehicle {
    // 필드 정의
    private String make;    // 제조사
    private String model;   // 모델
    private int year;       // 연식
    private double mileage; // 주행 거리

    // 생성자
    public Vehicle(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Getter 및 Setter 메서드들
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    // drive() 메서드 구현
    public void drive() {
        System.out.println("주행을 시작합니다.");
    }

    // displayInfo() 메서드 구현
    public void displayInfo() {
        System.out.println("제조사: " + make);
        System.out.println("모델: " + model);
        System.out.println("연식: " + year);
        System.out.println("주행 거리: " + mileage + " km");
    }

    // stop() 메서드 구현
    public void stop() {
        System.out.println("주행을 종료합니다.");
    }

    // main 메서드 (테스트용)
    public static void main(String[] args) {
        // Vehicle 객체 생성
        Vehicle myCar = new Vehicle("Toyota", "Corolla", 2020, 15000.0);

        // 메서드 호출
        myCar.displayInfo();
        myCar.drive();
        myCar.stop();
    }
}