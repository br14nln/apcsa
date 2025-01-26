public class fraction {
    private int top;
    private int bottom;
    
    public fraction(){
        top = 1;
        bottom = 1;
    }
    
    public fraction(int num, int denom){
        setNum(num);
        setDem(denom);
    }
    
    public fraction(String Fraction){
        if(Fraction.substring(Fraction.indexOf("/"), Fraction.length()).equals("0")){
            System.out.println("denominator cant be zero");
        } else {
        top = Integer.parseInt(Fraction.substring(0, Fraction.indexOf("/")));
        bottom = Integer.parseInt(Fraction.substring(Fraction.indexOf("/")+1, Fraction.length()));
    }
    }
    
    public fraction(fraction f){
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
            System.out.println("number cannot be zero");
        } else {
             bottom = d;
        }
    } 
    
    public void reduce(int a, int b){
        int factor = GCF(Math.abs(top), Math.abs(bottom));
        top/= factor;
        bottom /= factor;
    
    }
    
    private int GCF(int a , int b){
        if (a== b) return a;
        if(a>b) return GCF(a-b, b);
        else return GCF ( a, b-a);
    }
    
       public static fraction add(fraction f1, fraction f2) {
        int num = f1.top * f2.bottom + f2.top * f1.bottom;
        int den = f1.bottom * f2.bottom;
        return new fraction(num, den);
    }


    public static fraction subtract(fraction f1, fraction f2) {
        int num = f1.top * f2.bottom - f2.top * f1.bottom;
        int den = f1.bottom * f2.bottom;
        return new fraction(num, den);
    }

    public static fraction multiply(fraction f1, fraction f2) {
        int num = f1.top * f2.top;
        int den = f1.bottom * f2.bottom;
        return new fraction(num, den);
    }
    
    public static fraction division(fraction f1, fraction f2){
         if (f2.top == 0) {
            System.out.println("numerator for fraction 2 cannot be zero");
        }
        int num = f1.top * f2.bottom;
        int den = f1.bottom * f2.top;
        return new fraction(num, den);
    }

}  