
public class Cylinder {
    double height;
    Circle base = new Circle();
    
    public Cylinder(){
        height = 1;
    }
    
    public Cylinder(double h){
        height = h;
    }
    
    public String toString(){
        return "Hello, I am a cylinder with a radius of " + base.getRadius();
    }
    
    public double getRadius(){
        return base.getRadius();
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getSurfaceArea() {
        return base.getArea()*2 + height*base.getCircumfrence();
    }
    public double getVolume() {
        return base.getArea()*height;
    }
}
