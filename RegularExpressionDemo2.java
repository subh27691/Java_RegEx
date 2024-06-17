import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Write a regular expression to represent all mobile numbers.
1. Should contain exactly 10 digits.
2. The 1st digit should be 7 to 9. */

public class RegularExpressionDemo2 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[7-9][0-9]{9}");
        Matcher m=p.matcher("77909376030");
        if(m.find()&&m.group().equals("77909376030")){
            System.out.println("Valid number");
        }
        else System.out.println("Invalid number");
    }
    
}
