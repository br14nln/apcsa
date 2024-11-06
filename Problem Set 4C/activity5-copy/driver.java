
import java.util.Scanner;
public class driver
{
   public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the message you want to decrypte?");
        String msg = sc.nextLine();
        System.out.println("what is the key?");
        int key = sc.nextInt();
        sc.nextLine();
        System.out.println("do you want to make your message all caps?");
        String caps = sc.nextLine();
        String decode = decoder.message(msg,key);
        if (caps.toLowerCase().equals("yes")) {
            decode = decode.toUpperCase();
            System.out.println(decode);
        }
        System.out.println("do you want to remove all your punctuation?");
        String remove = sc.nextLine();
        if (remove.toLowerCase().equals("yes")) {
            decode = decoder.removePunctuation(decode);
            System.out.println(decode);
        }
        System.out.println("Your final message is: " + decode);
   }
}
