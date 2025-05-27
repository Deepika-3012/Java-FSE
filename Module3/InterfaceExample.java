// Interface
interface Shape {
    double getArea();
}

// Implementing class
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.getArea());
    }
}
