
/**
 * Brian Lin
 * 1-3
 * sept 25th
 * probSet2B
 */
public class StringTools
{
    public String lastLetter (String str){
        return str.substring(str.length() -1, str.length());
    }
    
    public String formatPhoneNumber(String str1){
        return "(" + str1.substring(0,3) + ") " + str1.substring(3,6) + "-" + str1.substring(6);
    }
    
    public String middleThree (String str) {
        int len = (str.length()/2)-1;
        return str.substring(len, len+3);
    }
    
    public String swapLastTwo (String str) {
        int len  = str.length();
        return str.substring(0,len-2) + str.substring(len-1) + str.substring(len-2,len-1);
    }
    
    public boolean frontAgain (String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring(str.length()-n);
        return front.equals(back);
    }
}
