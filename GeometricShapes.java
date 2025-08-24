import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle implements Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}

public class GeometricShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter radius of circle: ");
            double r = Double.parseDouble(sc.nextLine());
            Shape circle = new Circle(r);
            System.out.println("Circle Area: " + circle.area());
            System.out.println("Circle Perimeter: " + circle.perimeter());

            System.out.print("Enter length and breadth of rectangle: ");
            double l = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            Shape rectangle = new Rectangle(l, b);
            System.out.println("Rectangle Area: " + rectangle.area());
            System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

            System.out.print("Enter sides of triangle: ");
            double t1 = Double.parseDouble(sc.nextLine());
            double t2 = Double.parseDouble(sc.nextLine());
            double t3 = Double.parseDouble(sc.nextLine());
            Shape triangle = new Triangle(t1, t2, t3);
            System.out.println("Triangle Area: " + triangle.area());
            System.out.println("Triangle Perimeter: " + triangle.perimeter());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
