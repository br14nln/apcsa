
/**
 * Write a description of class Formulas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formulas
{
    public OrderedPair findQuadraticRoots (double a, double b, double c) {
        double insideSqrt = Math.pow(b,2) - (4*a*c);
        double add = ((((-1)*b) + Math.sqrt(insideSqrt))/(2*a));
        double sub = ((((-1)*b) - Math.sqrt(insideSqrt))/(2*a));
        return new OrderedPair(sub, add);
    }
    
    public double findSlope (OrderedPair A, OrderedPair B) {
        double m = (A.getY()-B.getY())/(A.getX()-B.getX());
        return m;
    }
    
    public OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double midX = (A.getX()+B.getX())/2;
        double midY = (A.getY()+B.getY())/2;
        return new OrderedPair(midX, midY);
    }
    
    public double findArithmeticSeriesSum (double a, double d, int k){
        double arithmeticSum = (k/2.0) * ((2*a) + (d*(k-1)));
        return arithmeticSum;
    }
    
    public double findGeometricSeriesSum (double a, double r, int k){
        double geometricSum = a*((1-Math.pow(r,k))/(1-r));
        return geometricSum;
    } 
    
    public int rollDie (int sides){
        int num = (int)(Math.random()*sides) + 1;
        return num;
    }

}
