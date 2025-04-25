interface Shape{
    double getPerimeter();
}
class Rectangle implements Shape{
    double width;
    double length;

 Rectangle(double length,double width){
    this.width=width;
    this.length=length;
 }
 public double getPerimeter(){
    return 2*(length=width);}
}
class Circle implements Shape{
    double radius;
Circle (double radius){
    this.radius=radius;
}
public double getPerimeter(){
    return 2*Math.PI*radius; }
}
class Triangle implements Shape{
    double side1;
    double side2;
    double side3;
    
    Triangle(double s1,double s2 ,double s3){
        this.side1=s1;
        this.side2=s2;
        this.side3=s3;
    }
public double getPerimeter(){
    return side1+side2+side3; }
}
public class Shapes{
    public static void main(String[] args) {
        Shape rect= new Rectangle(6,8);
        Shape circle=new Circle(6);
        Shape tri=new Triangle(2,3,4);

        System.out.println("Rectangle Perimeter: " + rect.getPerimeter());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter());
    }
}
