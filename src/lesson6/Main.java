//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    }*/


/*
* // DayChecker 클래스 정의
public class DayChecker {

    // printDayType 메서드: 주어진 day가 주말인지 평일인지를 출력
    public void printDayType(Day day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다.");
                break;
            default:
                System.out.println("평일입니다.");
                break;
        }
    }

    // printDay 메서드: 주어진 day가 무슨 요일인지 한글로 출력
    public void printDay(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("월요일");
                break;
            case TUESDAY:
                System.out.println("화요일");
                break;
            case WEDNESDAY:
                System.out.println("수요일");
                break;
            case THURSDAY:
                System.out.println("목요일");
                break;
            case FRIDAY:
                System.out.println("금요일");
                break;
            case SATURDAY:
                System.out.println("토요일");
                break;
            case SUNDAY:
                System.out.println("일요일");
                break;
        }
    }

    // main 메서드 (테스트용)
    public static void main(String[] args) {
        DayChecker checker = new DayChecker();

        // 월요일 테스트
        checker.printDayType(Day.MONDAY);
        checker.printDay(Day.MONDAY);

        // 토요일 테스트
        checker.printDayType(Day.SATURDAY);
        checker.printDay(Day.SATURDAY);
    }
}*/
/*
// Shape 인터페이스 정의
interface Shape {
    void draw();
    double getArea();
}

// Rectangle 클래스 정의
class Rectangle implements Shape {
    private double width;
    private double height;

    // 생성자
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // draw 메서드 구현
    @Override
    public void draw() {
        System.out.println("This is a rectangle.");
    }

    // getArea 메서드 구현
    @Override
    public double getArea() {
        return width * height;
    }
}

// Circle 클래스 정의
class Circle implements Shape {
    private double radius;

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    // draw 메서드 구현
    @Override
    public void draw() {
        System.out.println("This is a circle.");
    }

    // getArea 메서드 구현
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle 클래스 정의
class Triangle implements Shape {
    private double base;
    private double height;

    // 생성자
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // draw 메서드 구현
    @Override
    public void draw() {
        System.out.println("This is a triangle.");
    }

    // getArea 메서드 구현
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main 클래스 정의
public class Main {
    public static void main(String[] args) {
        // 각 Shape 객체 생성
        Shape rectangle = new Rectangle(5.0, 10.0);
        Shape circle = new Circle(7.0);
        Shape triangle = new Triangle(6.0, 8.0);

        // Rectangle
        rectangle.draw();
        System.out.println("Area: " + rectangle.getArea());

        // Circle
        circle.draw();
        System.out.println("Area: " + circle.getArea());

        // Triangle
        triangle.draw();
        System.out.println("Area: " + triangle.getArea());
    }
}
*/

/*// Vehicle 클래스 정의
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

 */
