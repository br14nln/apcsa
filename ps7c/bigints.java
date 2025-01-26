import java.util.ArrayList;
public class bigints
{
    public static ArrayList<Integer> add(int n1, int n2){
        ArrayList<Integer> sum = new ArrayList<>();
        int greaterTen = 0;
        int d1 = 0;
        int d2 = 0;
        int sum1= 0;
        while(greaterTen > 0 || n1 > 0 || n2 > 0){
            d1 = n1%10;
            d2 = n2%10;
            
            n1 /= 10;
            n2 /= 10;
            
            sum1 = d1 + d2 + greaterTen;
            sum.add(0, sum1 % 10); 
            greaterTen = sum1/10;
        }
        return sum;
    } 
}


