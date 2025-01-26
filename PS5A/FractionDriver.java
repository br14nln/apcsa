public class FractionDriver {
    public static void main(String [] args){
        fraction half = new fraction(1,2);
        fraction third = new fraction("1/3");
        fraction half2 = new fraction(half);
        fraction impfraction = new fraction(5,10);
        fraction pair = new fraction(252, 105);
        
        System.out.println(half);
        System.out.println(third);
        System.out.println(impfraction);
        System.out.println(pair);
    }
}