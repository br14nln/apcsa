import java.util.ArrayList;
public class eratosthenes
{
    public static ArrayList<Integer> primenum(int n){
        ArrayList <Integer> l1 = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            l1.add(i);
        }
        int count = 0;
        int p;
        while(count < l1.size()){
            p = l1.get(count);
            for(int i = count + 1; i < l1.size(); i++){
                if(l1.get(i) % p == 0){
                    l1.remove(i);
                    i--;
                }
            }
            count++;        
        }
        return l1;
    }
}
