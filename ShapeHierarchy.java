abstract class Shape {

// Abstract method to calculate the area of the shape

public abstract double calculateArea();
}
class Circle extends Shape {
private double radius;
// Constructor to initialize the radius
public Circle(double radius) {
this.radius = radius;
}
// Implementation of the calculateArea method for circles
@Override
public double calculateArea() {
return Math.PI * radius * radius;
}
}
class Rectangle extends Shape {
private double length;
private double width;
// Constructor to initialize the length and width
public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
// Implementation of the calculateArea method for rectangles
@Override
public double calculateArea() {
return length * width;
}
}
public class ShapeHierarchy {
public static void main(String[] args) {
// Create instances of Circle and Rectangle
Circle circle = new Circle(5);
Rectangle rectangle = new Rectangle(4, 6);
// Calculate and display areas
System.out.println("Circle Area: " + circle.calculateArea());
System.out.println("Rectangle Area: " + rectangle.calculateArea());
}
}