

public class curve
{
    public static void main () {
        StdDraw.setScale(0,500);
        
        for (int i = 0; i < 500; i +=25) {
            StdDraw.line(i,500,0,i);
        }
        
        
        for (int i = 0; i < 500; i +=25) {
            StdDraw.line(i,0,500,i);
        }
        
    }
}

