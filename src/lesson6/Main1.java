package lesson6;
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

    @Override
    public void draw() {
        System.out.println("This is a rectangle.");
    }

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

    @Override
    public void draw() {
        System.out.println("This is a circle.");
    }

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

    @Override
    public void draw() {
        System.out.println("This is a triangle.");
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main 클래스 정의
public class Main1 {
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
