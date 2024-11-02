public class SierpinskiTriangle {

    public static void main(String[] args) {
        StdDraw.setScale(0, 1);
        
        OrderedPair vertexA = new OrderedPair(0.5, 0);      
        OrderedPair vertexB = new OrderedPair(0, 1);       
        OrderedPair vertexC = new OrderedPair(1, 1);      

        StdDraw.point(vertexA.getX(), vertexA.getY());
        StdDraw.point(vertexB.getX(), vertexB.getY());
        StdDraw.point(vertexC.getX(), vertexC.getY());

   
        double px = Math.random();
        double py = Math.random();
        
        StdDraw.line(vertexA.getX(), vertexA.getY(), vertexB.getX(), vertexB.getY());
        StdDraw.line(vertexC.getX(), vertexC.getY(), vertexB.getX(), vertexB.getY());
        StdDraw.line(vertexA.getX(), vertexA.getY(), vertexC.getX(), vertexC.getY());
        
        for (int i = 0; i < 10000; i++) {
            
            OrderedPair chosenVertex;
            int rand = (int) (Math.random() * 3); 
            if (rand == 0) {
                chosenVertex = vertexA;
            } else if (rand == 1) {
                chosenVertex = vertexB;
            } else {
                chosenVertex = vertexC;
            }

            
            px = (px + chosenVertex.getX()) / 2;
            py = (py + chosenVertex.getY()) / 2;

        
            StdDraw.point(px, py);
        }
    }
}

class OrderedPair{
    double x;
    double y;
    
    public OrderedPair()
    {
        x = 0;
        y = 0;
    }

    public OrderedPair(double x1, double y1)
    {
        x = x1;
        y = y1;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    
}
