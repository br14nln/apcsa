

public class circle
{
    public static void main () {
        StdDraw.setScale(0,500);
        StdDraw.setPenRadius(0.015);
        for (int i = 1; i < 500; i +=20) {
            StdDraw.circle(250,250,i);
        }
        
        
        
    }
}

