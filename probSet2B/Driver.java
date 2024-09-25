import java.util.Scanner;

class Driver {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringTools sTools = new StringTools();
      
      
      System.out.println("lastLetter test cases:");
      System.out.println("Enter a word with at least one character: ");
      String answer1 = input.nextLine();
      System.out.println("The last letter is " + sTools.lastLetter(answer1));
      System.out.println("---------------------");
      

      System.out.println("format phone number");
      System.out.println("Enter your phone number: ");
      String phoneNumber = input.nextLine();
      System.out.println("The formatted phone number is " + sTools.formatPhoneNumber(phoneNumber));
      System.out.println("---------------------");


      System.out.println("middle three letters");
      System.out.println("Enter your word: ");
      String word = input.nextLine();
      System.out.println("The middle three letters are " + sTools.middleThree(word));
      System.out.println("---------------------");
      

      System.out.println("swap last two letters");
      System.out.println("Enter your word: ");
      String str = input.nextLine();
      System.out.println("The word after swapping the last two last is " + sTools.swapLastTwo(str));
      System.out.println("---------------------");
     
      System.out.println("front again");
      System.out.println("Enter your word: ");
      String str1 = input.nextLine();
      System.out.println("Enter how many letters: ");
      int num = input.nextInt();
      System.out.println("is front and back same: " + sTools.frontAgain(str1, num));
      System.out.println("---------------------");
   }
}