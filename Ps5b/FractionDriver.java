import java.util.Scanner;

public class FractionDriver {
    public static void main(String [] args){
        Scanner userAnswer = new Scanner(System.in);
        System.out.println();
        System.out.println("lets begin the fraction quiz, answer in lowest terms u got this brotha");
        String q1 = "";
        int numQ = 0;
        int correct = 0;
        
        while (!q1.equals("quit")) {
            Fraction q1f1 = new Fraction();
            Fraction q1f2 = new Fraction();
            
            System.out.print(q1f1 + " + " + q1f2 + " = ");
            Fraction correctAnswer1 = Fraction.add(q1f1, q1f2);
            correctAnswer1.reduce();
            
            q1 = userAnswer.nextLine();
            
            if (!q1.equals("quit")) {
                numQ += 1;
                Fraction q1F1 = new Fraction(q1);
                
                if(Fraction.equals(q1F1, correctAnswer1)){
                    System.out.println("yurrr u got that right brother");
                    System.out.println();
                    correct += 1;
                } else{
                    System.out.println("nah bruh its " + correctAnswer1);
                    System.out.println();
                }
            }
        }
        
        System.out.println("u got " + correct + " question(s) correct out of " + numQ);
    }
}