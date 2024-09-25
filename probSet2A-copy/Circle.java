
/**
 Brian Lin
 AP CSA
 1-3
 Sept 23, 2025
 */
public class Circle extends driver
{
    double radius;
    
    public Circle() {
        //default constructor
        radius = 1;
    }
    
    public Circle(double r) {
        //paramaterized constructor
        radius = r;
    }
    
    //behavior method
    public String toString(){
        return "Hello, I am a circle with a radius of " + radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getCircumfrence() {
        return radius * 2 * Math.PI;
    }
    
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
