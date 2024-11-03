import java.util.Scanner;

public class Shape {
    public static class Circle {
        public static double calcArea(double r) {
            return 3.14 * r * r; // Formula for area of circle
        }
    }

    public static class Rectangle {
        public static double calcArea(double l, double w) {
            return l * w; // Area of rectangle
        }
    }

    public static class Triangle {
        public static double calcArea(double base, double height) {
            return 0.5 * base * height; // Area of triangle
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Rectangle dimensions
        System.out.println("Enter the dimensions of the rectangle (length width): ");
        double rectangleLength = sc.nextDouble();
        double rectangleWidth = sc.nextDouble();
        
        // Circle dimension
        System.out.println("Enter the radius of the circle: ");
        double circleRadius = sc.nextDouble();
        
        // Triangle dimensions
        System.out.println("Enter the dimensions of the triangle (base height): ");
        double triangleBase = sc.nextDouble();
        double triangleHeight = sc.nextDouble();
        
        // Calculating areas
        System.out.printf("The Area of the rectangle: %.2f\n", Rectangle.calcArea(rectangleLength, rectangleWidth));
        System.out.printf("The Area of the circle: %.2f\n", Circle.calcArea(circleRadius));
        System.out.printf("The Area of the triangle: %.2f\n", Triangle.calcArea(triangleBase, triangleHeight));

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
