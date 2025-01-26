
public class Fraction {
    private int top;
    private int bottom;
    
    public Fraction(){
        top = (int) (Math.random()*10);
        bottom = (int) (Math.random()*10)+1;
    }
    
    public Fraction(int num, int denom){
        setNum(num);
        setDem(denom);
    }
    
    public Fraction(String fracString){
        if(fracString.indexOf("/") == -1) {
            top = Integer.parseInt(fracString);
            bottom = 1;
        } else {
        
            if(fracString.substring(fracString.indexOf("/"), fracString.length()).equals("0")){
                System.out.println("denominator cant be zero bruh");
            } else {
            top = Integer.parseInt(fracString.substring(0, fracString.indexOf("/")));
            bottom = Integer.parseInt(fracString.substring(fracString.indexOf("/")+1, fracString.length()));
            }
        }
    }
    
    public Fraction(Fraction f){
        top = f.top;
        bottom = f.bottom;
    }
    
    public int getNum(){
        return top;
    }
    
    public int getDem(){
        return bottom;
    }
    
    public String toString(){
        return top + "/" + bottom;
    }
    
    public double toDouble(){
        return (double) top/bottom;
    }
    
      public void setNum(int n ){
        top = n;
    }
    
    public void setDem(int d){
        if(d == 0){
            System.out.println("number cant be zero");
        } else {
             bottom = d;
        }
    } 
    
    public void reduce(){
        int factor = GCF(Math.abs(top), Math.abs(bottom));
        top/= factor;
        bottom /= factor;
    
    }
    
    private int GCF(int a , int b){
        if (a== b) return a;
        if(a>b) return GCF(a-b, b);
        else return GCF ( a, b-a);
    }
    
    public static Fraction add(Fraction f1, Fraction f2) {
        int num = f1.top * f2.bottom + f2.top * f1.bottom;
        int den = f1.bottom * f2.bottom;
        return new Fraction(num, den);
    }

    public static Fraction subtract(Fraction f1, Fraction f2) {
        int num = f1.top * f2.bottom - f2.top * f1.bottom;
        int den = f1.bottom * f2.bottom;
        return new Fraction(num, den);
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        int num = f1.top * f2.top;
        int den = f1.bottom * f2.bottom;
        return new Fraction(num, den);
    }
    
    public static Fraction division(Fraction f1, Fraction f2){
         if (f2.top == 0) {
            System.out.println("fraction 2 numerator cannot be zero");
        }
        int num = f1.top * f2.bottom;
        int den = f1.bottom * f2.top;
        return new Fraction(num, den);
    }
    
    public static boolean equals(Fraction f1, Fraction f2) {
        return (f1.top * f2.bottom) == (f1.bottom * f2.top);
    }
}  