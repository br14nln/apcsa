
/**
 Brian Lin
 AP CSA
 1-3
 Sept 23, 2025
 */
public class driver
{
    public static void main (String[] args) {
        //instantiation
        //circles
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        
        System.out.println(c1);
        System.out.println("getRadius() --> " + c1.getRadius() + " units.");
        System.out.println("getCircumfrenece() --> " + c1.getCircumfrence() + " units.");
        System.out.println("getArea() --> " + c1.getArea() + " units^2.");
        System.out.println();
        System.out.println(c2);
        System.out.println("getRadius() --> " + c2.getRadius() + " units.");
        System.out.println("getCircumfrenece() --> " + c2.getCircumfrence() + " units.");
        System.out.println("getArea() --> " + c2.getArea() + " units^2.");
        
        
        //cylinders
        Cylinder c3 = new Cylinder();
        Cylinder c4 = new Cylinder(5);
        
        
        System.out.println(c3);
        System.out.println("getRadius() --> " + c3.getRadius() + " units.");
        System.out.println("getHeight() --> " + c3.getHeight() + " units.");
        System.out.println("getSurfaceArea() --> " + c3.getSurfaceArea() + " units^2.");
        System.out.println("getVolume() --> " + c3.getVolume() + " units^2.");
        System.out.println();
        System.out.println(c4);
        System.out.println("getRadius() --> " + c4.getRadius() + " units.");
        System.out.println("getHeight() --> " + c4.getHeight() + " units.");
        System.out.println("getSurfaceArea() --> " + c4.getSurfaceArea() + " units^2.");
        System.out.println("getVolume() --> " + c4.getVolume() + " units^2.");
        
    }
}
