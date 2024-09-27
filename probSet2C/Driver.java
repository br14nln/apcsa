import java.util.Scanner;

public class Driver
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        OrderedPair op = new OrderedPair();
        Formulas f = new Formulas();
        OrderedPair op1 = new OrderedPair(5,5);

        
        //quadratic
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c:");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        System.out.println(f.findQuadraticRoots(a,b,c));
        System.out.println();
        
        //slope
        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        OrderedPair p1 = new OrderedPair(x1,y1);
        OrderedPair p2 = new OrderedPair(x2,y2);
        System.out.println("A line between (" + p1.getX() + ", " + p1.getY() + ") and (" + p2.getX() + ", " + p2.getY() + ") has a slope of " + f.findSlope(p1,p2) + ".");
        System.out.println();
        
        //midpoint
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2) and (x2,y2)");
        System.out.print("x1: ");
        double x3 = sc.nextDouble();
        System.out.print("y1: ");
        double y3 = sc.nextDouble();
        System.out.print("x2: ");
        double x4 = sc.nextDouble();
        System.out.print("y2: ");
        double y4 = sc.nextDouble();
        OrderedPair p3 = new OrderedPair(x3,y3);
        OrderedPair p4 = new OrderedPair(x4,y4);
        System.out.println("A midpoint between (" + p3.getX() + ", " + p3.getY() + ") and (" + p4.getX() + ", " + p4.getY() + ") is " + f.findMidpoint(p3,p4) + ".");
        System.out.println();
        
        //arithmetic
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Numer of terms: ");
        int terms = sc.nextInt();
        System.out.print("Starts with: ");
        double startNum = sc.nextDouble();
        System.out.print("Increases with: ");
        double increase = sc.nextDouble();
        System.out.println("The sum of the first " + terms + " terms of an arithmetic series that starts with " +
        startNum + "  and increases by " + increase + " is " + f.findArithmeticSeriesSum(startNum, increase, terms));
        System.out.println();
        
        //geometric
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("first term:");
        int numTerm = sc.nextInt();
        System.out.print("Starts with: ");
        double start = sc.nextDouble();
        System.out.print("Increases with: ");
        double inc = sc.nextDouble();
        System.out.println("The sum of the first " + numTerm + " terms of an finite geometric series that starts with " +
        start + "  and increases by " + inc + " is " + f.findGeometricSeriesSum(start, inc, numTerm));
        System.out.println();
        
        //dice
        System.out.println("DICE ROLLER");
        System.out.print("How many sides does your die have? ");
        int s = sc.nextInt();
        System.out.println("Rolling a 20-sided die... you got a " + f.rollDie(s) + "!");
    }
}
