class Shape {
    // Rectangle perimeter
    public double getPerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Triangle perimeter
    public double getPerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}

class Circle extends Shape {
    // Circle perimeter (circumference)
    public double getCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}

public class Perimeter {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();

        System.out.println("Perimeter of rectangle is: " + s.getPerimeter(3.2, 7.6));
        System.out.println("Perimeter of triangle is: " + s.getPerimeter(3.5, 7.8, 5.4));
        System.out.println("Perimeter of circle is: " + c.getCirclePerimeter(5.0));
    }
}
