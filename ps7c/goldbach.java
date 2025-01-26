import java.util.ArrayList;
public class goldbach
{
     public static String pnum(int n){
         ArrayList <Integer> prime = new ArrayList<>();
         prime.addAll(eratosthenes.primenum(n));
         int n1 = 0;
         int n2 = 0;
         String ans;
         for(int i = 0; i < prime.size(); i++){
             for(int j = i; j < prime.size(); j++){
                 if(n == prime.get(i) + prime.get(j)){
                     n1 = prime.get(i);
                     n2 = prime.get(j);
                     break;
                 }
             }
         } 
         ans = String.valueOf(n1) + " + " + String.valueOf(n2);
         return ans;
     }
}
